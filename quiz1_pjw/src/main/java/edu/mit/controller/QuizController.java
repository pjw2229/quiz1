package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.domain.TwoVO;

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
	
	@PostMapping("/quiz2")
	public String theQuiz2(int num1, int num2, RedirectAttributes rttr) {
		TwoVO two = new TwoVO();
		two.setNum1(num1);
		two.setNum2(num2);
		rttr.addFlashAttribute("n1", two.getNum1());
		rttr.addFlashAttribute("n2", two.getNum2());
		return "redirect:/quiz/quiz2";
	}
}