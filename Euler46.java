package euler;
public class Euler46 {
    
    //coded unoptimized, looked up solutions to optimize code, runs quickly, first number output is answer
    static final int n = 100000000;
    static boolean[] isPrime = new boolean[n+1];
    public Euler46()
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
        
        //loop through all composite numbers that are odd
        outer:
        for(int i = 9;; i+=2)
        {
            
            if(!isPrime[i])
            {
                
                
                   
             for(int sq = 1; sq*sq*2<=i; sq++)
             {
                 
                 //if even one of these is prime, it satisfies the conjecture
                 if (isPrime[(i-(sq*sq*2))])
                 {
                    
                    
                    continue outer; 
                 }
                
                 
             }
             //if the condition above is met just once for all values of sq and i, then the outer i loop
             //will continue and 
             //this line will not be reached
             System.out.println(i);
            }
        }
    }
   
	
}
