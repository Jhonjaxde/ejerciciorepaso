package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Bodega;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import jakarta.persistence.TypedQuery;
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

//	@Override
//	@Transactional(value = TxType.NOT_SUPPORTED)
//	public List<Bodega> seleccionarLista() {
//		Query myQuery = this.entityManager.createQuery("SELECT e FROM Bodega e" ,Bodega.class);
//		
//		return myQuery.getResultList();
//	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void eliminar(Integer id) {
		Bodega b = this.buscar(id);
		this.entityManager.remove(b);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Bodega buscar(Integer id) {
		
		return this.entityManager.find(Bodega.class, id);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Bodega> buscarTodos() {
		TypedQuery<Bodega> query = 
				this.entityManager.createQuery("SELECT b FROM Bodega b", Bodega.class);
		return query.getResultList();
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Bodega buscarPorNumero(Integer numero) {
		TypedQuery<Bodega> query = 
				this.entityManager.createQuery("SELECT b FROM Bodega b WHERE b.numero =: datoNumero", Bodega.class);
		query.setParameter("datoNumero", numero);
		return query.getResultList().get(0);
	}

}
