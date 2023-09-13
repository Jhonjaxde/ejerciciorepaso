package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Inventario;
import com.example.demo.repository.modelo.InventarioTem;
import com.example.demo.repository.modeloDTO.InventarioDTO;

public interface IInventarioService {
	public void insertar(Inventario inventario);

	public void agregarInventario(InventarioTem inventarioTem);

	public List<Inventario> buscarTodos();

	public List<InventarioDTO> buscarTodosDTO();

}
