package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	public ModelAndView main(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DBOMain");
		return mv;
	}
}
