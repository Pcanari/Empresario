package com.idat.SUSPatriciaCanariEmpresario.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="detalle_empresario_empresa")
public class EmpresarioDetalle {
	
	@Id
	private EmpresaEmpresarioFK fk =new EmpresaEmpresarioFK();

	public EmpresaEmpresarioFK getFk() {
		return fk;
	}

	public void setFk(EmpresaEmpresarioFK fk) {
		this.fk = fk;
	}
	

}