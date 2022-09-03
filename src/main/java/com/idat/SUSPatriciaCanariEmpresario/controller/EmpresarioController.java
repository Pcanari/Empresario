package com.idat.SUSPatriciaCanariEmpresario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.SUSPatriciaCanariEmpresario.entity.Empresario;
import com.idat.SUSPatriciaCanariEmpresario.service.EmpresarioService;



@RestController
@RequestMapping("/api/empresario/v1")
public class EmpresarioController {

	@Autowired
	private EmpresarioService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Empresario empresa) {
		service.guardar(empresa);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarEmpresaCliente() {
		service.asignarEmpresario();
	}
}
