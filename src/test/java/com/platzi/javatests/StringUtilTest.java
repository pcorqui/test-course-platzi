package com.platzi.javatests;

//import static org.junit.jupiter.api.Assertions.*;

import com.platzi.javatests.utill.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//La clase debe ser public
public class StringUtilTest {
    //en los test no se utiliza main si no una clase llamada test
    /*public static void main(String[] args) {

        //creando test unitarios: aquellos que se encargan de probar solo una funcion o clase

        //assertequal(StringUtil.repeat("Hola",3),"HolaHolaHola");

        //assertequal(StringUtil.repeat("hola",1),"hola");

        //utilizando jUnit
        Assert.assertEquals("HolaHolaHola",StringUtil.repeat("Hola",3));
        Assert.assertEquals("Hola",StringUtil.repeat("Hola",1));
    }*/

    public static void assertequal(String actual, String expectec){
        if(!actual.equals(expectec)){
            throw new RuntimeException(actual + "is not equal to expectec: " + expectec);
        }
    }

    //cada test debe tener una sola comprobaion y se pueden correr independiente
    @Test
    public void testRepeat(){
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola",3));
        Assert.assertEquals("Hola",StringUtil.repeat("Hola",1));
    }

    @Test
    public void test_repeat_only_one_time(){
        Assert.assertEquals("HolaH",StringUtil.repeat("Hola",1));
    }

    @Test
    public void test_repeat_multiples_times(){
        Assert.assertEquals("HolaHolaHola",StringUtil.repeat("Hola",3));
    }

    @Test
    public void test_repeat_zero_times(){
        Assert.assertEquals("",StringUtil.repeat("Hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_repeat_negative_times(){
        StringUtil.repeat("",-1);
    }

    @Test
    public void test_string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("Paul"));
    }

    @Test
    public void empty_quote_is_string_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_string_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_space_is_string_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }
}