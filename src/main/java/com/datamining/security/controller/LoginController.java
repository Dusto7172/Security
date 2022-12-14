package com.datamining.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomePage");
		return model;
	}

//	@RequestMapping("/submitForm")
//	public String submitForm(@ModelAttribute("reservation") Reservation res) {
//		return "confirmation-form";
//	}

	@RequestMapping(value = { "/homePage" }, method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("homePage");
		return model;
	}

	@RequestMapping(value = { "/filterPage" }, method = RequestMethod.GET)
	public ModelAndView filterPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("filterPage");
		return model;
	}

//	@RequestMapping(value = { "/reservation"}, method = RequestMethod.GET)
//	public ModelAndView reservation() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("reservation");
//		return model;
//	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out successfully.");
		}

		model.setViewName("loginPage");
		return model;
	}
}
