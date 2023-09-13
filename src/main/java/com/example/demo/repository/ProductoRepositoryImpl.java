package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);

	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Producto buscarPorCodigoBarrasMaestro(String codigoBarrasMaestro) {
		TypedQuery<Producto> query = this.entityManager.createQuery(
				"SELECT p FROM Producto p WHERE p.codigoBarrasMaestro =: datoCodigoBarrasMaestro", Producto.class);
		query.setParameter("datoCodigoBarrasMaestro", codigoBarrasMaestro);
		return query.getResultList().get(0);
	}

}
