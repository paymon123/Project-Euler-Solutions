/**
2^7=128 is the first power of two whose leading digits are "12".
The next power of two whose leading digits are "12" is 2^80.

Define p(L,n) to be the nth-smallest value of j such that the base 10 representation of 2^j begins with the digits of L.
So p(12,1)=7 and p(12,2)=80.

You are also given that p(123,45)=12710.

Find p(123,678910).


**/

/**
2^? is the 678910th power of 2 that begins with digits 123
2^12710 is the 45th power of 2 that begins with the digits 123

you can tell that the answer is extraordinarily large, you can try to find it mathematically or run a few sample iterations and find a pattern

try to do it mathematically and recursively, keep track of n with a global variable and have a 
method to check if L qualifies.  using this method, there would be (~1000+ digits?) iterations, from 
there figure out a way to minimize iterations.  

stack overflow error starts when x is around 2000+ digits

see if you can skip iterations, print difference between iterations when n matches,

90
289
196
289
...

map 289 to 2, 196 to 1, and 485 to 2+1 - 90 only appears once

90
2
1
2
1
2+1 <--set all values to start here
1
2
1
2
1
2
1
2+1
1
2
1
2
1
2
1
2+1
--stack overflow--

skipping pattern checks out for 3 rounds, when it becomes inaccurate by 1
 
 on the third rtound, last one is 487
    
**/
import java.math.*;
import java.io.*;
public class Euler686 {
    
    PrintStream out; 
        

    final String leadingDigits = "123";
    final int n = 45;

    boolean firstIteration = false;
    final int one = 196;
    final int two = 289;
    final int three = 485;
    final int[] pattern = {2, 90, 196,289,485};
   
    //calculate lowest skips
    //do math
    //if not perfect fit, returns 0, recalculate lowest skips
    int patternTracker = 0;
    final BigInteger multiplier = new BigInteger("2");
    

    int counter = 0;
    int round = 0;
    boolean special = false;
    int rounder = 0;
    int z = 1;

    public Euler686() {
    try{
        //out = new PrintStream(new FileOutputStream("filename.txt"));
        power(new BigInteger("2"), 0, BigInteger.valueOf(0));
        
    }
        catch(Exception e)
        {
            out.close();
        }
    
        
    }
    
    public BigInteger power(BigInteger x, int nth, BigInteger iterations) 
    {
       
         if(nth==0)   
             
         {
             int p = nth;
             if(hasLeadingDigits(x))
             {
                 p = nth+1;
                 
             
             return power(x, p, iterations);
             }
             
             x = x.multiply(BigInteger.valueOf(2));
             BigInteger numIterations = iterations.add(BigInteger.valueOf(1));
             return power(x, p, numIterations);
         }
        
        else{
        System.out.println("nth is 1");
        if(hasLeadingDigits(x))
        {
           
            
            System.out.println("leading");
            int p = nth+1;
            
        for(int s = 0; s<pattern.length; s++)
        {
        
        
       
        int skips = pattern[s];
            System.out.println(skips); 
        //do math
        BigInteger numIterations = iterations.add(BigInteger.valueOf(skips));
       
        if(nth==n) 
        {
        System.out.println("answer"+numIterations.toString());return new BigInteger("-1");}
        x = x.multiply(multiplier.pow(skips));
            
        if(power(x, p,numIterations).compareTo(BigInteger.valueOf(0))==0)
        
        {
           System.out.println("loop");
            continue;
        }
            
            
            return power(x, p, numIterations);
        
        }
        }
        else{return BigInteger.valueOf(0);}
        }
 
        
        

        
        System.out.println("emergency return");
        return BigInteger.valueOf(0);
    }
        
        
        
        
    
    
    public boolean hasLeadingDigits(BigInteger b)
    {
        if(b.toString().length()<leadingDigits.length())return false;
        if(b.toString().substring(0,leadingDigits.length()).equals(leadingDigits))
        return true;
        return false;
    }
    
   
}
