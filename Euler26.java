
package euler;
import java.math.*;
public class Euler26 {
    public Euler26()
    {
  int sequenceLength = 0;
            int num = 0;

            for (int i = 1000; i > 1; i--) {
                if (sequenceLength >= i) {
                    break;
                }

                int[] foundRemainders = new int[i];
                int value = 1;
                int position = 0;

                while (foundRemainders[value] == 0) {
                    foundRemainders[value] = position;
                    value *= 10;
                    value %= i;
                    position++;
                    System.out.print(foundRemainders[value]);
                }
                

                if (position - foundRemainders[value] > sequenceLength) {
                    num = i;
                    sequenceLength = position - foundRemainders[value];                    
                }
                System.out.println();
                
                
                
                
                
    }
            
            
            
}

}
