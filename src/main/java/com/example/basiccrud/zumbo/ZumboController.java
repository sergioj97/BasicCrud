package com.example.basiccrud.zumbo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/zumbos")
public class ZumboController {
	
	@GetMapping("/lista")
	public String mostrarPantallaListaZumbos(Model model) {
		return "template_lista_zumbos";
	}
	
	@GetMapping("/detalles/{id}")
	public String mostrarPantallaDetallesZumbo(Model model, @PathVariable long id) {
		return "template_lista_zumbos";
	}
	
	@GetMapping("/crear")
	public String mostrarPantallaCrearZumbo(Model model) {
		return "template_crear_zumbo";
	}

}
