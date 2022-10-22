package com.platzi.javatests.FizzBuzz;

public class FizzBuzz {


    public static String number(int numero){
        String result="";
        if(numero % 3 == 0){
             result += "Fizz";
        }

        if(numero % 5 == 0){
            result += "Buzz";
        }

        if(numero % 5 != 0 && numero % 3 != 0)
            result = numero + "";


        return result;
    }
}
