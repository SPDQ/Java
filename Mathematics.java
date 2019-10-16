package com.vroom.core.test;
import java.math.BigInteger;

public class Mathematics implements IMathematics {
    
    public double sqrt(double y) {
        return Math.sqrt(y);
    }

    public long factorial(long n) {
        long r= 1;
        long m = n;
        while (m > 0) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
           
            r = r*m;
            m--;
        }

        return r;
    }

    public void echo(String s) {
        System.out.println("echo:" + s);
    }

    public boolean isPrime(long x) {
        if (x == 2) { //added this block, 2 is considered to be a prime
            return true;
        }

        if (x % 2 == 0) {
            return false; //<--correction
        }

        long p = 3;
        while (p*p<= x) {
            if (x % p ==0) {
                return false;
            }
            p += 2;
        }

        return true;
    }

    public boolean isPrime(BigInteger x) {
        BigInteger two = new BigInteger("2");
        if (x.equals(two)) {
            return true;
        }

        if ((x.mod(two)).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger p = new BigInteger("3");
        while ((p.multiply(p)).compareTo(x)<=0) {
            if (x.mod(p) == BigInteger.ZERO) {
                return false;
            }
            p = p.add(two);;
        }

        return true;
    }
}
