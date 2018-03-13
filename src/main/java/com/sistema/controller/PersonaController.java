package com.sistema.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.entity.Persona;
import com.sistema.service.PersonaService;
import com.sistema.utils.Pager;

@Controller
public class PersonaController {

	private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    private static final int[] PAGE_SIZES = {5, 10, 20};
	
	
	@Resource
	PersonaService personaService;
	
//    @RequestMapping("/personas")
//    public String showPersona(Model model){
//    	List<Persona> personas = personaService.findAll();
//    	model.addAttribute("personas",personas);
//        return "/persona/showPersona";
//    }
	
	@GetMapping("/personas")
    public ModelAndView showPersonsPage(@RequestParam("pageSize") Optional<Integer> pageSize,
                                        @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("/persona/showPersona");

        // Evaluate page size. If requested parameter is null, return initial page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;

        Page<Persona> personas = personaService.findAllPageable(new PageRequest(evalPage, evalPageSize));
        Pager pager = new Pager(personas.getTotalPages(), personas.getNumber(), BUTTONS_TO_SHOW);

        modelAndView.addObject("personas", personas);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }
           
    //Ajax search person by DNI-Nombre ó Apellidos.
    @RequestMapping(value = "/personas/search/{search}", method=RequestMethod.GET)
    public String searchPersona(Model model, @PathVariable("search") String search){
    	List<Persona> personas = personaService.searchPersona(search);    	
    	model.addAttribute("personas",personas);
        return "/persona/showPersona :: personas-fragment";
    }
    
    //Muestra el formulario para crear personas.
    @RequestMapping("/persona/create")
    public String createPersona(){
        return "/persona/createPersona";
    }
    
    //Pegada POST para Guardar Personas.
    @RequestMapping(value="/persona/add", method=RequestMethod.POST)
    public String addPersona(Persona persona){
    	return "/persona/showPersona";
    }
    
    @RequestMapping(value="/persona/update", method=RequestMethod.PUT)
    public String updatePersona(Persona persona){
    	System.err.println("persona: " + persona.getNombre());
        return "/persona/showPersona";
    }

}
