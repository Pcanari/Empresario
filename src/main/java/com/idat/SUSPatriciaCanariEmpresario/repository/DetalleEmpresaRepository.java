package com.idat.SUSPatriciaCanariEmpresario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.SUSPatriciaCanariEmpresario.entity.EmpresarioDetalle;



@Repository
public interface DetalleEmpresaRepository extends JpaRepository<EmpresarioDetalle, Integer> {

}
