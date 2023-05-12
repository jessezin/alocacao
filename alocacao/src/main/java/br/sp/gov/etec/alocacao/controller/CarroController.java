package br.sp.gov.etec.alocacao.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Carro;
import br.sp.gov.etec.alocacao.repository.CarroRepository;

@RestController
public class CarroController {
	
	@Autowired
	CarroRepository repository;
	
	@GetMapping("listar-carros")
	public List<Carro> listarCarros(){   
	return repository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Carro adicionarCarro(@RequestBody Carro carro) {
	return repository.save(carro);
	}
	
	@PostMapping("/atualizar-carro")
	public Carro atualizarCarro(@RequestBody Carro carro) {
	return repository.save(carro);
	}
	
	@DeleteMapping("/excluir-carro/{id}")
	public ResponseEntity excluirCarro(@PathVariable long id) {
	repository.deleteById(id);
	return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	}	
}