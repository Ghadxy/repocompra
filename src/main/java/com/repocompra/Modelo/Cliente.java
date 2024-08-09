package com.repocompra.Modelo;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="t_Cliente")
public class Cliente {

	@Id
	@Column(name="idCliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	private String nombres;
	
	private String apellidos;


	private String correo;

	private String telefono;


	private String dni;

	private String direccion;

	private int estado;
	
	@OneToMany
	(   mappedBy="cliente", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Ordenes> ordenes =new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Set<Ordenes> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Set<Ordenes> ordenes) {
		this.ordenes = ordenes;
	}
	
	

}
