/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;
import java.util.*;
import java.util.regex.Pattern;


/**
 *
 * @author Paymon
 */
public class Euler51 {
   
    public ArrayList<Integer> primes = new ArrayList<Integer>();
   
    
    
   
    public Euler51(){
        int minPrime = 50000;
        int maxPrime = 500000;
        int familySize = 8;
        generatePrimes(minPrime, maxPrime);
        for(int i: primes)
        {
             ArrayList<String>  temp = new ArrayList<String>();
             ArrayList<String> family = new ArrayList<String>();
             //System.out.println("prime:"+i);
             for(int x = 0; x<Integer.toString(i).length()-1; x++)
             {
                 //System.out.println("::"+attachUnknowns(x, i).toString());
                 temp.addAll(attachUnknowns(x, i));
             }
            // System.out.println("final"+temp.toString());
             for(String s: temp)
             {
                family.clear();
                 for(int f = 0; f<=9; f++)
                 {
                                    

                 String tempS =  s.replaceAll(Pattern.quote("x"), Integer.toString(f));
                 if(Integer.toString(Integer.parseInt(tempS)).length()!=s.length())continue;
                 if(isPrime(Integer.parseInt(tempS))) family.add(tempS);
                 
                 }
                 if(family.size()==familySize)
                 {System.out.println("winner"+family.toString());
                 
                 return;
                 }
                 
             }
             
             
             
        }
        
        
       
        
}
    public boolean isPrime(int x)
    {
        boolean isPrime = true;
        for(int i = 2; i<x; i++)
        {
            if(x%i==0) isPrime=false;
        }
        return isPrime;
    }
    public ArrayList<String> attachUnknowns(int deg, int num){
    boolean deg0 = (deg==0); 
    String numString = Integer.toString(num);
    int totalIterations = numString.length() - deg;
    ArrayList<String> returnArray = new ArrayList<String>();
    for(int i = 1; i<=totalIterations; i++){
    if(deg0){   
    char[] charArray = numString.toCharArray();
    charArray[i-1] = 'x';
    returnArray.add(new String(charArray));
    }    
    else{           
    String prefix = numString.substring(0, i);
    char[] charArray = prefix.toCharArray();
    charArray[charArray.length-1] = 'x';
    prefix = new String(charArray);
    String trimmedNumString = numString.substring(i);
    
    //attach prefix to responses from iterative call
    
    ArrayList<String> temp = attachUnknowns(deg-1, Integer.parseInt(trimmedNumString));
    
    for(String s: temp)
    {
    String result = prefix + s;
    returnArray.add(result);
    }
    }
    
    }
    return returnArray;
    }
    
    
    

/*data
(0, 123)
i1- *23
i2- 1*3
i3- 12*
public String[] starRoller(int num)
//returns x strings based off of digits in num... ie 123 returns *23, 1*3, 12*
p1 *, p2 1*, 
(d1, 123456)
6 responses-*23456, 1*3456...
    
(d1, 23456)
5 reponses-*3456, 2*456, 23*56, 234*6, 2345*, 
 
(d1, 123456)
i=1-* + starRoller(23456)
i=2-1* + starRoller(3456)     
i=2-12* + starRoller(456)
i=3-123* + starRoller(56)
i=4-1234* + starRoller(6)
    

(d1, 23456)
4r - * + sr(3456)
3r - 1* + sr(456)
2r - 12* + sr(56)
1r - 123* + sr(6)

this function takes # of integers in num, subtracts degree,
public ArrayList<String> attachUnknowns(int deg, int num){
    boolean deg0 = (deg==0); 
    String numString = Integer.toString(num);
    int totalIterations = numString.length() - deg;
    ArrayList<String> returnArray = new ArrayList<String>();
    for(int i = 1; i<=totalIterations; i++)
    {
    
    String prefix = numString.charAt(i-1);
    String trimmedNumString = numString(i);
    //attach prefix to responses from iterative call
    newDeg = (deg0) ? 0 : deg-1; 
    ArrayList<String> temp = coolFunction(deg?deg - 1, trimmedNumString)
    
    for(String s: temp)
    {
    String result = prefix + s;
    returnArray.add(result);
    }
    }
    return returnArray;
    }
    
    

    
    
    
    
4r-* + (d1, 23456)  
3r-1* + (d1, 3456) 
2r-12* + (d1, 456) 
1r-123* + (d1, 56) 




*/
    /*
    public String[] replaceDegreeNumbersWithStars(int degree, int number)
    {
        
        String string = Integer.toString(number);
        //returns number of strings equal to digits in input number
        String[] returnArray = new String[string.length()];
        
        char[] ca = string.toCharArray();
        for(int i = 0; i< degree; i++)
        {
            
        }
        
    }*/
    public void generatePrimes(int min, int max)
    {
        for(int i = min; i <=max; i++)
        {
            boolean isPrime = true;
            for(int z = 2; z < i; z++)
            {
                
                if(i%z == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)primes.add(i);
          
        }
    }
    
    
    

}
