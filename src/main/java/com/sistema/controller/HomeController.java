package com.sistema.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sistema.entity.Persona;
import com.sistema.service.PersonaService;

@Controller
public class HomeController {

	@Resource
	PersonaService personaService;
	
    @RequestMapping("/personas")
    public String showPersona(Model model, @RequestParam("search") String search){
    	
    	List<Persona> personas = null;	
    	if (search != null) {
    		personas = personaService.searchPersona(search);
    	} else {
    		personas = personaService.findAll();
    	}
    	model.addAttribute("personas",personas);
        return "/persona/showPersona";
    }
           
    @RequestMapping("/persona/create")
    public String createPersona(){
        return "/persona/createPersona";
    }
    
    @RequestMapping(value="/persona/add", method=RequestMethod.POST)
    public String addPersona(Persona persona){
    	System.err.println("persona: " + persona.getNombre());
        return "/index1";
    }
    
    @RequestMapping(value="/persona/update", method=RequestMethod.PUT)
    public String updatePersona(Persona persona){
    	System.err.println("persona: " + persona.getNombre());
        return "/index1";
    }


}
