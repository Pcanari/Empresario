package com.idat.SUSPatriciaCanariEmpresario.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.SUSPatriciaCanariEmpresario.client.OpenFeignClient;
import com.idat.SUSPatriciaCanariEmpresario.entity.Empresario;
import com.idat.SUSPatriciaCanariEmpresario.repository.DetalleEmpresaRepository;
import com.idat.SUSPatriciaCanariEmpresario.repository.EmpresaRepository;

public class EmpresarioServiceImpl implements EmpresarioService {

	
	@Autowired
	private EmpresaRepository repository;
	
	@Autowired
	private DetalleEmpresaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public Empresario obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Empresario empresario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarEmpresario() {
		// TODO Auto-generated method stub

	}

}
