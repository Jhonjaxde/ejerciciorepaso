package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Bodega;

import com.example.demo.service.IBodegaService;
@Controller
@RequestMapping("/bodegas")
public class BodegaController {
	
	@Autowired
	private IBodegaService bodegaService;
	
	//http://localhost:8080/Bodega/bodegas/guardar
	

	@PostMapping("/guardar")
	public String insertarPagina(Bodega bodega) {
		this.bodegaService.agregar(bodega);
		return "redirect:/bodegas/buscar";
	}
	
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Bodega> lista = this.bodegaService.buscarLista();
		modelo.addAttribute("bodegas",lista);
		return "vistaListaBodegas";
	}
	//metodo de pagina de redireccionamiento
		@GetMapping("/nuevo")
		public String paginaNuevaPropietario(Bodega bodega) {
			return "vistaGuardarBodegas";
		}
}
