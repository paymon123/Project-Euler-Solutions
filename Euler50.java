
package euler;
import java.util.ArrayList;
//wait for the program to complete, last number is the answer
public class Euler50 {
    static final int n = 1000000;
    static boolean[] isPrime = new boolean[n+1];
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    Euler50()
            
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
        for(int i = 2; i<isPrime.length; i++)
        {
            if(isPrime[i])
            {
                primes.add(i);
            }
        }
        
   int max = 0;
    for(int i:primes)
    {
        int x = getConsecutivePrimes(i);
        
        if (x > max)
        {
            max = x;
            System.out.println(i);
            
        }
        
    }
    }
    public int getConsecutivePrimes(int i)
    {
        int count = 0;
        int sum = 0;
        //determine starting prime
        outer:
        for(int z = 0; z<primes.size(); z++)
        {
            count = 0;
            sum = 0;
            for(int index = z; index<primes.size(); index++)
            {
                sum+=primes.get(index);
                count++;
                if(sum>i) break;
                if(sum == i) break outer;
            }
        }
        return count;
    }
    
}
