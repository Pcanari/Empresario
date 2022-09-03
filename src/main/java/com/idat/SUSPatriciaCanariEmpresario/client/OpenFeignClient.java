package com.idat.SUSPatriciaCanariEmpresario.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.SUSPatriciaCanariEmpresario.dto.Empresa;



@FeignClient(name="SUS-PatriciaCanariEmpresario", url="localhost:8070")
public interface OpenFeignClient {

	@GetMapping("/api/cliente/v1/listar")
	public List<Empresa> listarEmpresario();
}
