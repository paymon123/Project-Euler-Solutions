
package euler;
import java.math.BigInteger;

public class Euler48 {
    public Euler48()
    {
        BigInteger answer = BigInteger.ZERO;
        for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(1001))!= 0;i = i.add(BigInteger.ONE))
        {
            answer = answer.add(i.pow(i.intValue()));
            
        }
        String s = answer.toString();
        String x = s.substring(s.length() - 10);
        System.out.println(x);
       
    }
}
