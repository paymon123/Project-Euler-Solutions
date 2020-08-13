
package euler;

import java.math.BigInteger;
public class Euler56 {
    public Euler56()
    {
        int max = 0;
        for(int a = 1; a<100; a++)
        {
            for(int b = 1; b<100; b++)
            {
                BigInteger x = BigInteger.valueOf(a).pow(b);
                char[] s = x.toString().toCharArray();
                int sum = 0; 
                for(char z: s)
                {
                    sum+=Character.getNumericValue(z);
                }
                if (sum>max)
                {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
