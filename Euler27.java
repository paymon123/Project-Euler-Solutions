
package euler;


public class Euler27 {
    
    Euler27(){
    int maxPrimes = 0;
    for(int a = -999; a <1000; a++)
    {
        for(int b = -999; b<1000; b++)
        {
            
            int primes = quadratic(a,b);
            
            
            if (primes > maxPrimes)
            {
                maxPrimes = primes;
                System.out.println();
                System.out.println(maxPrimes);
                System.out.println("a: " + a + " b: " + b);
                System.out.println(a*b);
            } 
        }
    }
            
    
    
    }
    public int quadratic(int a, int b)
    {
        int primes = 0;
        
        //n^2 + an + b
        for(int n = 0;n >=0; n++)
        {
            int answer = Math.abs((n * n) + (a * n) + (b));
          
            
            if (isPrime(answer))
            {
                primes++;
            }
            else
            {
                break;
            }
        }
        return primes;
    }
    public boolean isPrime(int answer)
    {
        boolean prime = true;
        for(int i = answer-1; i>1; i--)
        {
            if (answer%i == 0)
               {
                 prime = false;
                 
               }
        }
        return prime;
        
    }
    
}

