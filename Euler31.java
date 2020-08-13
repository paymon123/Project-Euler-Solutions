
package euler;

public class Euler31 {
    public Euler31()
    {
        long answer = 0L;
        int sum = 0;
        for(int p1 = 0; p1<=200; p1++)
        {
            
            for(int p2 = 0; p2<=100; p2++)
            {
                
                
                for(int p5 = 0; p5<=40; p5++)
            {
                
                
                for(int p10 = 0; p10<=20; p10++)
            {
                
                
                for(int p20 = 0; p20<=10; p20++)
            {
                
                
                for(int p50 = 0; p50<=4; p50++)
            {
                
                
                for(int p100 = 0; p100<=2; p100++)
            {
                
                
                for(int p200 = 0; p200<=1; p200++)
            {
                sum=0;
                sum+=p1;
                sum+=(2*p2);
                sum+=(5*p5);
                sum+=(10*p10);
                sum+=(20*p20);
                sum+=(50*p50);
                sum+=(100*p100);
                sum+=(200*p200);
                
                if(sum ==200)
                {
                    answer++;
                    
                    
                }
               
                
                
            }
            }
            }
                
            }
                
            }
                
            }
            }
        }
        System.out.println(answer);
    }
}
