
package euler;
import java.util.ArrayList;

public class Euler23 {
    public ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
    boolean[] abundantSums = new boolean[28124];
    long answer = 0L;
   
    public Euler23(){
        
    //initially set all abundantSums to false
    for(int i = 0; i<abundantSums.length;i++)
    {
        abundantSums[i] = false;
    }
     
    //loop through all numbers in problem -- 
        for(int i = 0; i<abundantSums.length;i++)
        {
            //if the number is abundant, create all possible combinations of adding it to a previous numbers
            if(isAbundant(i))
            {
                abundantNumbers.add(i);
                for(int j =0; j<abundantNumbers.size();j++)
                {
                    int sum = i + abundantNumbers.get(j);
                    
                    //capping here to avoid arrayIndexOutofBoundsException
                    if (sum <= 28123)
                    abundantSums[sum] = true;

                }
            }
        }
    for(int i = 1; i<abundantSums.length;i++)
    {
        if(!abundantSums[i])
        {
            answer += i;
        }
    }
    System.out.println(answer);
        
        //first, list down all abundant numbers
        //then, loop through that list and add each previous abundant number through a second loop
        //flag all the sums as true
        //loop through all remaining numbers, adding it to answer if it is false
        //PROBLEMS: had problems with arrayindexoutofboundsexception because was not capping at 28123
    }
    public boolean isAbundant(int n)
    {
        int sum = 0;
        for(int i = n/2; i>0; i--)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n)
        {
            return true;
        }
        else
            return false;
    }
}
