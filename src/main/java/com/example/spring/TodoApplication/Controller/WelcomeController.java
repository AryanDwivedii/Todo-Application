package com.example.spring.TodoApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String goTowelcomePage(ModelMap model) {
		model.put("name", "Shiksha");
		return "welcome";
	}
	
}