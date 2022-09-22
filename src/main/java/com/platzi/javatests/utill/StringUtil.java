package com.platzi.javatests;

public class StringUtil {
    public static String repeat(String str, int times){

        if(times < 0){
            throw new IllegalArgumentException("negative times is not permit");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }
}
