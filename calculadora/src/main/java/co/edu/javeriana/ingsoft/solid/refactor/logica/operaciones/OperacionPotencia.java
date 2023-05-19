package calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionPotencia implements OperacionBinaria {
    private Number potenciar(Number a, Number b) {
        return Math.pow(a.longValue(),b.longValue());
    }

    @Override
    public Number realizarOperacion(Number a, Number b) {
        return potenciar(a,b);
    }
}
