package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorTest {

    @Test
    void deveRetornarValorInvalido() {
        Avaliador nota = new Avaliador();
        assertThrows(IllegalArgumentException.class, () -> {
            nota.determinarNotaAluno(-1);
        });
    }

    @Test
    void deveRetornarF() {
        Avaliador nota = new Avaliador();
        assertEquals('F', nota.determinarNotaAluno(59));
    }

    @Test
    void deveRetornarD() {
        Avaliador nota = new Avaliador();
        assertEquals('D', nota.determinarNotaAluno(69));
    }

    @Test
    void deveRetornarC() {
        Avaliador nota = new Avaliador();
        assertEquals('C', nota.determinarNotaAluno(79));
    }

    @Test
    void deveRetornarB() {
        Avaliador nota = new Avaliador();
        assertEquals('B', nota.determinarNotaAluno(89));
    }

    @Test
    void deveRetornarA() {
        Avaliador nota = new Avaliador();
        assertEquals('A', nota.determinarNotaAluno(90));
    }
}