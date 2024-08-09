package com.repocompra.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repocompra.Modelo.Ordenes;
import com.repocompra.Services.OrdenesServices;

@RestController
@RequestMapping("api/ordenes")
public class OrdenesController {
	
	@Autowired
	OrdenesServices ordenesservice;
	
	@GetMapping("/all")
	public List<Ordenes> findAll(){
		
		return ordenesservice.findAll();
	}
	
	@GetMapping("/bycliente/{idCliente}")
	public List<Ordenes> findOrdenesbyCliente(@PathVariable Long idCliente){
		
		return ordenesservice.findAllById(idCliente);
		
	}
	
	@PostMapping("/guardar")
	public void insertarOrdenes(@RequestBody Ordenes ordenes) {
		
		ordenesservice.insertarordenes(ordenes);
	}

	@PutMapping("/actualizar")
	public void actualizarOrdenes(@RequestBody Ordenes ordenes) {
		
		ordenesservice.actualizarordenes(ordenes);
	}

}
