package org.codingTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GameNumberTest {
    @Test
    public void cases( ){
        assertEquals(new GameNumber(1).toString(),"1");
        assertEquals(new GameNumber(3).toString(),"Fizz");
        assertEquals(new GameNumber(5).toString(),"Buzz");
        assertEquals(new GameNumber(15).toString(),"FizzBuzz");
    }
}
