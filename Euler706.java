
import java.math.BigInteger;

public class Euler706
{
    /**

    For a positive integer n, define f(n) to be the number of non-empty substrings of n that are divisible by 3. For example, the string "2573" has 10 non-empty substrings, three of which represent numbers that are divisible by 3, namely 57, 573 and 3. So f(2573)=3.

    If f(n) is divisible by 3 then we say that n is 3-like.

    Define F(d) to be how many d digit numbers are 3-like. For example, F(2)=30 and F(6)=290898.

    Find F(10^5). Give your answer modulo 1000000007.

    **/

    /**
    
    
    You're not going to be performing 1 iteration at a time on 100,000 digit numbers.
    
    Replicate finding the answer using a different algorithm
    
    Follow the instructions to write logic, print results
    
    F(1) = 6  sum = 6 - 3x2
    F(2) = 30  sum = 3 - 3
    F(3) = 342 sum = 9 - 3x3
    F(4) = 3534 sum = 15 - 3x5
    F(5) = 30000 sum = 3 - 3
    F(6) = 290898 sum = 36 3x3x2x2
    F(7) = 3023178 sum = 24 3x8
    F(8) = 30000000 sum = 3
    F(9) =  sum = 81 3x3x2x7 x 2
    --JVM hangs--
    F(9) = ?????? sum - 
    F(10) = ?????? sum = 3*11
    
    cummulative?
    
    18
    132
    2616
    19602
    99888
    
    you want to find f(6)... \
    you know... the sum of the digits
    you know... %f(3)*10 = same 3 digits added onto substring f(6)*10 + substring = 
    
    
    F(6)% F(3) is same 3 digits added onto the string to calculate from F(7) to F(6)
    
    same logic to find F(10) can be used to find F(100k)?


    from the data you can make a few assumptions about the answer:
    
    100,000 % 3 = 1, so it follows the 3x2 3x5 3x8 pattern
    sum of the digits is 300003
    answer is 100,000 digits long
    
    
    my first solution was to increment by 3^3334 and add 6, then check sum of digits but that quickly failed
    because traversing the plane of 100k digits with 3^3334 is impossible
    
    i noticed a relationship when F(7) % F(6), F(4) % F(3), etc
    
    (F(10) % F(9)) = staticString.concat(xxx)
    
    where sumOfDigits(xxx) = 2(3^3)
    
    
    (F(7) % F(6)) = staticString.concat(xxx)
    
    where sumOfDigits(xxx) = 2(3^2)
    
    
    (F(4) % F(3)) = staticString.concat(xxx)
    
    where sumOfDigits(xxx) = 2(3^1)
    
    
    
    when (n%3==1):
    
    (F(n) % F(n-1)) = staticString.concat(xxx)
    
    where sumOfDigits(xxx) = 2(3^((n-1)/3))
    
    
    you can find the sum of the digits of the last 3 integers in F(10) % F(9), how do you find the exact
    value?
    
    
    what if F(9) % F(7) = 1111111110
    if you found f9 from f7, you could multiply f9
    
    check these 2 conditions:
    sum of digits in F(10) = 3*11
    sum of digits in F(9) = 3*3*3*3
    
    
    definitely like the static recursive string idea, create function calculateTail(sum), attempts all possible
    distributions of sum, and if tail meets 2 criteria, finalize and go next
    
    
    


    
    
    

    
    
    **/
    
    public String createRemainder(int digits)
    {
    
        String result = "";
        for(int i =1; i<digits; i++)
        {
            result+="1";
        }
        return result+"0";
    }
    public Euler706()
    {
        
        
        /**System.out.println(F("1"));
        System.out.println(F("2"));
        System.out.println(F("3"));
        System.out.println(F("4"));
        System.out.println(F("5"));
        System.out.println(F("6"));
        System.out.println(F("7"));
        System.out.println(F("8"));
        System.out.println(F("9"));
        System.out.println(F("10"));
        System.out.println(F("11"));**/
        String savedString = "114";
        BigInteger lastThird = new BigInteger("342");
        int pass = 0;
        int nextDigitSum =36;
        int pass1 = 0;
        int passCounter = 8;
        outer:
        for(int n = 6; n< 20; n++)
        {
            
            if(n%3==2)continue;
            if(n%3==0)
            {
                
                
                int sumOfThreeNewDigits = 2*(int)(Math.pow(3,((n)/3)));
               
                int max = sumOfThreeNewDigits <=10? sumOfThreeNewDigits: 10;
               for(int x1=0; x1<=max; x1++)
               {
                   int pool = sumOfThreeNewDigits;
                   pool = pool - x1;
                   
                   for(int x2=0; x2<=max; x2++)
                    {
                       if(x1+x2>sumOfThreeNewDigits)continue;
                       int pool1 = pool-x2;
                       int x3 = pool1;
                       String newString = savedString + Integer.toString(x1) + Integer.toString(x2) + Integer.toString(x3);
                       //System.out.println(newString);
                       
                       BigInteger z = new BigInteger(newString);
                       
                       if(digitSum(newNum.add(z))==3*(n+1))
                       {
                           //System.out.println(newNum.add(z).toString());
                           if(pass1==passCounter){
                               passCounter+=1;
                               pass1 = 0;
                        last = newNum.add(z);
                               savedString = newString;
                               System.out.println(savedString);
                        System.out.println("F(" + n + ") = " + last.toString());
                               continue outer;
                           }
                           pass1++;
                       }
                        
                    }
               }
                
                
                
                
                
                
                
                
            }
            /**if(n%3==1)
            {
               BigInteger newNum = new BigInteger(last.toString()+"0");
               int sumOfThreeNewDigits = 2*(int)(Math.pow(3,((n-1)/3)));
               
                int max = sumOfThreeNewDigits <=10? sumOfThreeNewDigits: 10;
               for(int x1=0; x1<=max; x1++)
               {
                   int pool = sumOfThreeNewDigits;
                   pool = pool - x1;
                   
                   for(int x2=0; x2<=max; x2++)
                    {
                       if(x1+x2>sumOfThreeNewDigits)continue;
                       int pool1 = pool-x2;
                       int x3 = pool1;
                       String newString = savedString + Integer.toString(x1) + Integer.toString(x2) + Integer.toString(x3);
                       //System.out.println(newString);
                       BigInteger z = new BigInteger(newString);
                       
                       if(digitSum(newNum.add(z))==3*(n+1))
                       {
                           //System.out.println(newNum.add(z).toString());
                           if(pass1==passCounter){
                               passCounter+=1;
                               pass1 = 0;
                        last = newNum.add(z);
                               savedString = newString;
                               System.out.println(savedString);
                        System.out.println("F(" + n + ") = " + last.toString());
                               continue outer;
                           }
                           pass1++;
                       }
                        
                    }
               }
               
            }**/
            
            
        }
        
        /**System.out.println(meetsCriterea(1,new BigInteger("6")));
        System.out.println(meetsCriterea(2,new BigInteger("30")));
        System.out.println(meetsCriterea(3,new BigInteger("342")));
        System.out.println(meetsCriterea(4,new BigInteger("3534")));
        System.out.println(meetsCriterea(5,new BigInteger("30000")));
        System.out.println(meetsCriterea(6,new BigInteger("290898")));
        System.out.println(meetsCriterea(7,new BigInteger("3023178")));
        System.out.println(meetsCriterea(8,new BigInteger("30000000")));
        
**/
        
        //BigInteger adder = BigInteger.valueOf(3).pow(33334);
       
        /**
        String startString = "1";
        for(int i = 1; i<100000; i++)
        {
            startString+="0";
        }
        boolean multipleFound = false;
        for(BigInteger i = new BigInteger(startString); ;)
        {
            
                if(!multipleFound)
                {
                    i = i.add(BigInteger.valueOf(1));
                    if(i.mod(adder).compareTo(new BigInteger("0"))==0)multipleFound=true;
                    continue;
                }
                else{
                BigInteger num = i.add(BigInteger.valueOf(6));
                    System.out.println(num.toString().substring(0, 3));
                if(sumOfDigits(num)==300003)
                {
                    System.out.println(num.mod(new BigInteger("1000000007")).toString());
                    return;
                }
                }
            

        }**/

        
        
            
    }
    public boolean divisibleByThree(BigInteger i)
    {
        return digitSum(i) % 3 == 0;
    }

        public int numDigits(BigInteger i)
    {
        return i.toString().length();
    }
    
    public int digitSum(BigInteger i)
    {
        int sum = 0;
        String s = i.toString();
        for (int x = 0; x < s.length(); x++){
            char c = s.charAt(x);        
            sum+= Character.getNumericValue(c);
        }
        return sum;
    }
    
    public boolean threelike(String A)
    {
        int counter=0;
        for (int i = 0; i < A.length(); i++) {
        for (int j = i+1; j <= A.length(); j++) {
        //if the sum of the digits is divisible by 3, then it is divisible by 3
        String s1 = A.substring(i,j);
       
        int sum = 0;
        for (int x = 0; x < s1.length(); x++) {
        char a = s1.charAt(x);
        if (Character.isDigit(a)) {
        int b = Integer.parseInt(String.valueOf(a));
        sum = sum + b;
      }
    }
        
            if(sum%3==0)counter++;
    }
    }
        System.out.println(counter);
        //return sumOfDigits(BigInteger.valueOf(counter));
        return counter%3==0;
    }
    
    public int F(String digits)
    {
        int counter = 0;
        String x = "1";
        for(int i = 0; i<Integer.parseInt(digits)-1; i++)
        {
            x+="0";
        }
        String s = "";
        for(int i = 0; i<Integer.parseInt(digits); i++)
        {
            s+="9";
        }
        BigInteger maxNum = new BigInteger(s);
        BigInteger minNum = new BigInteger(x);
        for(BigInteger i = minNum; i.compareTo(maxNum)<=0; i = i.add(BigInteger.valueOf(1)))
        {
            if(threelike(i.toString()))
                counter++;
        }
        return counter;
        
        
    }
    //find the last 3 digits on modulus string to derive an F(n%3==1) value from F(n%3==0)
    //modulate by 27 if 2(3^((n-1)/3)) > 27?
    
    
    /**public String addToString(int n, String currentString)
    {
        
    }**/
    
    
    public boolean meetsCriterea(int n, BigInteger i)
    {
        if(i.toString().length()!=n)return false;
        if(n%3==0)
        {
            int d = 1;
            int number = n;
            
            for(int f = 2; f< number; f++) {
         while(number%f == 0) {
            d*=f*f;
            number = number/f;
         }
      }
      if(number >= 2) {
          
          d*=number*number;
      }
            
            
            
            
            
            return (digitSum(i) == d);
        }
        if(n%3==2)
        {
            String s = i.toString();
            char[] array = s.toCharArray();
            for(int z = 0; z < array.length; z++)
            {
                int value = Character.getNumericValue(array[z]);
                if(z==0 && value!=3) return false;
                if (z!=0 &&value!=0) return false;
            }
            return true;
        }
        if(n%3==1)
        {
            return digitSum(i) == 3*(n+1);
        }
        
        return false;
    }
        
        
      
    
    
}