package com.example.demo.repository.modelo;

public class InventarioTem {
	private  Integer numeroBodega;
	private  String codigoBarras;
	private Integer cantidad;
	public Integer getNumeroBodega() {
		return numeroBodega;
	}
	public void setNumeroBodega(Integer numeroBodega) {
		this.numeroBodega = numeroBodega;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
