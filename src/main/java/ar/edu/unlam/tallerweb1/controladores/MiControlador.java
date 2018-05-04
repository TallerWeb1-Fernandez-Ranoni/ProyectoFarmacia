package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiControlador {
	
	@RequestMapping(path = "/saludar", method = RequestMethod.GET)
	public ModelAndView saludar() {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("sal", "Hola ke asee!");
		
		return new ModelAndView("saludo",modelo);
	}
	
	
	@RequestMapping(path = "/saludar2", method = RequestMethod.GET)
	public ModelAndView saludar2(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido) {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("nom", nombre);
		modelo.put("ape", apellido);
		
		return new ModelAndView("saludoConRequestParam",modelo);
	}
	
	
	@RequestMapping(path = "/saludar3/{nombre}/{apellido}", method = RequestMethod.GET)
	public ModelAndView saludar(@PathVariable String nombre, @PathVariable String apellido) {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("nom", nombre);
		modelo.put("ape", apellido);
		
		return new ModelAndView("saludoConPathVariable",modelo);
	}
	
	
}
