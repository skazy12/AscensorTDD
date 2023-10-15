package org.example;

public class Ascensor {
    private int pisoActual = 1;

    public int getPisoActual() {
        return pisoActual;
    }

    public void mover(int pisoDestino) {
        this.pisoActual = pisoDestino;
    }
}
