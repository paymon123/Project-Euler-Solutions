
package euler;
import java.math.BigInteger;

public class Euler53 {
    public Euler53()
    {
        int sum = 0;
        for(int n = 1; n<=100; n++)
        {
        for(int r = 1; r<=n; r++)
        {
            
            if(combinatorics(n, r).compareTo(BigInteger.valueOf(1000000))>0)
            {
                sum++; 
            }
        }
        }
        System.out.println(sum);
    }
    public BigInteger combinatorics(long n, long r)
    {
        return factorial(BigInteger.valueOf(n)).divide((factorial(BigInteger.valueOf(n-r)).multiply(factorial(BigInteger.valueOf(r)))));
    }
    public BigInteger factorial(BigInteger x)
    {
        if(x.equals(BigInteger.ZERO))
        {
            return BigInteger.ONE;
        }
        for(long i = x.intValue()-1;i>0;i--)
        {
           
            x = x.multiply(BigInteger.valueOf(i));
           
        }
        
        return x;
    }
}
