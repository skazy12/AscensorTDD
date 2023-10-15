package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AscensorTest {
    @Test
    public void ascensorIniciaEnPrimerPiso() {
        Ascensor ascensor = new Ascensor();
        assertEquals(1, ascensor.getPisoActual());
    }

    @Test
    public void ascensorSeMueveAlPisoSolicitado() {
        Ascensor ascensor = new Ascensor();
        ascensor.mover(3);
        assertEquals(3, ascensor.getPisoActual());
    }
    @Test
    public void personaTienePisoOrigenYDestinoDiferentes() {
        Persona persona = new Persona(1, 2);
        assertNotEquals(persona.getPisoOrigen(), persona.getPisoDestino());
    }
    @Test
    public void creaPersonaEnUnPisoAleatorio() {
        Edificio edificio = new Edificio();
        Persona persona = edificio.crearPersona();
        assertNotNull(persona);
    }


}
