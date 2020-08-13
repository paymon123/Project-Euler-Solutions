
package euler;
import java.util.ArrayList;

public class Euler21 {
    public ArrayList<Integer> amacible= new ArrayList<Integer>();
    boolean b;
    int answer = 0;
    
    //evaluates all amacible numbers under integer n
    public Euler21(int n){
    
    for(int i = 1; i<=n; i++)
    {
        
        if(amacible(i))
        {
            amacible.add(i);
        }
        System.out.println(amacible);
    }
    for(int i =0; i<amacible.size();i++)
    {
        answer+= amacible.get(i);
    }
    System.out.println(answer);
    }
    //returns true or false is number is amacible
    public boolean amacible(int x)
    {
    int sum1 = 0;
    int sum2 = 0;
    for(int i = x/2; i>0; i--)
    {
        if(x%i ==0)
        {
            sum1+=i;
        }
    }
    for(int j = sum1/2; j>0; j--)
    {
        if(sum1%j==0)
        {
            sum2+=j;
        }
    }

    if(sum2 == x && sum1!=sum2){
        
        return true;}
    else
        {
           
        return false;
        }
    }
    
    
}
