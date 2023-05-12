package br.sp.gov.etec.alocacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Carro;
import br.sp.gov.etec.alocacao.repository.CarroRepository;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController
public class CarroController {
	@SuppressWarnings("unchecked")
	
	
	@Autowired
	CarroRepository repository;
	
	
	@GetMapping("lista-carros")
	public List<Carro> listarCarros(){
		
	 return	repository.findAll();
		
	}
	
	@PostMapping("adicionar-carro")
	public Carro inserirCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	

	

}
