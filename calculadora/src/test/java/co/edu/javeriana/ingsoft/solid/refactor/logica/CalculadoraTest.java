package calculadora.src.test.java.co.edu.javeriana.ingsoft.solid.refactor.logica;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();
    @Test
    void ejecutarAbsoluto0() {
        Number respuesta = calculadora.ejecutarunaria(0,"Absoluto");
        assertEquals(0,respuesta.longValue());
    }
    @Test
    void ejecutarAbsoluto5() {
        Number respuesta = calculadora.ejecutarunaria(5,"Absoluto");
        assertEquals(5,respuesta.longValue());
    }
    @Test
    void ejecutarAbsolutomenos5() {
        Number respuesta = calculadora.ejecutarunaria(-5,"Absoluto");
        assertEquals(5,respuesta.longValue());
    }

}