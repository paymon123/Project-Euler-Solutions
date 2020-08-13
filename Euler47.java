
package euler;
import java.util.ArrayList;
public class Euler47 {;
  
    static final int n = 100000000;
    static boolean[] isPrime = new boolean[n+1];
  
    public Euler47()
    {
         //sieve of eratosthenes for primes...initially set all to true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
            
        }
         // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i < n; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j < n; j++) {
                    isPrime[i*j] = false;
                }
            }
            
        }
        int counter = 0;
        for(int i = 256;i<1000000;i++)
        {
                
                ArrayList<Integer> x= getDistinctFactors(i);
                if(x.size()==4)
                {
                    counter++;
                }
                else
                {
                    counter = 0;
                }
                if(counter == 4)
                {
                    System.out.println(i-3);
                    break;
                }    
        }
    }
    public ArrayList<Integer> getDistinctFactors(int n)
    {
        if (isPrime[n])
        {
            return new ArrayList<Integer>();
        }
        else
        {
            //n is not prime here
            ArrayList<Integer> x = new ArrayList<Integer>();
            
            //begin the process of finding the distinct prime divisors of a number
            while(!isPrime[n])
            {
            for(int divisor = 2; divisor<=n/2; divisor++)
            {
                if(isPrime[divisor])
                {
                if(n%divisor == 0)
                {
                    n = n/divisor;
                    if(isPrime[n]&&!x.contains(n))
                    {
                        x.add(n);
                    }
                    if(!x.contains(divisor))
                    {
                        x.add(divisor);
                    }
                    break;
                }
                }
            }
            }
            return x;
        }
    } 
}
