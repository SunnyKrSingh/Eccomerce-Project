package com.ecm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecm.entity.AppUser;
import com.ecm.service.EmailSenderService;
import com.ecm.service.IAppUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IAppUserService customerService;
	@Autowired
	private EmailSenderService emailSenderService;

	@Autowired
	private IAppUserService appService;

	public void setToSession(HttpServletRequest request, AppUser au) {
		request.getSession().setAttribute("customerName_", au.getUserName());
		request.getSession().setAttribute("customerId_", au.getUserId());
		// request.getSession().setAttribute("cartId_", customer.getCart().getCartId());
	}

	@GetMapping("/registerpage")
	public String registerPage(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		// if user already login, then redirect to home page.
		if (session.getAttribute("customerName_") != null) {
			return "redirect:/";
		}
		AppUser user = new AppUser();
		model.addAttribute("user", user);
		return "account";
	}

	@PostMapping("/register")
	public String registerCustomerPost(@Valid @ModelAttribute("user") AppUser user, BindingResult result,
			HttpServletRequest request, Model model, RedirectAttributes attributes) {
		System.out.println("UserController.registerCustomerPost() and user is :: " + user);
		HttpSession session = request.getSession();
		// if user already login, then redirect to home page.
		if (session.getAttribute("customerName_") != null) {
			return "redirect:/";
		}

		if (result.hasErrors()) {
			System.out.println(
					"inside error:: count " + result.getErrorCount() + "errors desc:: " + result.getAllErrors());
			return "";
		}
		if (customerService.findByEmail(user.getEmail()) != null) {
			model.addAttribute("email_exists", "Email already exist!");
			return "registerCustomer";
		}

		customerService.save(user);
		AppUser appUser = customerService.findByEmail(user.getEmail());

		Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
		SecurityContextHolder.getContext().setAuthentication(authentication);

		setToSession(request, appUser);

		emailSenderService.sendActiveCode(appUser);

		model.addAttribute("title", "Register Successful!");
		model.addAttribute("msg", "The active code has been sent to your Email box. Please check it out.");
		// return "processSuccess";
		return "redirect:/user/registerpage";
	}

	@RequestMapping(value = "/rg/{codeStr}", method = RequestMethod.GET)
	public String activeAccount(@PathVariable String codeStr, Model model) {

		customerService.activeAccount(codeStr);

		model.addAttribute("title", "Congratulation!");
		model.addAttribute("msg", "Your Account has been actived!<strong>Please Logout and Login again!</strong>");

		return "processSuccess";
	}

	@GetMapping("/myaccount")
	public String onAccount(Model model) {
		return "account";
	}
}
