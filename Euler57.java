package euler;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Euler57 {
/*
 * 
 * determine ending denominator
 * y represents denominator change string
0+/2
y[0] = *2+x[0]   (x[0]=1)
1+/5 
-------------------*2
y[1] = y[0]*2+x[1]   (x[1]=2)
2+/12
-------------------*2+1
y[2] = y[1]*2+ (x[2] = x[1] * 2 * x[0]) or 5
3+/29
-------------------*2+2
y[3] = *2+x[3] (x[3] = x[2] * 2 * x[1]) OR 12
4+/70
-------------------*2+5
y[4] = *2+x[4] (x[4] = x[3] * y[2])
5+/169
-------------------*2+12
*2+70
6+/408
-------------------
*2+169
7+/985
-------------------

  */
 public Euler57()
 {
	 BigDecimal[] y = new BigDecimal[1001];
	 BigDecimal[] x = new BigDecimal[1001];
	 x[1] = BigDecimal.valueOf(1);
	 x[2] = BigDecimal.valueOf(2);
	 y[0] = BigDecimal.valueOf(2);
	 int counter = 0;
	 for(int i = 1; i<1000; i++)
	 { 
		 if(i>2)x[i] = x[i-1].multiply(BigDecimal.valueOf(2)).add(x[i-2]);
		 y[i] = y[i-1].multiply(BigDecimal.valueOf(2)).add(x[i]);
		 BigDecimal n;
		 BigDecimal chunk = BigDecimal.valueOf(2.5);
		 if(i==1) {n=BigDecimal.valueOf(1).divide(chunk, 5, RoundingMode.HALF_EVEN);
		 }
		 else {
		 for(int j = 0; j<i-2; j++)
		 {
			chunk = BigDecimal.valueOf(2).add(BigDecimal.valueOf(1).divide(chunk, 5, RoundingMode.HALF_EVEN));
		 }
		 n=BigDecimal.valueOf(1).divide(chunk, 10, RoundingMode.HALF_EVEN);
		 }
		 //System.out.println((y[i].multiply(n.add(BigDecimal.valueOf(1))).setScale(0, RoundingMode.HALF_EVEN)) + ":" + y[i]);
		 if((y[i].multiply(n.add(BigDecimal.valueOf(1))).setScale(0, RoundingMode.HALF_EVEN)).toString().length()>(y[i]).toString().length() ){counter++;}
		 
	 }
	 System.out.println(counter);
 }
	
}
