package com.example.basiccrud.zumbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/zumbos")
public class ZumboController {
	
	@Autowired
	private ZumboRepository repositorio_zumbos;
	
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
	
	@PostMapping("/crear")
	public String mostrarPantallaCrearZumbo(Model model, @RequestParam String input_nombre, @RequestParam Integer input_bibis) {
		Zumbo nuevo_zumbo = new Zumbo(input_nombre, input_bibis);
		repositorio_zumbos.save(nuevo_zumbo);
		
		return "redirect:/zumbos/lista";
	}

}
