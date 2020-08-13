
package euler;

import java.util.Arrays;

//question is basically asking -- what is the largest pandigital containing the products of two integers...
//to solve, computer all possible products of 2 integers, try i*n and increment n, if the string exceeds 9 break the n loop and increment the i
public class Euler38 {
    public Euler38()
    {
        long sum = 0L;
        
        for(int i = 1; i<10000; i++)
        {
            //clear the string for every integer
            String string = "";
            for(int n = 1; n<1000; n++)
            {
                string+=Integer.toString(i*n);
                
                if (string.length()>9)
                    break;
                 if (isPandigital(string))
                 {
                 if(Long.parseLong(string)>sum) 
                 {
                     sum = Long.parseLong(string);
                     System.out.println(sum);
                 }
                 
                 }
                 
            }
        }
       
        
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
