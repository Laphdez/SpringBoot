package com.openWebinars.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	// Prueba 2 de hola mundo
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	/**
	 * Poniendo en el navegador localhost:9009/index
	 * Se observa el mensaje que recoge el index.html
	 * @param model
	 * @return index.html
	 */
	@GetMapping("/index")
	public String welcome(Model model) {
		model.addAttribute("mensaje", "Hola mundo prueba 3 de hola mundo");
		return "index";
	}
	
	@GetMapping("/saludo")
	public String saludoCompleto(@RequestParam("name") String name, Model model) {
		//model.addAttribute("saludo", "Hola mundo prueba 4 de hola mundo con saludoCompleto");
		model.addAttribute("nombre", name);
		return "saludo";
	}
	

	@GetMapping("/saludo2")
	public String saludo2(@RequestParam("name") Optional<String> name, Model model) {
		model.addAttribute("nombre", name.orElse("Mundo"));
		return "saludo";
	}
	
	@GetMapping("/saludoNombreApellido")
	public String saludoNombreApellido(@RequestParam("name") String name, @RequestParam("lastName") String lastName, Model model) {
		String nombreCompleto = name + ' ' + lastName;
		model.addAttribute("nombreCompleto", nombreCompleto);
		return "saludo";
	}
	
	@GetMapping("/saludo/{name}")
	public String saludo3(@PathVariable String name, Model model) {
		model.addAttribute("saludo", "Hola " + name);
		return "saludo";
	}
	
	@GetMapping("/saludo/{name}/{lastName}")
	public String saludoNombreApellido2(@PathVariable String name, @PathVariable String lastName, Model model) {
		model.addAttribute("saludo", "Hola " + name + ' ' + lastName);
		return "saludo";
	}
	
	@GetMapping("/que")
	public String queSeDedica(Model model) {
		model.addAttribute("que", "Se dedican a venta y compra");
		return "que";
	}
	
	@GetMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("contacto", "Dirección, telefono...");
		return "contacto";
	}
}
