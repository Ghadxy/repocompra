package com.repocompra.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repocompra.Services.ClienteService;
import com.repocompra.dto.ClienteDTO;


@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService Clienteservice;
	
	// View Clientes
	
	@GetMapping("/all")
	public List<ClienteDTO> findAllClientes(){
		
		return Clienteservice.findClienteBy();
	}
	

}
