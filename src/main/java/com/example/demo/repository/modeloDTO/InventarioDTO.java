package com.example.demo.repository.modeloDTO;

public class InventarioDTO {
	private String nombre;
	private String codigoBarrasMaestro;
	private String categoria;
	private Integer numero;
	private String direccion;
	private String telefono;
	
	
	public InventarioDTO() {
		
	}
	
	
	public InventarioDTO(String nombre, String codigoBarrasMaestro, String categoria, Integer numero, String direccion,
			String telefono) {
		super();
		this.nombre = nombre;
		this.codigoBarrasMaestro = codigoBarrasMaestro;
		this.categoria = categoria;
		this.numero = numero;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}


	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
