
package euler;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Collections;
public class Euler119 {
    Euler119()
    {
       
        ArrayList<BigInteger> array = new ArrayList<BigInteger>();
        outer:
        for(BigInteger base = BigInteger.ONE; base.compareTo(BigInteger.valueOf(1000))!=0; base = base.add(BigInteger.ONE))
        {
            for(int exp = 1; exp < 500; exp++)
            {
                BigInteger number = base.pow(exp);
                if(number.compareTo(BigInteger.valueOf(10))>0)
                if (base.equals(getSum(number.toString())))
                {
                    array.add(number);
                    
                    //the reason we calculate 50 instead of 30 is because the numbers are not added
                    //in an ascending numeric order, so a(30) misses the number by skipping over it
                    if(array.size()==50)
                    {
                        Collections.sort(array);
                        System.out.println(array);
                        System.out.println(array.get(29));
                        break outer;
                    }
                }
            }
        }
    }
    public BigInteger getSum(String s)
    {
        BigInteger result = BigInteger.ZERO;
        char[] array = s.toCharArray();
        for(char c: array)
        {
            result = result.add(BigInteger.valueOf(Character.getNumericValue(c)));
        }
        
        return result;
    }
    
}
