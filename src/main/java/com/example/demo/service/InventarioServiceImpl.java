package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IBodegaRepository;
import com.example.demo.repository.IInventarioRepository;
import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Bodega;

import com.example.demo.repository.modelo.Inventario;
import com.example.demo.repository.modelo.InventarioTem;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modeloDTO.InventarioDTO;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository inventarioRepository;
	@Autowired
	private IProductoRepository productoRepository;
	@Autowired
	private IBodegaRepository bodegaRepository;

	@Override
	public void insertar(Inventario inventario) {
		this.inventarioRepository.insertar(inventario);

	}

	@Override
	public void agregarInventario(InventarioTem inventarioTem) {
		Producto pro = this.productoRepository.buscarPorCodigoBarrasMaestro(inventarioTem.getCodigoBarras());

		Bodega bo = this.bodegaRepository.buscarPorNumero(inventarioTem.getNumeroBodega());

		Inventario in = new Inventario();
		in.setBodega(bo);
		in.setProducto(pro);
		pro.setStock(pro.getStock() + 1);
		this.insertar(in);
	}

	@Override
	public List<Inventario> buscarTodos() {

		return this.inventarioRepository.buscarTodos();
	}

	@Override
	public List<InventarioDTO> buscarTodosDTO() {

		return this.inventarioRepository.buscarTodosDTO();
	}

}
