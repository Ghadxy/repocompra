package com.repocompra.Services;

import java.util.List;

import com.repocompra.Modelo.Cliente;
import com.repocompra.dto.ClienteDTO;

public interface ClienteService {
	List<Cliente> findAll();
	
	//Services para View Clientes
	List<ClienteDTO> findClienteBy();
	
}
