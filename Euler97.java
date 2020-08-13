
package euler;
import java.math.BigInteger;

public class Euler97 {
    public Euler97()
    {
    BigInteger x = BigInteger.valueOf(2).pow(7830457);
    BigInteger y = BigInteger.valueOf(28433).multiply(x);
    BigInteger z = y.add(BigInteger.ONE);
    
    String string = z.toString();
    String substring = string.substring(string.length()-10, string.length());
    System.out.println(substring);
    }
    
}
