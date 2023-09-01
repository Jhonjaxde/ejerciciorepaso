package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Bodega;

public interface IBodegaRepository {
	public void insertar(Bodega bodega);

	public List<Bodega> seleccionarLista();
}
