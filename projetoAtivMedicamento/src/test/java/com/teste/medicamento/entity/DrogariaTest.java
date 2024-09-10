package com.teste.medicamento.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DrogariaTest {

    private Drogaria drogaria;

    @BeforeEach
    void setUp() {
    	drogaria = new Drogaria(1L, "Ibuprofeno", "6847475887");
    }

    @Test
    @DisplayName("testando o getter e setter do campo ID")
    void testId() {
        // Act
    	drogaria.setId(2L);

        // Assertion
        assertEquals(2L, drogaria.getId());
    }

    @Test
    @DisplayName("testando o getter e setter do campo nome")
    void testNome() {
        // Act
    	drogaria.setNome("Paracetamol");

        // Assertion
        assertEquals("Paracetamol", drogaria.getNome());
    }

    @Test
    @DisplayName("testando o getter e setter do campo CNPJ")
    void testCnpj() {
        // Act
    	drogaria.setCnpj("7888778877");

        // Assertion
        assertEquals("7888778877", drogaria.getCnpj());
    }

    @Test
    @DisplayName("testando o construtor com todos os argumentos")
    void testConstructorAll() {
        // Act
        Drogaria novaDroga = new Drogaria(3L, "Dipirona", "15975348000147");

        // Assertion
        assertAll("novaDroga",
                () -> assertEquals(3L, novaDroga.getId()),
                () -> assertEquals("Dipirona", novaDroga.getNome()),
                () -> assertEquals("15975348000147", novaDroga.getCnpj())
        );
    }
}