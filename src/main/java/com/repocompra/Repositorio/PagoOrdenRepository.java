package com.repocompra.Repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repocompra.Modelo.PagoOrden;
import com.repocompra.dto.PagosDTO;


@Repository
public interface PagoOrdenRepository extends JpaRepository<PagoOrden,Long> {
	
	List<PagosDTO> findPagoBy();
	
	List<PagosDTO> findAllById(Long idOrden);
	

}
