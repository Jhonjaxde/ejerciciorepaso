package com.example.demo.service;




import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	
public  void insertar(Producto producto);

public Producto buscarPorCodigoBarrasMaestro(String codigoBarrasMaestro);
}
