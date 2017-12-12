package be.vdab.groenetenenboot.controllers;

import be.vdab.groenetenenboot.services.WerknemerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/werknemers")
public class WerknemerController {

	private final static String VIEW = "werknemer";
	private final WerknemerService werknemerService;

	public WerknemerController(WerknemerService werknemerService) {
		this.werknemerService = werknemerService;
	}

	@GetMapping("{id}")
	public ModelAndView read(@PathVariable long id) {
		ModelAndView modelAndView = new ModelAndView(VIEW);
		werknemerService.read(id).ifPresent(werknemer -> modelAndView.addObject(werknemer));
		return modelAndView;
	}
}
