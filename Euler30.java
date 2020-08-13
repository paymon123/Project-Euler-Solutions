
package euler;
import java.math.*;

public class Euler30 {
    
    /*Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
    */
    public Euler30()
    {
        int answer = 0;
        for(long i = 2; i<1000000L; i++)
        {
            
            long sum = 0L;
            String number = Long.toString(i);
            for(int s = 0; s<number.length(); s++)
            {
                sum+=Math.pow(Character.getNumericValue(number.charAt(s)), 5);
            }
            if (sum == i)
            {
                System.out.println(i);
                answer+=i;
            }
                
        }
        System.out.println("answer = " + answer);
    }
    
}
