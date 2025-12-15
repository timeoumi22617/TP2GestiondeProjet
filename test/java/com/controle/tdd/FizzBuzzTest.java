package com.controle.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void de_15() {
        String r = FizzBuzz.de(15);
        assertEquals("FizzBuzz",r,"doit retourner FizzBuzz");

    }
    @Test
    void de_3() {
        String r = FizzBuzz.de(3);
        assertEquals("Fizz",r,"doit retourner Fizz");

    }
    @Test
    void de_5() {
        String r = FizzBuzz.de(5);
        assertEquals("Buzz",r,"doit retourner Buzz");

    }
}