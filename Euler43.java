
package euler;

import java.util.Arrays;


public class Euler43 {
    //answer took 37 minutes to calculate .. look into ways to optimize
    public Euler43()
    {
        long sum = 0L;
        for(long i = 1000000000L; i<=9876543210L; i++)
        {
            if(isPandigital(Long.toString(i)) && hasProperty(Long.toString(i)))
            {
                sum+=i;
                System.out.println(i);
            }
            
        }
        System.out.println(sum);
    }
    public static boolean isPandigital(String s)
    {
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        String x = new String(characters);
        String z = "0123456789";
        return x.equals(z);    
    } 
    public static boolean hasProperty(String s)
    {
        int divisor = 2;
        boolean property = true;
        for(int i = 1; i<8; i++)
        {
        String x = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1)) + Character.toString(s.charAt(i+2)); 
        boolean b = (Integer.parseInt(x)%divisor==0);
        
        if(divisor==2) divisor++;
        else if(divisor == 7 || divisor == 13) divisor+=4;
        else divisor+=2;
        
            
        if(!b)
            {
            property = false;
            break;
            }
        }
        
       return property;
    }
    
}
