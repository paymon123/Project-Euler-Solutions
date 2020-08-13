
package euler;

public class Euler34 {
    //notes: logic was correct but the code was taking far too long so i looked up ways to optimize 
    public Euler34()
    {
        int answer = 0;
        for(long i = 3; i<10000000; i++)
        {
            int sum = 0;
            String s = Long.toString(i);
            for(int j = 0; j<s.length(); j++)
            {
                sum+= factorial(Character.getNumericValue(s.charAt(j)));
                if(sum > i)
                    break;
            }
            if(sum == i)
            {
                answer+=i;
            }
        }
        System.out.println(answer);
      
    }
    int factorial(int n)
    {
        //hard coded factorials are much faster than recalculating every time
       int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
       n  = FACTORIAL[n];
       return n; 
    }
}
