package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.IMoodService;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("moodService")
	private IMoodService service;
	
	public Mood mood;
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		mood = service.getCurrentMood();
		map.addAttribute("mood", mood);
		return "index";
	}
	
	@RequestMapping(value = "/reason")
	public String reasonPage(ModelMap map) {
		map.addAttribute("reason", mood);
		return "reasonpage";
	}
}
