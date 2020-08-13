
package euler;

import static euler.Euler35.isPrime;
import java.util.Arrays;
import java.util.ArrayList;


public class Euler41 {
    static final int n = 100000000;
    static boolean[] isPrime = new boolean[n];
    public Euler41()
    {
        
        int largest = 0;
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
        for(int i = 1; i<100000000; i++)
        {
            if(isPrime[i] && isPandigital(Long.toString(i))&& i>largest)
            {
                largest = i;
            }
        }
        System.out.println(largest);
    }
    public static boolean isPandigital(String s)
    {
        
        
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        String x = new String(characters);
        String z = "";
        for(int i = 1; i<=s.length();i++)
        {
            z+=(Integer.toString(i));
        }
        return x.equals(z);
        
        
        
        
    } 
}
