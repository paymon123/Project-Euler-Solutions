
package euler;


public class Euler55 {
    public Euler55()
    {
       int sum = 0;
       for(int i = 1; i<10000;i++)
       {
           if(isLychrel(i))
           {
               sum++;
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
    public long reverse(long l)
    {
        String s = Long.toString(l);
        String newString = "";
        for(int i = 1; i<=s.length(); i++)
        {
            newString+= s.charAt(s.length()-i);
        }
        return Long.parseLong(newString);
    }
    public boolean isLychrel(long x)
    {
        for(int i = 0; i<30; i++)
        {
            x+=reverse(x);
            if(isPalindrome(Long.toString(x)))
            {
                return false;
                
            }
        }
        return true;
    }
}
