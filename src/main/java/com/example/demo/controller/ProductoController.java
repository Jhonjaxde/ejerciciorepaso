
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private IProductoService productoService;
	//http://localhost:8080/Bodega/productos/guardar
	@PostMapping("/guardar")
	public String insertarPersona(Producto producto){
		this.productoService.agregar(producto);
		return "redirect:/productos/buscar";
	}
	
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Producto> lista = this.productoService.buscarLista();
		modelo.addAttribute("productos",lista);
		return "vistaListaProductos";
	}
	//metodo de pagina de redireccionamiento
		@GetMapping("/nuevo")
		public String paginaNuevaPropietario(Producto producto) {
			return "vistaGuardarProductos";
		}
}
