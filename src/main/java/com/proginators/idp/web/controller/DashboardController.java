package com.proginators.idp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@RequestMapping(method={RequestMethod.GET,RequestMethod.POST})
	public String show(Model model){
		model.addAttribute("attr1", "From Server Side Model");
		return "home";	
	}
}
