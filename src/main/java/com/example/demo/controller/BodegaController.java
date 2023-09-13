package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/nuevaBodega")
	public String paginaNuevoEstudiante(Bodega bodega) {
		return "vistaNuevoBodega";
	}

	@PostMapping("/insertar")
	public String insertarMateria(Bodega bodega, Model modelo) {
		this.bodegaService.insertar(bodega);
		bodega = new Bodega();
		modelo.addAttribute("Bodega", bodega);
		return "redirect:/bodegas/buscar";
	}
	
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Bodega> lista = this.bodegaService.buscarTodos();
		modelo.addAttribute("bodegas", lista);
		return "vistaListaBodegas";
	}
	@DeleteMapping("/borrar/{id}")
	public String borrarProducto(@PathVariable("id") Integer id) {
		this.bodegaService.eliminar(id);
		return "redirect:/bodegas/buscar";
	}
}
