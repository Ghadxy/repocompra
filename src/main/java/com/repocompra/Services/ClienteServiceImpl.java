package com.repocompra.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repocompra.Modelo.Cliente;
import com.repocompra.Repositorio.ClienteRepository;
import com.repocompra.dto.ClienteDTO;


@Service
public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	ClienteRepository repository;
	
	@Override
	public List<Cliente> findAll(){
		
		return repository.findAll();
	}
	
	//Implementacion View Cliente
	@Override
	public List<ClienteDTO> findClienteBy(){
		
		return repository.findClienteBy();
	}
	
}
