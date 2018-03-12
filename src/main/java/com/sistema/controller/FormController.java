package com.sistema.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	private static final Log LOGGER = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/index1")
	public String index1() {
		LOGGER.info("METHOD: index1()");
		return "index1";
	}

	@GetMapping("/index2")
	public String index2() {
		LOGGER.info("METHOD: index2()");
		return "index2";
	}

	@GetMapping("/index3")
	public String index3() {
		LOGGER.info("METHOD: index3()");
		return "index3";
	}

	@RequestMapping("/form")
	public String form() {
		LOGGER.info("METHOD: form()");
		return "form";
	}

	@RequestMapping("/form_advanced")
	public String formAdvanced() {
		LOGGER.info("METHOD: form_advanced()");
		return "form_advanced";
	}
}
