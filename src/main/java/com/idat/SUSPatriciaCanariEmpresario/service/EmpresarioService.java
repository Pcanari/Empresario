package com.idat.SUSPatriciaCanariEmpresario.service;

import com.idat.SUSPatriciaCanariEmpresario.entity.Empresario;

public interface EmpresarioService {
	
	Empresario obtenerId(Integer id);
	
	void guardar(Empresario empresario);

	
	void asignarEmpresario();
}
