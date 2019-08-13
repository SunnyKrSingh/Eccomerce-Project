package com.ecm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecm.entity.ProductEntity;
import com.ecm.service.ProductEntityService;

@Controller
public class MainController {
	
	@Autowired
	private ProductEntityService productService;
	
	public MainController() {
		System.out.println("MainController.MainController()");
	}

	@GetMapping("/")
	public String onBoardPage(Model model) {
		List<ProductEntity> productList = productService.findAll();
		model.addAttribute("productList", productList);
		System.out.println("MainController.onBoardPage()");
		model.addAttribute("msg", "welocme");
		return "index";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}

