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
	
//	http://localhost:8080/ProyectoFarmacia/saludar
	@RequestMapping(path = "saludar", method = RequestMethod.GET)
	public ModelAndView saludar() {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("sal", "Hola ke asee!");
		
		return new ModelAndView("saludo",modelo);
	}
	
	
//	http://localhost:8080/ProyectoFarmacia/saludar2?nombre=Lalo&apellido=Landa
	@RequestMapping(path = "/saludar2", method = RequestMethod.GET)
	public ModelAndView saludar2(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido) {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("nom", nombre);
		modelo.put("ape", apellido);
		
		return new ModelAndView("saludoConRequestParam",modelo);
	}
	
//	http://localhost:8080/ProyectoFarmacia/saludar3/Diego/Maradona
	@RequestMapping(path = "/saludar3/{nombre}/{apellido}", method = RequestMethod.GET)
	public ModelAndView saludar(@PathVariable String nombre, @PathVariable String apellido) {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("nom", nombre);
		modelo.put("ape", apellido);
		
		return new ModelAndView("saludoConPathVariable",modelo);
	}
	
	
	
	
//	5) 	Usando path variables, hacer un action que reciba una operación y sus dos operandos y que lleve a una vista
//	que muestra la siguiente frase “El resultado de s umar 3 y 6 da 9 ”. En caso que no pueda realizarse la operación
//	se debe llevar a otra vista diferente donde se muestra un mensaje descriptivo.
	
	
//	http://localhost:8080/ProyectoFarmacia/sumar/5/2
	@RequestMapping(path = "/{operacion}/{operador1}/{operador2}", method = RequestMethod.GET)
	public ModelAndView calcular(@PathVariable String operacion, @PathVariable Integer operador1, @PathVariable Integer operador2) {		
		
		ModelMap modelo = new ModelMap();
		modelo.put("keyoperacion", operacion);
		modelo.put("keyope1",operador1);
		modelo.put("keyope2", operador2);
		
		switch(operacion) {
		
		case "sumar":
			modelo.put("keyresul", operador1 + operador2); 
			break;
		
		case "restar":
			modelo.put("keyresul", operador1 - operador2);
			break;
		
		case "multiplicar":
			modelo.put("keyresul", operador1 * operador2);
			break;
			
		case "dividir":
			try 			// en caso de dividir por cero
			{ 
				modelo.put("keyresul", operador1 / operador2); 
			}
			 
			 catch(ArithmeticException excepcion) 
			{
				 modelo.put("keyerror",excepcion);
				 return new ModelAndView("errorEnOperador",modelo);
			 }
			
			break;
			
		default: 
			return new ModelAndView("errorDeOperacion",modelo);
			
		}
		
		return new ModelAndView("calcular",modelo);
		
	}
	
	
	
}
