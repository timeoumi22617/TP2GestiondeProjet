package com.projet.orientation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void tourner() {
        Personnage p = new Personnage();
        String r = p.tourner(9);
        assertEquals("est",r,"expected est");
    }
}