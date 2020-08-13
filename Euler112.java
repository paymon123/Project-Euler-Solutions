
package euler;

public class Euler112 {
    Euler112()
    {
        double bouncies = 0;
        double nonbouncies = 0;
        for(int i = 1; i<=10000000; i++)
        {
            if(isBouncy(i))bouncies++;
            else nonbouncies++;
            double ratio = bouncies/(nonbouncies+bouncies);
            if (ratio == 0.99)
            {
                System.out.println(i);
                break;
            }
        }
        
    }
    public boolean isBouncy(int i)
    {
        if(i<100)return false;
        if(!isDecreasing(i) && !isIncreasing(i))
        {
            return true;
        }
        return false;
    }
    public boolean isIncreasing(int i)
    {
        String s = Integer.toString(i);
        char[] c = s.toCharArray();
        int x = Character.getNumericValue(c[0]);
        for(char z: c)
        {
            if(Character.getNumericValue(z)>=x)
            {
                x= Character.getNumericValue(z);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public boolean isDecreasing(int i)
    {
        String s = Integer.toString(i);
        char[] c = s.toCharArray();
        int x = Character.getNumericValue(c[0]);
        for(char z: c)
        {
            if(Character.getNumericValue(z)<=x)
            {
                x= Character.getNumericValue(z);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
