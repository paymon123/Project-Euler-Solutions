
package euler;
public class Euler45 {
    public Euler45()
    {
    //first value that matches triangular, pentagonal and hexagonal is 40755, where nt = 285. 
    //start nt at 286 (285+1) and then check each t, p and h to see if there is a t p or h higher than it
    //if true, increment that nt, np, or nh respectively 
    //once all three (t, p, and h) equal each other again, loop will stop incrementing and break
    //initially used arrays for a really slow program
    long nt = 286L, np = 165L, nh = 143L;
    while(true)
    {
       long t = (long)(nt * (nt + 1)/2);
       long p = (long)(np * (3 * np -1)/2);
       long h = (long)(nh * (2*nh - 1));
        if(t == p && h == p)
        {
            System.out.println(t + " " + h + " " + p);
            break;
            
        }
        if(t<p || t<h)
        {
            nt++;
        }
        else if (p < h || p < t)
        {
            np++;
        }
        else if (h<t || h<p)
        {
            nh++;
        }
        
    }
    }
}
