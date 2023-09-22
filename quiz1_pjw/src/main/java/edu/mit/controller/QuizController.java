package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.domain.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/quiz/**")
@Log4j
public class QuizController {
	@GetMapping("/quiz1")
	public void friday(Model m) {
		m.addAttribute("q1", "오늘은 금요일");
	}
	
	@GetMapping("/quiz2")
	public void gotoQuiz2() {
		
	}
	
	@PostMapping("/quiz2")
	public String theQuiz2(TwoVO vo, RedirectAttributes rttr) {
		MyLogic3 m3 = new MyLogic3();
		rttr.addFlashAttribute("sum", m3.addUp(vo.getNum1(), vo.getNum2()));
		return "redirect:/quiz/result";
	}
}