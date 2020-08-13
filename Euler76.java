
package euler;


public class Euler76 {
    Euler76()//copied code from math blog...tried to understand it
    {
        int target = 100;
        int[] ways = new int[target + 1];
        ways[0] = 1;
  
        for (int i = 1; i <= 99; i++) {
        for (int j = i; j <= target; j++) {
        ways[j] += ways[j - i];
                }
                }
        System.out.println(ways[100]);
    }
}
