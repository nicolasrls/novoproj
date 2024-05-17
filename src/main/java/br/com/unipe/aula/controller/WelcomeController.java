package br.com.unipe.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String welcome() {
        return "formulario";
    }
	
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("nome") String nome, @RequestParam("time") String time) {
        ModelAndView modelAndView = new ModelAndView("timee");
        modelAndView.addObject("nome", nome);
        modelAndView.addObject("time", time);
        return modelAndView;
    }
	
}