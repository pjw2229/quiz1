package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz/**")
public class QuizController {
	@PostMapping("/quiz1")
	public String QQ1(RedirectAttributes rttr) {
		rttr.addFlashAttribute("q1", "오늘은 금요일");
		return "redirect:/quiz/quiz1";
	}
}