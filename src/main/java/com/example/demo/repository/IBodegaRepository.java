package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Bodega;


public interface IBodegaRepository {
	public void insertar(Bodega bodega);

	public void eliminar(Integer id);

	public Bodega buscar(Integer id);

	// Para ver la lista de los estudiantes
	public List<Bodega> buscarTodos();
	
	
	public Bodega buscarPorNumero(Integer numero);
	
}
