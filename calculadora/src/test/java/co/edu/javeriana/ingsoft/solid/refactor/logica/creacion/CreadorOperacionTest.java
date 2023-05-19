package calculadora.src.test.java.co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorBase;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorDinamico;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionDivision;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionResta;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionSuma;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * Prueba la creacion de operaciones de manera dinamica o de otra forma
 * */
class CreadorOperacionTest {

    private CreadorBase creadorOperacion = new CreadorDinamico();
    @Test
    void getOperacionSuma() {

        OperacionBinaria suma = creadorOperacion.getOperacion("Suma");
        assertInstanceOf(OperacionSuma.class, suma);
    }

    @Test
    void getOperacionResta() {

        OperacionBinaria resta = creadorOperacion.getOperacion("Resta");
        assertInstanceOf(OperacionResta.class, resta);
    }

    @Test
    void getOperacionDivision() {
        OperacionBinaria division = creadorOperacion.getOperacion("Division");
        assertInstanceOf(OperacionDivision.class, division);
    }
}