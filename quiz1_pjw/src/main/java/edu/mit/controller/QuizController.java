package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz/**")
public class QuizController {
	@GetMapping("/quiz1")
	public void friday(Model m) {
		m.addAttribute("q1", "오늘은 금요일");
	}
	
	@GetMapping("/quiz2")
	public void gotoQuiz2() {
		
	}
}