
package euler;
import java.math.*;

public class Euler20 {
    public Euler20(BigInteger n)
    {
        for(BigInteger i = n.subtract(BigInteger.ONE); i.compareTo(BigInteger.ZERO) >0; i = i.subtract(BigInteger.ONE))
        {
            n = n.multiply(i);
            
           
        }
    String s = n.toString();
    System.out.println(s);
    int sum = 0;
    for(int i = 0; i<s.length();i++)
    {
        sum+=Character.getNumericValue(s.charAt(i));
        System.out.println(sum);
    }
   
    }
   
}
