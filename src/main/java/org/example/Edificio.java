package org.example;


import java.util.Random;

public class Edificio {
    private Ascensor ascensor = new Ascensor();
    private Random random = new Random();

    public Persona crearPersona() {
        int pisoOrigen = random.nextInt(3) + 1;
        int pisoDestino;
        do {
            pisoDestino = random.nextInt(3) + 1;
        } while (pisoDestino == pisoOrigen);

        return new Persona(pisoOrigen, pisoDestino);
    }
}
