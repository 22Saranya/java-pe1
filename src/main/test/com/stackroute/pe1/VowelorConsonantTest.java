package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelorConsonantTest {
    VowelorConsonant objvow= new VowelorConsonant();
    String strvow;


    @Test
    public void Checkvow() {
        strvow=objvow.FindVowel('a');
        assertEquals("Vowel",strvow);
    }

    @Test
    public void CheckCons() {
        strvow=objvow.FindVowel('s');
        assertEquals("Consonant",strvow);
    }
}