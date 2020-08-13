
package euler;

public class Euler33 {
    public Euler33()
    {
        //declare the final answers
        int sumNum = 1;
        int sumDenom = 1;
        //double loop through all numerator/denominator combinations that come out to less 
        //than one, with 2 digits in the top and bottom
        
        for(int denominator =10; denominator <100; denominator++)
        {
            for(int numerator = 10; numerator < denominator; numerator++)
            {
                int simpNum = numerator;
                int simpDenom = denominator;
                //simplify fraction into the base - simpNum, simpDenom
                for(int i = simpNum; i>1; i--)
                {
                    if(simpNum%i == 0 && simpDenom %i == 0)
                    {
                        simpNum = simpNum/i;
                        simpDenom = simpDenom/i;
                        
                    }
                }
                
                //multiply the base by 2,3,4,5...
                for(int i = 1; i<100; i++)
                {
                    int num = simpNum * i;
                    int denom = simpDenom *i; 
                    if (num>99 || denom > 99) break;
                    
                    
                    String numeratorS = Integer.toString(numerator);
                    String denominatorS = Integer.toString(denominator);
                    
                    if(Character.getNumericValue(numeratorS.charAt(0)) == Character.getNumericValue(denominatorS.charAt(1)))
                    {
                        if(Character.getNumericValue(numeratorS.charAt(1)) == num && Character.getNumericValue(denominatorS.charAt(0)) ==denom)
                        {
                           sumNum *= numerator;
                           sumDenom *= denominator;
                        }
                    }
                    if(Character.getNumericValue(numeratorS.charAt(1)) == Character.getNumericValue(denominatorS.charAt(0)))
                    {
                        if(Character.getNumericValue(numeratorS.charAt(0)) == num && Character.getNumericValue(denominatorS.charAt(1)) ==denom)
                        {
                           sumNum *= numerator;
                           sumDenom *= denominator;
                        }
                    }
                    
                    

        //if first digit numerator = second digit denominator 
            //if second digit numerator = simpNum AND first digit denominator = simpDenom
                //answer*=simpNum/simpDenom
        //if second digit numerator = first digit denominator
            //if first digit numerator = simpNum AND second digit denominator = simpDenom
                //answer*=simpNum/simpDenom
                }
 
            }
        }
        //not simplified anwer
        System.out.println(sumNum + " " + sumDenom);
        
        //simplification code
        for(int i = sumNum; i>1; i--)
                {
                    if(sumNum%i == 0 && sumDenom %i == 0)
                    {
                        sumNum = sumNum/i;
                        sumDenom = sumDenom/i;
                        
                    }
                }
        //simplified
        System.out.println(sumNum + " " + sumDenom);
    }
}
