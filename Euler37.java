
package euler;

public class Euler37 {
    
     static boolean[] isPrime = new boolean[1000001];
     public Euler37()
     {
         int sum = 0;
         //sieve of shit for primes...initially set all to true
        for (int i = 2; i <= 1000000; i++) {
            isPrime[i] = true;
        }
         // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= 1000000; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= 1000000; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        
        for(int i = 10; i<1000000; i++)
    
        {
            if(isTruncatable(i))
            {
               sum+=i;
            }
        }
        
        System.out.println(sum);
     }
     public boolean isTruncatable(int x)
     {
         boolean truncatable = true;
         
         String s = Integer.toString(x);
         
         //left trunacatable
         for(int i = 0; i <s.length(); i++)
         {
             String string = s.substring(i, s.length());
             if(!isPrime[Integer.parseInt(string)])
             {
                 truncatable = false;
             }
         }
         
         //right truncatable
         for(int i = 0; i <s.length(); i++)
         {
             String string = s.substring(0, s.length()-i);
              if(!isPrime[Integer.parseInt(string)])
             {
                 truncatable = false;
             }
         }
         
         return truncatable;
     }
     
     
}
