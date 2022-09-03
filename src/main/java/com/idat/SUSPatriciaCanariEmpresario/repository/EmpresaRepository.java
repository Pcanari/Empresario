package com.idat.SUSPatriciaCanariEmpresario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.SUSPatriciaCanariEmpresario.entity.Empresario;



public interface EmpresaRepository extends JpaRepository<Empresario, Integer>{

}