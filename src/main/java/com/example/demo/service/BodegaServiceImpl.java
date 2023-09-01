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
	public void agregar(Bodega bodega) {
		this.bodegaRepository.insertar(bodega);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Bodega> buscarLista() {
		
		return this.bodegaRepository.seleccionarLista();
	}

}
