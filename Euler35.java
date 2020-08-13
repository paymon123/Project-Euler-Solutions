
package euler;

//code was correct but too slow - required optimization using sieve of Eratosthenes
public class Euler35 {
    static boolean[] circular = new boolean[1000000];
    static boolean[] isPrime = new boolean[1000001];
    
    
    public Euler35()
    {
        //sieve of erat for primes...initially set all to true
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
        
        
        int answer = 0;
        
      
        
        for(int i = 2; i<circular.length; i++)
        {
            if(circular[i])
            {
                continue;
            }
            
            
            if(isPrime[i])
            {
            if( isCircular(i)){
                circular[i] = true;
                
                
               
            }
            }
        }
        for(int  j=2; j<circular.length; j++)
        {
            if(circular[j]) {
                answer++;
                
            }
            
            
            
        }
        System.out.println(answer);
    }
    public boolean isCircular(int x)
    {
        //isCircular initially set to true
        boolean isCircular = true;
        //algorithm to rearrange the digits in a number
        
            //original number here is prime, start rotating
            //rotate 6 times because 6 digits in all numbers under 1 million
            String z = Integer.toString(x);
            for(int i = 0; i<z.length(); i++)
            {
                //i is starting position of new string
                String s ="";
                
                //coutner here to avoid infinite looping, 
                //only loops 3 times since f is reset to zero in the loop occasionally
                int counter = 0;
                
                //loop to reassign the new string variable
                for(int f = i; f<=z.length(); f++)
                {
                if(f == z.length())
                    f = 0;
                s += Character.toString(z.charAt(f));
                counter++;
                if (counter==z.length())
                    break;
                }
    
                //check if new string variable is prime, if true -- move on to next string rotation
                if(isPrime[Integer.parseInt(s)])
                    continue;
                //if false, break the loop and assign the return value to false
                else
                {
                isCircular = false;
                break;}
            }
           
            
            
        
        
        return isCircular;
    }
   
    
    
}
