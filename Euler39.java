
package euler;
import java.math.*;

public class Euler39 {
    public Euler39()
    {
        int maxSolutions = 0;
        for(int p = 1; p<=1000; p++)
        {
            int solutions = 0;
            for(int a = 1; a<500; a++)
            {
                for(int b = a; b<500; b++)
                {
                    
                    double c = Math.sqrt((a*a)+(b*b));
                    
                    if (c%1 != 0)
                        continue;
                    if (a+b+c == p)
                    {
                        solutions++;  
                    }
                }
            if (solutions > maxSolutions){
                        maxSolutions = solutions;
                        System.out.println("solutions = " + maxSolutions + " p = " + p);
                        
            }
            }
        }
    }
}
