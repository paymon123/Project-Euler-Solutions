
package euler;

import java.util.ArrayList;
//the first number in the output is the answer... took a while to reach
public class Euler44 {
   public Euler44()
   {
       ArrayList<Integer> pentagonal = new ArrayList<Integer>();
       for(int i = 1; i<10000; i++)
       {
           pentagonal.add((int)(i*(3*i-1)/2));
           
       }
       for(int x = 0; x<pentagonal.size(); x++)
       {
           int k = pentagonal.get(x);
           for(int i = x+1; i<pentagonal.size(); i++)
           {
               
               int j = pentagonal.get(i);
               
               //sum
               int sum = j+k;
               int diff = Math.max(j,k) - Math.min(j,k);
               
               
               if(pentagonal.contains(sum) && pentagonal.contains(diff))
               {
                   System.out.println(diff);
               }
           }
       }
   }
}
