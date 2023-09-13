package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IBodegaRepository;
import com.example.demo.repository.modelo.Bodega;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class BodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaRepository bodegaRepository;
	
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void insertar(Bodega bodega) {
		this.bodegaRepository.insertar(bodega);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void eliminar(Integer id) {
		this.bodegaRepository.eliminar(id);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Bodega buscar(Integer id) {
		
		return this.bodegaRepository.buscar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Bodega> buscarTodos() {
		
		return this.bodegaRepository.buscarTodos();
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Bodega buscarPorNumero(Integer numero) {
		
		return this.bodegaRepository.buscarPorNumero(numero);
	}

}
