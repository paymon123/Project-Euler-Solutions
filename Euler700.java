/*

Leonhard Euler was born on 15 April 1707.

Consider the sequence 1504170715041707n mod 4503599627370517.

An element of this sequence is defined to be an Eulercoin if it is strictly smaller than all previously found Eulercoins.

For example, the first term is 1504170715041707 which is the first Eulercoin. The second term is 3008341430083414 which is greater than 1504170715041707 so is not an Eulercoin. However, the third term is 8912517754604 which is small enough to be a new Eulercoin.

The sum of the first 2 Eulercoins is therefore 1513083232796311.

Find the sum of all Eulercoins.
*/

/*
How I found the solution - 

The logic for this problem is fairly straightforward.  Expectedly the JVM eve+ntually hangs, as the number of iterations needed to find the next coin exponentially increases.
Thus began the process of minimizing the number of iterations from a nearly infinite value.  

I printed out various subsets of the data, analyzing it from many different angles before I noticed the pattern. 

Every time a new coin is found, there is a minimum amount that n must increase.  This base value is the amount that n increased from the last 2 coins found.  

Adding this at the end of the iterations that find a coin reduces the total number of iterations, but very insignificantly due to the exponential nature of the function.  

What about the large remainders?  It's impossible for the computer to iterate through such massive values 1 at a time. 

That's when I noticed the pattern.  The remainder of the iterations to the next coin (after subtracting the base amount) is always a multiple of the n value at the current coin, including 0.
So if adding the base value does not get the next coin (adding the base value is sometimes the exact amount to the next coin), start to add multiples of n.  

This only applies after the third coin is found at n = 506.  
*/

package euler;

import java.math.BigInteger;

public class Euler700 {
    public Euler700()
    {   
        BigInteger sum = new BigInteger("1504170715041707");
        BigInteger min = new BigInteger("1504170715041707");
        final BigInteger seq = new BigInteger("1504170715041707");
        BigInteger modDivisor = new BigInteger("4503599627370517");
        BigInteger oldN = new BigInteger("2");
        BigInteger diff;

        for(BigInteger n = BigInteger.valueOf(2);;n = n.add(BigInteger.valueOf(1)))
        {
            if(((seq.multiply(n)).mod(modDivisor)).compareTo(min)<0)
            {
                min = ((seq.multiply(n)).mod(modDivisor));
                sum = sum.add(min);
                diff = (n.subtract(oldN));
                oldN=n;
                n = n.add(diff.subtract(new BigInteger("1")));
                if(min.compareTo(new BigInteger("1"))<0)break;
            }
            else
            {
               if(n.compareTo(BigInteger.valueOf(506))>0)
               {
                   n = n.add(oldN.subtract(BigInteger.valueOf(1)));
               }
            }
        }
        System.out.println(sum.toString());
    }
   
}
