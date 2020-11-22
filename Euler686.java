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

wrote brute force code, then tried to skip iterations

when skipping iterations on leading digits 123, it will ALWAYS skip 196, 289, or 489 powers to reach the next leading power - THIS IS RARE AND ACCURATE

even with skips it is not even close to reaching the answer before stack overflow




the answer is either

-find pattern to determine whether it skips 196, 289, or 489 to consolidate skips

-both the answer (678910) and example (45) are consecutive digits, there might be a relationship between n and answer as consecutive digits are added


already tried both


**/
import java.math.*;
public class Euler686 {
    
 

    final String leadingDigits = "123";
    final int n = 45;
    

    final int[] skipOptions = {196,289,485};
   
    final BigInteger multiplier = new BigInteger("2");
    boolean firstIter = false;
   

    int totalOnes = 0;
    int totalZeros = 0;
    int totalTwos = 0;
    int iter = 0;
    int prev0s = 0;
    int prev1s = 0;
    int prev2s = 0;
    int lastP = 0;

    
    public Euler686() {
        
        power(new BigInteger("2"), 0, BigInteger.valueOf(0));

    }
    
    public BigInteger power(BigInteger x, int nth, BigInteger iterations) 
    {
       
         if(nth==0)   
             
         {
             
             int p = nth;
             if(hasLeadingDigits(x))
             {
                 p = nth+1;
                
                 

             BigInteger numIterations = iterations.add(BigInteger.valueOf(1));
             return power(x, p, numIterations);
             }
             BigInteger originalX = new BigInteger(x.toString());
             x = originalX.multiply(BigInteger.valueOf(2));
             BigInteger numIterations = iterations.add(BigInteger.valueOf(1));
             
             iter++;
             return power(x, p, numIterations);
         }
        
        else{
      
        if(hasLeadingDigits(x))
        {
         
            
                    if(nth==n) 
        {
        System.out.println("answer"+iterations.toString());

                        return new BigInteger("-2");
                    
        }
              
          
            iter = 0;
            
            int p = nth+1;
         
            int skips = 0;
            BigInteger numIterations = BigInteger.valueOf(0);
            BigInteger originalX = new BigInteger(x.toString());
            for(int i = 0; i<skipOptions.length; i++)
            {
            skips = skipOptions[i];
         
        numIterations = iterations.add(BigInteger.valueOf(skips));
       
       
        x = originalX.multiply(multiplier.pow(skips));
            
        if(hasLeadingDigits(x))
        
        {
            if(firstIter==true ){
           if(i==0)totalZeros++;
            if(i==1)totalOnes++;
            if(i==2){totalOnes++; totalZeros++;}
            }
            else{
              
                firstIter=true;
            }
            break;
        }
            else{
                continue;
                
            }
            }
            
           //logging to find skip pattern
           if(isPowerOfTwo(nth))
           {
              
           System.out.println("nth = " + nth + "\ntotal 196 skips: " + (totalZeros-prev0s) + "\ntotal 289 skips: " + (totalOnes-prev1s) );
            lastP = p;
           prev0s = totalZeros;
           prev1s = totalOnes;
           prev2s = totalTwos;
           }
            
            
            
            
            
            //recursion
            return power(x, p, numIterations);

        }
        
        else{
            return new BigInteger("-1");}
        }
 
        
    }

    
    static boolean isPowerOfTwo(int n)
    {
    if(n==0)
    return false;
 
    return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
    (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
    
    public boolean hasLeadingDigits(BigInteger b)
    {
        if(b.toString().length()<leadingDigits.length())return false;
        if(b.toString().substring(0,leadingDigits.length()).equals(leadingDigits))
        return true;
        return false;
    }
    
   
}
