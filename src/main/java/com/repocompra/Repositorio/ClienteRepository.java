package com.repocompra.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repocompra.Modelo.Cliente;
import com.repocompra.dto.ClienteDTO;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
	
	//View Datos Cliente
	List<ClienteDTO> findClienteBy();

}
