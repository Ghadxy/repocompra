package com.repocompra.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repocompra.Modelo.DetalleOrden;
import com.repocompra.Services.DetalleOrdenService;

@RestController
@RequestMapping("api/detalles")
public class DetalleOrdenController {
	
	@Autowired
	DetalleOrdenService detalleservice;
	
	@PutMapping("/actualizar")
	public void actualizarOrdenes(@RequestBody DetalleOrden ordenes) {
		
		detalleservice.actualizardetalleorden(ordenes);
	}

}
