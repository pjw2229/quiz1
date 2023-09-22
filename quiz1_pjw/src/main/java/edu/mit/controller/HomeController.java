package edu.mit.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale l, Model m) {
		logger.info("Welcome home! The client locale is {}.", l);
		m.addAttribute("serverTime", DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, l).format(new Date()));
		
		return "home";
	}	
}