package com.repocompra.Repositorio;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repocompra.Modelo.Ordenes;


@Repository
public interface OrdenesRepository extends JpaRepository<Ordenes,Long>{

	List<Ordenes> findAllById(Long idCliente);

}
