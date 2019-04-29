package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenorOddTest {
    //Arrange
    EvenorOdd eve=new EvenorOdd();
    String Checkstr;

    @Before


    @Test
    public void checkTom() throws Exception {
        //Act
        Checkstr=eve.CheckEven(25);
        //Assert
        assertEquals("Tom",Checkstr);
    }
    @Test
    public void checkJerry() throws Exception {
        // Act
        Checkstr = eve.CheckEven(26);
        //Assert
        assertEquals("Jerry",Checkstr);
    }

    @Test
    public void checkOther() throws Exception {
        // Act
        Checkstr = eve.CheckEven(66);
        // Assert
        assertEquals("Neither Tom nor Jerry",Checkstr);
    }
}


