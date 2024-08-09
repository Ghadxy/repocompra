package com.repocompra.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repocompra.Modelo.PagoOrden;
import com.repocompra.Services.PagoOrdenServices;
import com.repocompra.dto.PagosDTO;

@RestController
@RequestMapping("api/pagos")
public class PagoOrdenController {
	
	@Autowired
	PagoOrdenServices pagoservice;
	
	@GetMapping("/all")
	public List<PagosDTO> findAll(){
		
		return pagoservice.findPagoBy();
	}
	
	@GetMapping("/byorden/{idOrden}")
	public List<PagosDTO> findPagobyCliente(@PathVariable Long idOrden){
		
		return pagoservice.findAllById(idOrden);
	}
	
	@PostMapping("/guardar")
	public void insertarPago(@RequestBody PagoOrden pagos) {
		
		pagoservice.insertarPago(pagos);
	}


}
