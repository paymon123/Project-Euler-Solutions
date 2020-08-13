
package euler;


public class Euler19 {
    public Euler19(){
        int week = 1;
        int sundays =0;
    for(int year = 1900; year<2001; year++)
    {
        boolean leap = false;
        if (year==2000)
            leap = true;
        else if(year%4 == 0)
            leap = true;
        
        
        //jan
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;
            }
        }
        //feb
        if(leap)
        {
            for(int day = 1; day<=29; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;      
            }
  
        }
        }
        else
            for(int day = 1; day<=28; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //march
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //april
        for(int day = 1; day<=30; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //may
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //june
        for(int day = 1; day<=30; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //july
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //august
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //sep
        for(int day = 1; day<=30; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        
        //oct
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //nov
        for(int day = 1; day<=30; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
        //dec
        for(int day = 1; day<=31; day++)
        {
            week++;
            if (week > 7)
                week = 1;
            System.out.println(week);
            if(day == 1 && week == 1&& year>1900)
            {
                sundays++;  
                
            }
        }
    }
    System.out.println(sundays);
}
}
