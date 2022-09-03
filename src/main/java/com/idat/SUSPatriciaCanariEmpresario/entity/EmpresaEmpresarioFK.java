package com.idat.SUSPatriciaCanariEmpresario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class EmpresaEmpresarioFK implements Serializable{
	

	private static final long serialVersionUID = 4417214286334278898L;

	@Column(name="idEmpresario", nullable = false, unique = true)
	private Integer idEmpresario;
	
	@Column(name="idEmpresa", nullable = false, unique = true)
	private Integer idEmpresa;

	public Integer getIdEmpresario() {
		return idEmpresario;
	}

	public void setIdEmpresario(Integer idEmpresario) {
		this.idEmpresario = idEmpresario;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	
	
}