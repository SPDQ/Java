package com.vroom.core.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigInteger;

public class MathTest {
/*
    @Test
    public void testSqrt() {
        IMathematics m = new Mathematics();
        //System.out.println(m.sqrt(10.0));
        assertEquals(m.sqrt(10.0), 3.1622776601683795, 0.0000000001);       
    }

    @Test
    public void testFactorial() {
	IMathematics m = new Mathematics();
	//System.out.println(m.factorial(3));
        assertEquals(m.factorial(3), 6);       
    }
*/
    @Test
    public void testisPrime() {
	IMathematics m = new Mathematics();
	//System.out.println(m.isPrime(2));
        assertEquals(m.isPrime(100001651), true);       
    }
}
