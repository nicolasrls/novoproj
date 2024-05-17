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
    public ModelAndView submitForm(@RequestParam("dolar") double dolar) {
        ModelAndView modelAndView = new ModelAndView("conversao");
        double Conversao = dolar*(5);
        modelAndView.addObject("dolar", dolar);
        modelAndView.addObject("real", Conversao);
        return modelAndView;
    }
	
}