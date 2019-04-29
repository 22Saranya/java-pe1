package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OriginalnumberTest {
    Originalnumber objtest=new Originalnumber();
    String str;

    @Before

    @Test
    public void CheckMatch() throws Exception {
        str = objtest.NumberGuess(21);
        assertEquals("Number guessed matches the original number",str);
    }


    @Test

    public void CheckLess() throws Exception {
        str= objtest.NumberGuess(0);
        assertEquals("Number guessed is less than original number",str);
    }

    @Test
    public void CheckMore () throws Exception {
        str=objtest.NumberGuess(56);
        assertEquals("Number guessed is more than original number",str);

    }
}