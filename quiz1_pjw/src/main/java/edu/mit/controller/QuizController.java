package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz/**")
public class QuizController {
	@GetMapping("/quiz1")
	public void QQ1(Model m) {
		m.addAttribute("q1", "오늘은 금요일");
	}
}