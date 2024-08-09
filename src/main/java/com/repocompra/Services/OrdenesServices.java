package com.repocompra.Services;

import java.util.List;


import com.repocompra.Modelo.Ordenes;

public interface OrdenesServices  {
	
	
	List<Ordenes> findAll();
	
	//Filtrar por Cliente
	List<Ordenes> findAllById(Long idCliente);
	
	// Guardar una orden 
    Ordenes insertarordenes (Ordenes ordenes);
    
	// Actualizar una orden 
    Ordenes actualizarordenes (Ordenes ordenes);



}
