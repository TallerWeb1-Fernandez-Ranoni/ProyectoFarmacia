package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Farmacia;



@Controller									
public class FarmaciaController {
	
	
//	http://localhost:8080/ProyectoFarmacia/verFarmacia	
	@RequestMapping(path = "/verFarmacia", method = RequestMethod.GET)
	public ModelAndView verFarmacia() {
		
		Farmacia miFarmacia = new Farmacia();
		miFarmacia.setNombre("DR AHORRO");
		miFarmacia.setTelefono("011-4338-5800");
		miFarmacia.setDiaDeTurno("Viernes");
		
		ModelMap modelo = new ModelMap();
		modelo.put("clave", miFarmacia);
		
		return new ModelAndView("Farmacia",modelo);
	}
	
	
//	EJERCICIO LISTAR OBJETOS EN UNA TABLA, DESDE EL CONTROLADOR A LA VISTA
	
//	http://localhost:8080/ProyectoFarmacia/listar
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		List<Farmacia> listaFarma = new ArrayList<Farmacia>();
		
		listaFarma.add(new Farmacia("Farmacity","4338-1111", "Lunes"));
		listaFarma.add(new Farmacia("Dr Ahorro","4338-2222", "Miercoles"));
		listaFarma.add(new Farmacia("ABC","4338-3333", "Viernes"));
	
		ModelMap model = new ModelMap();
		model.addAttribute("keymodel", listaFarma);
		
		return new ModelAndView("listado",model);
		
		
	}
	
	
}	// fin controller
