package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Farmacia;



@Controller									
public class FarmaciaController {
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	http://localhost:8080/ProyectoFarmacia/verFarmacia	
	@RequestMapping(path = "/verFarmacia", method = RequestMethod.GET)
	public ModelAndView verFarmacia() {
		
		Farmacia miFarmacia = new Farmacia();
		miFarmacia.setNombre("DR AHORRO");
		miFarmacia.setTelefono("011-4338-5800");
		miFarmacia.setDiaDeTurno("Viernes");
		
		ModelMap modelo = new ModelMap();
		modelo.put("clave", miFarmacia);
		
		return new ModelAndView("Farmacia/farmacia",modelo);
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//	EJERCICIO LISTAR OBJETOS EN UNA TABLA, DESDE EL CONTROLADOR A LA VISTA
	
//	http://localhost:8080/ProyectoFarmacia//mostrarTabla/7
	@RequestMapping(path = "/mostrarTabla/{cantidad}", method = RequestMethod.GET)
	public ModelAndView mostrarTabla(@PathVariable Integer cantidad) {
		
		List<Farmacia> listaFarma = new ArrayList<Farmacia>();

		for (int i = 0; i < cantidad; i++) {
			listaFarma.add(new Farmacia("Farmacity","4338-1111", "Lunes"));
		}

		ModelMap model = new ModelMap();
		model.addAttribute("keyModel", listaFarma);
		
		return new ModelAndView("Farmacia/listado",model);
		
		
	}
	
	
}	// fin controller
