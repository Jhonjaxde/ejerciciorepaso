package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoRepository productoRepository;

	
	
	

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void insertar(Producto producto) {
		producto.setStock(0);
		this.productoRepository.insertar(producto);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Producto buscarPorCodigoBarrasMaestro(String codigoBarrasMaestro) {
		return this.productoRepository.buscarPorCodigoBarrasMaestro(codigoBarrasMaestro);
	}



}
