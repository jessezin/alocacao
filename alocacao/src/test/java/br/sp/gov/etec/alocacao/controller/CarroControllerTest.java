package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.sp.gov.etec.alocacao.model.Carro;

@ExtendWith (SpringExtension.class)
public class CarroControllerTest {

	@InjectMocks 	
	CarroController controller;
	
	@Test
	public void  listarCarrosTest() {
		
		List<Carro> carros = controller.listarCarros();
		
		assertNotNull(carros);
		
		
		//1 - As instâncias do teste
		//2 - Executar o test
		//3 - Validação do Retorno
		
		
		
		
		
	}
}

