
package euler;
import java.util.Arrays;
public class Euler49 {
    static final int n = 100000000;
    static boolean[] isPrime = new boolean[n+1];
  
    public Euler49()
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
        for(int i = 999; i<=3340; i++)
        {
            if(isPermutation(Integer.toString(i),Integer.toString(i+3330), Integer.toString(i+6660)))
            {
                if(isPrime[i]&& isPrime[i+3330]&& isPrime[i+3330+3330])
                {
                    System.out.println(i + " " + (i+3330) + " " + (i+3330+3330));
                }
            }
        }
    }
     public static boolean isPermutation(String one, String two, String three)
    {
        char[] characters1 = one.toCharArray();
        Arrays.sort(characters1);
        String x = new String(characters1);
        
        char[] characters2 = two.toCharArray();
        Arrays.sort(characters2);
        String z = new String(characters2);
        
        char[] characters3 = three.toCharArray();
        Arrays.sort(characters3);
        String y = new String(characters3);
        
        
        if(y.equals(z) && z.equals(x)) 
        {
            return true;
        }
        else return false;
    } 
}
