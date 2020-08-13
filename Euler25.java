
package euler;
import java.math.*;

public class Euler25 {
    public Euler25()
    {
        BigInteger[] fib = new BigInteger[100000];
        fib[0] = BigInteger.ONE;
        fib[1] = BigInteger.ONE;
        for(int i = 2; i<100000; i++)
        {
            fib[i] = fib[i-1].add(fib[i-2]);
            String answer = fib[i].toString();
            
            try{
            char test = answer.charAt(999);
            System.out.println("term number: " + (i+1));
            System.out.println(answer);
            break;
            }
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("nope");
            }
            
            
        }
    }
}
