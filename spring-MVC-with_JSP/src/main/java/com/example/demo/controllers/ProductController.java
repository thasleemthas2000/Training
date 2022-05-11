package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.*;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repos;
	
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addproduct";
		
		
	}
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		int rowAdded;
		try {
		rowAdded=this.repos.add(entity);
		
			return "success";		
		}catch(Exception e) {
			e.printStackTrace();
	return "failure";
	}
	
	}
	
	@RequestMapping(value="/product/srch",method=RequestMethod.GET)
	public String initsearchForm(Model model) {
		return "searchproduct";
			
	}
	@RequestMapping(value="/product/srch",method=RequestMethod.POST)
	public String searchProduct(@RequestParam("id")int id,Model model) {
		Product entity= repos.findById(id);
		model.addAttribute("found", entity);
		return "showproduct";
			
	}
	@RequestMapping(value= "/product/delete", method = RequestMethod.GET)
	public String initDeleteForm(Model model) {
			
			model.addAttribute("title","deleteProducts");
			
			return "find";
		}
	@RequestMapping(value= "/product/delete", method = RequestMethod.POST)

	public String deleteProduct(@RequestParam("id") int id,Model model) {
		
		int entity = repos.remove(id);

		model.addAttribute("delete",entity);
		return "delete";
	}
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String initIndexPage(Model model) {
		
		model.addAttribute("title","Product Management");
		
		return "index";
	}
}
