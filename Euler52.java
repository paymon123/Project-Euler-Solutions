
package euler;
import java.util.Arrays;
public class Euler52 {
    public Euler52()
    {
        for(int i = 125874; i<10000000;i++)
        {
        if(sameDigits(Integer.toString(i),Integer.toString(i*2))
                &&sameDigits(Integer.toString(i),Integer.toString(i*3))
                &&sameDigits(Integer.toString(i),Integer.toString(i*4))
                &&sameDigits(Integer.toString(i),Integer.toString(i*5))
                &&sameDigits(Integer.toString(i),Integer.toString(i*6)))
        {
            System.out.println(i);
        }
        }
    }
    public boolean sameDigits(String a, String b)
    {
        char[] characters1 = a.toCharArray();
        Arrays.sort(characters1);
        String x = new String(characters1);
        
        char[] characters2 = b.toCharArray();
        Arrays.sort(characters2);
        String z = new String(characters2);
        
        
        if(x.equals(z))
        {
            return true;
        }
        return false;
    }
    
}
