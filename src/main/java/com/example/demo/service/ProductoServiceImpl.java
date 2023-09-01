package com.example.demo.service;

import java.util.List;

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
	public void agregar(Producto producto) {
	this.productoRepository.insertar(producto);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Producto> buscarLista() {
		
		return this.productoRepository.seleccionarLista();
	}



}
