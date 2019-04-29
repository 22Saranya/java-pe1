package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString objrev=new ReverseString();
    String str;

    @Test
    public void revstr() {
        str=objrev.RevString("London");
        assertEquals("nodnoL",str);
    }
}