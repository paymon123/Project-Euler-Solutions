
package euler;


public class Euler145 {
    Euler145()
    {
        int sum = 0;
        for(int i = 1; i<1000000000; i++)
        {
            if(isReversible(i))sum++;
        }
        System.out.println(sum);
    }
    public boolean isReversible(int i)
    {
        if(i%10 == 0)return false;
        int x = i + reverse(i);
        
        if(oddDigits(x))
        {
            return true;
        }
        return false;
    }
    public int reverse(int l)
    {
        String s = Integer.toString(l);
        String newString = "";
        for(int i = 1; i<=s.length(); i++)
        {
            newString+= s.charAt(s.length()-i);
        }
        return Integer.parseInt(newString);
    }
    public boolean oddDigits(int z)
    {
        String s = Integer.toString(z);
        char[] array = s.toCharArray();
        for(char c: array)
        {
            int x = Character.getNumericValue(c);
            //if a digit is even
            if(x%2 == 0)
            {
                return false;
            }
            
        }
        return true; 
    }
}
