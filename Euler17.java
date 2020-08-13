
package euler;

public class Euler17 {
    public static void euler17()
    {
        int[] number = new int[1001];
        int letters = 0;
        
        for(int i = 1; i<number.length; i++)
        {
            int l = 0;
            String string = Integer.toString(i);
            
            if (i==1000)
            {
                number[i] = 11;
                System.out.println(i);
                System.out.println(number[i]);
                continue;
            }
            
            if(i%100 == 10)
            {
                //ten
                l+=3;
            }
            if(i%100 == 11)
            {
                //eleven
                l+=6;
            }
            if(i%100 == 12)
            {
                //twelve
                l+=6;
            }
            if(i%100 == 13)
            {
                //thirteen
                l+=8;
            }
            if(i%100 == 14)
            {
                //fourteen
                l+=8;
            }
            if(i%100 == 15)
            {
                //fifteen
                l+=7;
            }
            if(i%100 == 16)
            {
                //sixteen
                l+=7;
            }
            if(i%100 == 17)
            {
                //seventeen
                l+=9;
            }
            if(i%100 == 18)
            {
                //eighteen
                l+=8;
            }
            if(i%100 == 19)
            {
                //nineteen
                l+=8;
            }
            //first digit
            if (i<10 || i>99)
            {
            if(Character.getNumericValue(string.charAt(0)) == 1 || 
                    Character.getNumericValue(string.charAt(0)) ==2 ||
                    Character.getNumericValue(string.charAt(0)) ==6
                    )
            {
                l += 3;
                //adds "hundred" + "and" = 10
                if(i>99 && i%100!=0)
                {
                    l+=10;
                }
                //adds "hundred" = 7
                else if(i%100 ==0)
                {
                    l+=7;
                }
                
            }
            if(Character.getNumericValue(string.charAt(0)) == 4 ||
                    Character.getNumericValue(string.charAt(0)) ==5
                    ||Character.getNumericValue(string.charAt(0)) ==9)
            {
               l += 4;
               //adds "hundred" + "and" = 10
                if(i>99 && i%100!=0)
                {
                    l+=10;
                }
                //adds "hundred" = 7
                else if(i%100 ==0)
                {
                    l+=7;
                }
            }
            if(Character.getNumericValue(string.charAt(0)) ==3 ||
                    Character.getNumericValue(string.charAt(0)) ==7||
                    Character.getNumericValue(string.charAt(0)) ==8)
            {
                l += 5;
                //adds "hundred" + "and" = 10
                if(i>99 && i%100!=0)
                {
                    l+=10;
                }
                //adds "hundred" = 7
                else if(i%100 ==0)
                {
                    l+=7;
                }
            }
            }
            //last digit and second to last digit only calculated if not in teens...ie 219, 214, 114, n1n
            if (i>19 && Character.getNumericValue(string.charAt(string.length()-2)) !=1)
            {
                //add last digit value...one...two...three
                
            if(Character.getNumericValue(string.charAt(string.length()-1)) == 1 || 
                    Character.getNumericValue(string.charAt(string.length()-1)) ==2 ||
                    Character.getNumericValue(string.charAt(string.length()-1)) ==6
                    )
            {
                //one..two...six
                l += 3;
                
            }
            if( Character.getNumericValue(string.charAt(string.length()-1)) == 4 ||
                    Character.getNumericValue(string.charAt(string.length()-1)) ==5
                    ||Character.getNumericValue(string.charAt(string.length()-1)) ==9)
            {
                //four, five, nine
               l += 4;
            }
            if(Character.getNumericValue(string.charAt(string.length()-1)) ==3 ||
                    Character.getNumericValue(string.charAt(string.length()-1)) ==7||
                    Character.getNumericValue(string.charAt(string.length()-1)) ==8)
            {
                //three, seven, eight...
                l += 5;
            }
            
            //add second to last digit values...twenty...thirty...fourty
            
            if(Character.getNumericValue(string.charAt(string.length()-2)) ==2||
                    Character.getNumericValue(string.charAt(string.length()-2)) ==3
                    ||Character.getNumericValue(string.charAt(string.length()-2)) ==8
                    ||Character.getNumericValue(string.charAt(string.length()-2)) ==9)
            {
                //twenty, thirty, eighty, ninety..
                l+=6;
            }
            if(Character.getNumericValue(string.charAt(string.length()-2)) ==5
                    ||Character.getNumericValue(string.charAt(string.length()-2)) ==4
                    ||Character.getNumericValue(string.charAt(string.length()-2)) ==6)
            {
                //forty, fifty, sixty..
                l+=5;
            }
            if(Character.getNumericValue(string.charAt(string.length()-2)) ==7)
            {
                //seventy..
                l+=7;
            }
            }
            number[i] = l;
            System.out.println(i);
            System.out.println(number[i]);
            
                   
        }
        for(int i = 0; i<number.length; i++)
        {
           letters += number[i];
            
        }
        System.out.println(letters);
        
        
	
                

}
    
}