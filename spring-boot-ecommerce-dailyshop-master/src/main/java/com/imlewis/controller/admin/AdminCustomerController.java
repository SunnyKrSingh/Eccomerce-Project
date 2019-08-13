package com.imlewis.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imlewis.model.AppUser;
import com.imlewis.service.CustomerService;

@Controller
@RequestMapping("/admin/cu")
public class AdminCustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/m")
    public String customerManagement(Model model){
        List<AppUser> customerList = customerService.getAllCustomer();
        model.addAttribute("customerList", customerList);

        return "admin/customerManagement";
    }
    
    @RequestMapping("/d")
    public String removeCustomer(@RequestParam(value="id", required=true) Long customerId){
    	customerService.delete(customerId);
    	return "redirect:/admin/cu/m";
    }
    
    @RequestMapping("/e")
    public String enableCustomer(@RequestParam(value="id", required=true) Long customerId){
    	AppUser appUser = customerService.findOne(customerId);
    	appUser.setEnabled(true);
    	customerService.save(appUser);
    	return "redirect:/admin/cu/m";
    }
    
    @RequestMapping("/ds")
    public String disableCustomer(@RequestParam(value="id", required=true) Long customerId){
    	AppUser appUser = customerService.findOne(customerId);
    	appUser.setEnabled(false);
    	customerService.save(appUser);
    	return "redirect:/admin/cu/m";
    }
}
