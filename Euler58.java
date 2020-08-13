package euler;
import java.util.ArrayList;

public class Euler58 {
	private boolean[] isPrime;
	Euler58()
	{
		int n = 1000000000;
		isPrime = new boolean[n+1];
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
		ArrayList diagonals = new ArrayList<Integer>();
		int counter = 4;
		int length = 0;
		int number = 1;
		
		while(true)
		{
			
			
			diagonals.add(number);
		
			
			
			
			if(number==49)
			{
				System.out.println(getRatio(diagonals));
				System.out.println(diagonals);
			}

			if(getRatio(diagonals) <0.1)
			{
				System.out.println(getRatio(diagonals));
				break;
			}
			
			if(counter == 4)
			{
				counter = 0;
				length+=2;
			}
			
			number+=length;
			
			counter++;
			
			
			
				
			
		}
		System.out.println(length+1);
	}
	public double getRatio(ArrayList<Integer> diagonals)
	{
		double primes = 0;
		for(int x: diagonals)
		{
			if (isPrime[x])
			{
				primes++;
			}
			
		}
	
		if(diagonals.size() <2)
		{
			return 1;
		}

		return (primes/(diagonals.size()));
		
		
	}
	
	

}
