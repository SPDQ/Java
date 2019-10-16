package com.vroom.core.test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.concurrent.*;

import java.math.BigInteger;


public class RealMathTest {
/*
    @Test
    public void testSqrt() {
        IMathematics m = new Mathematics();
        IMathematics m2 = new RealMath(m, 200);
	//System.out.println(m2.sqrt(10.0));
    }
	
    @Test
    public void testFactorial() {
        IMathematics m = new Mathematics();
        IMathematics m2 = new RealMath(m,200);
        //System.out.println(m2.factorial(10));
    }
	
    @Test(expected=RuntimeException.class)
    public void testFactorialTimeout() {
        IMathematics m = new Mathematics();
        IMathematics m2 = new RealMath(m,2);
        System.out.println(m2.factorial(3));
    }

    @Test(expected=RuntimeException.class)
    public void testisPrimeTimeout() {
        IMathematics m = new Mathematics();
        IMathematics m2 = new RealMath(m,1);
        System.out.println(m2.isPrime(100001651));
    }
*/
    @Test(expected=RuntimeException.class)
    public void testIsPrimeTimeout2() {
        IMathematics m = new Mathematics();
        IMathematics m2 = new RealMath(m,15);
        System.out.println(m2.isPrime(new BigInteger("170141183460469231731687303715884105727")));
    }

}
