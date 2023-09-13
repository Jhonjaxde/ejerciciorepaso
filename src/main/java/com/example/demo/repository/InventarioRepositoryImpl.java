package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Inventario;
import com.example.demo.repository.modeloDTO.InventarioDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Inventario inventario) {
		this.entityManager.persist(inventario);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Inventario> buscarTodos() {
		TypedQuery<Inventario> query = 
				this.entityManager.createQuery("SELECT i FROM Inventario i ", Inventario.class);
		return query.getResultList();
	}
//dto
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<InventarioDTO> buscarTodosDTO() {
		TypedQuery<InventarioDTO> query =
				this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modeloDTO.InventarioDTO (i.producto.nombre, i.producto.codigoBarrasMaestro, i.producto.categoria, i.bodega.numero,i.bodega.direccion, i.bodega.telefono)from Inventario i",InventarioDTO.class);
		return query.getResultList();
	}

}
