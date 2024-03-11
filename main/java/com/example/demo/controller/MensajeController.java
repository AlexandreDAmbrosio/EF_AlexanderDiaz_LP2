package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensajeController {

	@GetMapping("/registrado")
	public String Mensaje(Model model) {
		return "registrado";
	}
}
