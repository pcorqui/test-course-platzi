package com.platzi.javatests.FizzBuzz;

import org.junit.Test;

import static com.platzi.javatests.FizzBuzz.FizzBuzz.number;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    //    Para practicar TDD, realizaremos este ejercicio clásico.
//
//    Usando TDD (empieza por los tests), implementa una función que dado un número:
//    Si el número es divisible por 3, retorna “Fizz”
//    Si el número es divisible por 5, retorna “Buzz”
//    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
//    En otro caso, retorna el mismo número

    @Test
    public void if_number_is_divisible_for_3(){
        assertThat(number(3),is("Fizz"));
    }

    @Test
    public void if_number_is_divisible_for_5(){
        assertThat(number(5),is("Buzz"));
    }

    @Test
    public void if_number_is_anything_else(){
        assertThat(number(2),is("2"));
    }

    @Test
    public void if_numer_is_divided_by_5_and_3(){
        assertThat(number(15),is("FizzBuzz"));
    }

}