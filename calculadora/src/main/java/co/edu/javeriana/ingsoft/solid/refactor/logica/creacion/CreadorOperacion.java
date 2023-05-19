/*package calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.*;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

import java.util.HashMap;
import java.util.Map;

public class CreadorOperacion extends CreadorBase{

    private Map<String, OperacionBinaria> operacionBinariaMap;

    private void init() {
        operacionBinariaMap.put("Suma", (OperacionBinaria) new OperacionSuma());
        operacionBinariaMap.put("Resta", (OperacionBinaria) new OperacionResta());
        operacionBinariaMap.put("Multiplicacion", (OperacionBinaria) new OperacionMultiplicacion());
        operacionBinariaMap.put("Modulo", (OperacionBinaria) new OperacionModulo());
        operacionBinariaMap.put("Potencia", (OperacionBinaria) new OperacionPotencia());
        operacionBinariaMap.put("Concatenacion", (OperacionBinaria) new OperacionConcatenar());
        operacionBinariaMap.put("Division", (OperacionBinaria) new OperacionDivision());
    }
    public CreadorOperacion() {
        operacionBinariaMap = new HashMap<>();
        init();
    }

    @Override
    public OperacionBinaria getOperacion(String operacion) {
        return operacionBinariaMap.get(operacion);
    }
}*/
