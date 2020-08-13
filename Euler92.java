
package euler;


public class Euler92 {
    Euler92()
    {
        int sum = 0;
        for(int i = 2; i <=10000000; i++)
        {
            if(arrivesAt89(Integer.toString(i)))
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
    public boolean arrivesAt89(String s)
    {
        while(true)
        {
        int sum = 0;
        char[] characters = s.toCharArray();
        for(char x: characters)
        {
            sum+=Character.getNumericValue(x)*Character.getNumericValue(x);
        }
        if(sum==89)
        {
            return true;
        }
        if(sum==1)
        {
            return false;
        }
        s = Integer.toString(sum);
        }
    }
}
