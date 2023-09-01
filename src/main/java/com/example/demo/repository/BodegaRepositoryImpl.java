package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Bodega;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional
public class BodegaRepositoryImpl implements IBodegaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Bodega bodega) {
		this.entityManager.persist(bodega);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Bodega> seleccionarLista() {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Bodega e" ,Bodega.class);
		
		return myQuery.getResultList();
	}

}
