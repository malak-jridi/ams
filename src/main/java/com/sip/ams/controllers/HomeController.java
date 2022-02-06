package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList; // import the ArrayList class


@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info(Model model) {
		String formation = "FullStack";
		ArrayList<String> values = new ArrayList<String>(); // Create an ArrayList object
		values.add("OCP");
		values.add("OCA");
		values.add("Spring");
		values.add("Angular");

		System.out.println("méthode info");
		model.addAttribute("workshop", formation);
		model.addAttribute("vals", values);

		
		return "home/info";
	}
	
	@RequestMapping("/affiche")
	public String affiche() {
		return "home/affiche";
	}

}
