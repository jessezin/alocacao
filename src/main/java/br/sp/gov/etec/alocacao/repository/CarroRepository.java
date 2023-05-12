package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.alocacao.model.Carro;

@Repository
public interface CarroRepository extends JpaRepositoryImplementation<Carro, Long>{
   
}
