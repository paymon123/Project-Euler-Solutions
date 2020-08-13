
package euler;
import java.util.*;

public class Euler32 {
    
    public Euler32()
    {
        int sum = 0;
        for(int i = 1; i<10000; i++)
        {
            for(int divisor = 1; divisor<=i; divisor++)
            {
                if(i%divisor == 0 && isPandigital("" + i + divisor + i/divisor))
                {
                    sum+= i;
                    break;
                }
            }
        }
        System.out.println(sum);
        
    }
    public static boolean isPandigital(String s)
    {
        if(s.length() !=9) return false;
        
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        String x = new String(characters);
        return x.equals("123456789");
        
        
        
        
    }
}
