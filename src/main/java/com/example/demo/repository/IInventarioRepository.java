package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Inventario;
import com.example.demo.repository.modeloDTO.InventarioDTO;


public interface IInventarioRepository {
public void insertar(Inventario inventario);
	
	public List<Inventario> buscarTodos();
	
	public List<InventarioDTO>  buscarTodosDTO(); 
}
