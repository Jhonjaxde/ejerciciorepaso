package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
	@SequenceGenerator(name = "seq_inventario", sequenceName = "seq_inventario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inventario")
	@Id
	@Column(name = "inve_id")
	private Integer id;
	@Column(name = "inve_cantidad")
	private Integer cantidad;
	
	
	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega bodega;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	
	
	
}
