package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Bodega;

public interface IBodegaService {
	public void agregar(Bodega bodega);
	public List<Bodega> buscarLista();
}
