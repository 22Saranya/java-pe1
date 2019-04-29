package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;


public class UpperorLowercaseTest {

    UpperorLowercase objtest=new UpperorLowercase();
    String str;

    @Test
    public void Checklower() throws Exception {
        str=objtest.UpLow('a');
        assertEquals("Small Case Letter",str);
    }

    @Test
    public void Checkupper() throws Exception {
        str=str=objtest.UpLow('A');
        assertEquals("Capital Letter",str);
    }

    @Test
    public void Checkdigit() throws  Exception {
        str=str=objtest.UpLow('2');
        assertEquals("Digit",str);
    }
}