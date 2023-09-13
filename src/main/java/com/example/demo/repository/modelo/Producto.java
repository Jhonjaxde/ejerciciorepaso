package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "producto")
public class Producto {
	
	@SequenceGenerator(name="seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_producto")
	@Id
	@Column(name = "prod_id")
	private Integer id;
	@Column(name = "prod_nombre")
	private String nombre;
	@Column(name = "prod_codigoBarrasMaestro")
	private String codigoBarrasMaestro;
	@Column(name = "prod_categoria")
	private String categoria;
	@Transient
	@Column(name = "prod_stock")
	private Integer stock;
	
	@OneToMany(mappedBy = "producto",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Inventario> inventarios;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<Inventario> getInventarios() {
		return inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}


	
}
