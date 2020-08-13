
package euler;
public class Euler40 {
    public Euler40()
    {
        int product = 1;
        StringBuilder s = new StringBuilder("");
        for(int i = 1; i<=300000; i++)
        {
            s.append(Integer.toString(i));
        }
        for(int i = 0; i<7; i++)
        {
            
            product*=Character.getNumericValue(s.charAt(((int)Math.pow(10, i)) - 1));
        }
        System.out.println(product);
       
    }
}
