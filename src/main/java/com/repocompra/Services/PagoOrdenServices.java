package com.repocompra.Services;

import java.util.List;


import com.repocompra.Modelo.PagoOrden;
import com.repocompra.dto.PagosDTO;

public interface PagoOrdenServices {
	List<PagoOrden> findAll();
	List<PagosDTO> findPagoBy();
	List<PagosDTO> findAllById(Long idOrden);
	
	PagoOrden insertarPago (PagoOrden pagos);
	
	
}
