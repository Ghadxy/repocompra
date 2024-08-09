package com.repocompra.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repocompra.Modelo.PagoOrden;
import com.repocompra.Repositorio.PagoOrdenRepository;
import com.repocompra.dto.PagosDTO;

@Service
public class PagoOrdenServicesImpl implements PagoOrdenServices{

	@Autowired
PagoOrdenRepository repository;
	
	@Override
	public List<PagoOrden> findAll(){
		
		return repository.findAll();
	}
	
	@Override
	public List<PagosDTO> findPagoBy(){
		
		return repository.findPagoBy();
	}

	@Override
	public List<PagosDTO> findAllById(Long idOrden) {
		// TODO Auto-generated method stub
		return repository.findAllById(idOrden);
	}

	@Override
	public PagoOrden insertarPago(PagoOrden pagos) {
		
		return repository.save(pagos);
	}

	
	
}
