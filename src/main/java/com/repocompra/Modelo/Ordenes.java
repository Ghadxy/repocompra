package com.repocompra.Modelo;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name="t_Ordenes")
@Data
public class Ordenes {
	
	@Id
	@Column(name="idOrden")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fechaOrden;

	private int estado;
	@ManyToOne (fetch = FetchType.LAZY,optional=true)
	@JoinColumn(
			name= "idCliente",
			referencedColumnName= "idCliente"
			
			)
	@JsonBackReference
    private Cliente cliente;
	
	@OneToMany
	(   mappedBy="ordenes",
		fetch = FetchType.EAGER,
		cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<DetalleOrden> detalles =new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<DetalleOrden> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetalleOrden> detalles) {
		this.detalles = detalles;
	}

	

}
