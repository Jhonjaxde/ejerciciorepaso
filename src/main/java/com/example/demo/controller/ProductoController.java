
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//materia
	
//	@Controller
//	@RequestMapping("/materias")
//	public class MateriaController {
//		
//		@Autowired
//		private IMateriaService materiaService;
//		
//		
//		@GetMapping("/nuevaMateria")
//		public String paginaNuevaMateria(Materia materia) {
//			return "vistaNuevaMateria";
//		}
//
//		@PostMapping("/insertar")
//		public String insertarMateria(Materia materia, Model modelo) {
//			this.materiaService.insertar(materia);
//			materia = new Materia();
//			modelo.addAttribute("materia", materia);
//			return "redirect:/materias/nuevaMateria";
//		}
//		
//	
//	
	//vistanueva materia
//	
//	<!DOCTYPE html>
//	<html xmlns:th="http://www.thymeleaf.org" lang="en">
//
//	<head>
//		<meta charset="UTF-8">
//		<meta http-equiv="X-UA-Compatible" content="IE=edge">
//		<meta name="viewport" content="width=device-width, initial-scale=1.0">
//		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
//			integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
//		<title>Materia</title>
//	</head>
//
//	<body>
//		<form th:action="@{/materias/insertar}" th:object="${materia}" th:method="POST">
//			<table class="table table-dark">
//				<tr>
//					<td>
//						<label class="form-label">Nombre:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="nombre" th:field="${materia.nombre}">
//					</td>
//
//				</tr>
//				<tr>
//					<td>
//						<label class="form-label">Código:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="codigo" th:field="${materia.codigo}">
//					</td>
//				</tr>
//				<tr>
//					<td>
//						<label class="form-label">Descripción:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="descripcion" th:field="${materia.descripcion}">
//					</td>
//				</tr>
//				<tr>
//					<td>
//						<label class="form-label">Créditos:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="creditos" th:field="${materia.numeroCreditos}">
//					</td>
//				</tr>
//			
//				
//			</table>
//			<button class="btn btn-outline-success" type="submit">Guardar</button>
//		</form>
//	</body>
//
//	</html>
//	
//	
	
	
	//matricula
	
//
//	@Controller
//	@RequestMapping("/matriculas")
//
//	public class MatriculaController {
//		
//		
//		@Autowired 
//		private IMatriculaService matriculaService;
//		
//		@GetMapping("/nuevaMatricula")
//		public String paginaNuevaMatricula(MatriculaTmp matriculaTmp) {
//			return "vistaNuevaMatricula";
//		}
//
//		@PostMapping("/insertar")
//		public String insertarMatricula(MatriculaTmp matriculaTmp, Model modelo) {
//			this.matriculaService.agregarMatricula(matriculaTmp);
//			matriculaTmp = new MatriculaTmp();
//			modelo.addAttribute("matriculaTmp", matriculaTmp);
//			return "redirect:/matriculas/buscar";
//		}	
//			
//			@GetMapping("/buscar")
//			public String buscarTodos(Model modelo) {
//				List<MatriculaDTO> lista = this.matriculaService.buscarDTO();
//				modelo.addAttribute("matriculas", lista);
//				return "vistaListaMatriculas";
//			}
//		
//
//	}
	
	//vistanueva matricula
//	<!DOCTYPE html>
//	<html xmlns:th="http://www.thymeleaf.org" lang="en">
//
//	<head>
//		<meta charset="UTF-8">
//		<meta http-equiv="X-UA-Compatible" content="IE=edge">
//		<meta name="viewport" content="width=device-width, initial-scale=1.0">
//		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
//			integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
//		<title>Matricula</title>
//	</head>
//
//	<body>
//		<form th:action="@{/matriculas/insertar}" th:object="${matriculaTmp}" th:method="POST">
//			<table class="table table-dark">
//				<tr>
//					<td>
//						<label class="form-label">Código de Materia:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="codigo" th:field="${matriculaTmp.codigo}">
//					</td>
//
//				</tr>
//				<tr>
//					<td>
//						<label class="form-label">Cédula:</label>
//					</td>
//					<td>
//						<input class="form-control" type="text" id="cedula" th:field="${matriculaTmp.cedula}">
//					</td>
//				</tr>
//			
//				
//			</table>
//			<button class="btn btn-outline-success" type="submit">Guardar</button>
//		</form>
//	</body>
//
//	</html>
//	
//	
//	lista
	
//	
//	<!DOCTYPE html>
//	<html xmlns:th="http://www.thymeleaf.org">
//
//	<head>
//		<meta charset="UTF-8">
//		<meta http-equiv="X-UA-Compatible" content="IE=edge">
//		<meta name="viewport" content="width=device-width, initial-scale=1.0">
//		<title>Document</title>
//		<!--<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">-->
//		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
//			integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
//
//	</head>
//
//	<body>
//
//
//
//		<table class="table table-dark">
//			<thead>
//				<tr>
//					<th>Cédula</th>
//					<th>Nombre</th>
//					<th>Apellido</th>
//					<th>Materia</th>
//					<th>Cod. Materia</th>
//					
//				</tr>
//			</thead>
//			<tbody>
//				<tr th:each="matriculaDTO:${matriculas}">
//					<td th:text="${matriculaDTO.cedula}"></td>
//					<td th:text="${matriculaDTO.nombre}"></td>
//					<td th:text="${matriculaDTO.apellido}"></td>
//					<td th:text="${matriculaDTO.nombreMateria}"></td>
//					<td th:text="${matriculaDTO.codigoMateria}"></td>
//				
//				</tr>
//			</tbody>
//		</table>
//		<div>
//			<a th:href="@{/matriculas/nuevaMatricula}" class="btn btn-outline-success">Regresar </a>
//		</div>
//
//	</body>
//
//	</html>
	
}