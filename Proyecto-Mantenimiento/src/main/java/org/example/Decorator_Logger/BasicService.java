package org.example.Decorator_Logger;

public class BasicService implements ServiceInterface {

    @Override
    public void process() {
        // Aquí va la lógica pura del proceso
        // Por ejemplo: acceso a datos, cálculos, validaciones internas
    }

    @Override
    public void validate() {
        // Aquí va la lógica pura de la validación
    }
}
