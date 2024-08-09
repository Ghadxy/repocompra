package com.repocompra.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repocompra.Modelo.DetalleOrden;


@Repository
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden,Long>{
	
}
