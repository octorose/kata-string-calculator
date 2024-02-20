package fr.norsys.stringcalculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClazzTest {

    Clazz calc = new Clazz();
    @Test
    @DisplayName("empty string")
    void test1(){
      int result = calc.add("");
      assertEquals(0, result);
    }

    @Test
    @DisplayName("check if method handle an unknown amout of numbers")
    void test2(){
        int result = calc.add("1,2,5");
        assertEquals(8, result);
    }

    @Test
    @DisplayName("check if method handle new lines between numbers")
    void test3(){
        int result = calc.add("1\n2,3");
        assertEquals(6, result);
    }

/*
    @Test
    @DisplayName("support deferents delimiter")
    void test4(){
        int result = calc.add("//;\n1;2");
        assertEquals(3, result);
    }


*/
/*
    @Test
    @DisplayName("check if method handle new lines between numbers")
    void test5(){

        Assertions.assertThrows(IllegalArgumentException.class,() -> {calc.add("1,2,3,-8");} );
    }*/



    @Test
    @DisplayName("test if numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2")
    void test6(){
        int result = calc.add("2,1001");
        assertEquals(2, result);
    }

    /*
    @Test
    @DisplayName("check if method handle new lines between numbers")
    void test7(){
        int result = calc.Add("1\n2,3");
        assertEquals(6, result);
    }
    @Test
    @DisplayName("check if method handle new lines between numbers")
    void test8(){
        int result = calc.Add("1\n2,3");
        assertEquals(6, result);
    }*/


}