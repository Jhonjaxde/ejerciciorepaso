package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Bodega;

public interface IBodegaService {
	public void insertar(Bodega bodega);

	public void eliminar(Integer id);

	public Bodega buscar(Integer id);

	// Para ver la lista de los estudiantes
	public List<Bodega> buscarTodos();
	
	
	public Bodega buscarPorNumero(Integer numero);
}
