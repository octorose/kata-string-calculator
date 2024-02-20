package fr.norsys.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class ClazzTest{
    Clazz cl = new Clazz();
    @Test
    @DisplayName("it should return 0 if input is empty ")
    void testEmpty(){
        assertEquals(0,cl.add(""));

    }
    @Test
    @DisplayName("it should handle unknown amount of numbes")
    void testlenght(){
        assertEquals(6,cl.add("1,2,3"));
    }
    @Test
    @DisplayName("it shoud handle new lines instead of commas")
    void testNewLine(){
        assertEquals(6,cl.add("1\n2,3"));
    }
    @Test
    @DisplayName("it should ignore number greater than 1000")
    void testNumber(){
        assertEquals(3,cl.add("1\n2,1004"));
    }
    @Test
    void extrac(){
        assertEquals(10,cl.add("//*\n5*2*3"));
    }
        }