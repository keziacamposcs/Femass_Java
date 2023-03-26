package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PontoTest {
    @Test
    void testGetDistancia() {
        Ponto p1 = new Ponto(0.0, 0.0);
    }

    @Test
    void testGetDistancia2() {
        Ponto p1 = new Ponto(0.0, 0.0);
    }

    @Test
    void testGetLocalizacao() {
        Ponto p1 = new Ponto(0.0, 0.0);
        assertEquals("Origem", p1.getLocalizacao());
    }

    @Test
    void testGetX() {
        Ponto p1 = new Ponto(0.0, 0.0);
        assertEquals(0.0, p1.getX());
    }

    @Test
    void testGetY() {
        Ponto p1 = new Ponto(0.0, 0.0);
        assertEquals(0.0, p1.getY());

    }
}
