package com.platzi.javatests;

import com.platzi.javatests.utill.PasswordUtil;
import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_less_than_only_letters(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcde123"));
    }

    @Test
    public void medium_when_has_letters_and_numbers_and_simbols(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcde123!"));
    }
}