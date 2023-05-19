package calculadora.src.test.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionConcatenar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperacionConcatenarTest {

    @Test
    void realizarOperacion() {
        //arrange
        Integer number1 = 1;
        Integer number2 = 2;
        OperacionConcatenar operacionConcatenar = new OperacionConcatenar();
        //act
        Long resultado = (Long) operacionConcatenar.realizarOperacion(number1,number2);
        //assert
        assertEquals(120l, resultado);
    }

}