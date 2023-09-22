package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import edu.mit.service.QuizService;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/quiz/**")
@Log4j
public class QuizController {
	QuizService service;
	
	@GetMapping("/quiz1")
	public void friday(Model m) {
		m.addAttribute("q1", "오늘은 금요일");
	}
	
	@GetMapping("/quiz2")
	public void gotoQuiz2() {
		
	}
	
	@GetMapping("/result")
	public void res() {
		
	}
	
	@PostMapping("/quiz2")
	public String theQuiz2(TwoVO vo, Model m) {
		m.addAttribute("sum", service.allsum(vo));
		
		
		return "quiz/result";
	}
}