package com.teste.medicamento.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MedicamentoTest {

private Medicamento medicamento;
	
	@BeforeEach
	void setUp () {
		//Arrange
		medicamento = new Medicamento(1L,"Dipirona", "Remédio para dor", "01/01/2000");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2L);
		//Assert
		assertEquals(2L, medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Paracetamol");
		//Assert
		assertEquals("Paracetamol", medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("Remédio para dor");
		//Assert
		assertEquals("Remédio para dor", medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo validade")
	void testValidade() {
		//Act
		medicamento.setValidade("01/01/2000");
		//Assert
		assertEquals("01/01/2000", medicamento.getValidade());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstrutorAll() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L, "Nimesulida", "Anti-inflamatório", "01/01/2000");
		//Assertion
		assertAll("novoMedicamento",
				()-> assertEquals (3L, novoMedicamento.getId()),
				()-> assertEquals ("Nimesulida", novoMedicamento.getNome()),
				()-> assertEquals ("Anti-inflamatório", novoMedicamento.getBula()),
				()-> assertEquals ("01/01/2000", novoMedicamento.getValidade()));
	}

}
