
package euler;

import java.math.BigInteger;
public class Euler36 {
    
    public Euler36()
    {
        int sum = 0;
        for(int i = 1; i<1000000; i++)
        {
            if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i)))
                    {
                        sum+=i;
                    }
        }
        System.out.println(sum);
        
    }
    public boolean isPalindrome(String s)
    {
        boolean isPalindrome = true;
       
        for(int i = 0; i<=s.length()/2; i++)
        {
           
            if(Character.getNumericValue(s.charAt(i))!=Character.getNumericValue(s.charAt(s.length()-1-i)))
            {
            isPalindrome = false;
    
            break;
            }
        }
        return isPalindrome;
    }
}
