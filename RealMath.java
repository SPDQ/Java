package com.vroom.core.test;

import com.vroom.core.*;
import java.util.concurrent.*;

import java.math.BigInteger;

public class RealMath extends TimeLimitedExecutor implements IMathematics {
	
    private final long DEFAULT_LIMIT= 2;
    private long limit = DEFAULT_LIMIT;
    private IMathematics mathematics;
	
    public RealMath(IMathematics mathematics, long limit) {
        this.mathematics = mathematics;
        this.limit = limit;
    }
	
    public RealMath(IMathematics mathematics) {
        this.mathematics = mathematics;
    }
	
    public double sqrt(final double y) {
        return execute(
	           new Callable<Double>() {
		       public Double call() {
		    	   return mathematics.sqrt(y);
		       }
		   },
		   limit, TimeUnit.SECONDS);
    }
	
    public long factorial(final long n) {
	return execute(
		   new Callable<Long>() {
		       public Long call() {
                           return mathematics.factorial(n);
                       }
		   },
		   limit, TimeUnit.SECONDS);
    }
	
    public void echo(String s) {
    }

    public boolean isPrime(final long x) {
	return execute(
		   new Callable<Boolean>() {
		       public Boolean call() {
                           return mathematics.isPrime(x);
                       }
		   },
		   limit, TimeUnit.MILLISECONDS);
    }

    public boolean isPrime(final BigInteger n) {
        return execute(
                   new Callable<Boolean>() {
                       public Boolean call() {
                           return mathematics.isPrime(n);
                       }
                   },
                   limit, TimeUnit.SECONDS);
    }

}
