package com.repocompra.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repocompra.Modelo.Ordenes;

import com.repocompra.Repositorio.OrdenesRepository;


@Service
public class OrdenesServicesImpl implements OrdenesServices {

	@Autowired
	OrdenesRepository repository;
	
	@Override
	public List<Ordenes> findAll(){
		
		return repository.findAll();
		
	}
	
	@Override
	public List<Ordenes> findAllById(Long idCliente){
		
		return repository.findAllById(idCliente);
		
	}

	@Override
	public Ordenes insertarordenes(Ordenes ordenes) {
		return repository.save(ordenes);
	}

	@Override
	public Ordenes actualizarordenes(Ordenes ordenes) {

		return repository.save(ordenes);
	}
	
	
	
	
}
