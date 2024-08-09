package com.repocompra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repocompra.Modelo.DetalleOrden;
import com.repocompra.Repositorio.DetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {
	@Autowired
	DetalleOrdenRepository repository;

	@Override
	public DetalleOrden actualizardetalleorden(DetalleOrden ordenes) {
		
		return repository.save(ordenes);
	}
	
	

}
