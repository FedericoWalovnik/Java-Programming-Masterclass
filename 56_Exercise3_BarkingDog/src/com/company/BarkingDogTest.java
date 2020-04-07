package com.company;

import org.junit.Assert;
import org.junit.Test;

public class BarkingDogTest {

    @Test
    public void primerTest(){
        boolean Resultado = BarkingDog.shouldWakeUp(true,1);
        Assert.assertEquals(true,Resultado);
    }

    @Test
    public void segundoTest(){
        boolean Resultado = BarkingDog.shouldWakeUp(false,2);
        Assert.assertEquals(false,Resultado);
    }

    @Test
    public void terTest(){
        boolean resultado = BarkingDog.shouldWakeUp(true,8);
        Assert.assertEquals(false,resultado);
    }

    @Test
    public void cuarTest(){
        boolean resultado = BarkingDog.shouldWakeUp(true,-1);
        Assert.assertEquals(false,resultado);
    }

    @Test
    public void quinTest(){
        boolean resultado = BarkingDog.shouldWakeUp(true,50);
        Assert.assertEquals(false,resultado);
    }
}
