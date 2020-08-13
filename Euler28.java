
package euler;


public class Euler28 {
    public Euler28()
    {
    int sum = 0;
    int[][] grid = new int[1003][1003];
    //0 for right, 1 for down, 2 for left, 3 for up
    int direction = 0;
    
    int xpos = 501;
    int ypos = 501;
    for(int i = 1; i<=1001*1001; i++)
    {
       
       grid[xpos][ypos] = i;
       //switch direction
        if(i==1)
       {
           direction = 0;
       }
        else{
       //to switch to going down (1), all sides must be 0 except x-1
       if (grid[xpos - 1][ypos] != 0 && grid[xpos + 1][ypos] == 0 && grid[xpos][ypos + 1] == 0 && grid[xpos][ypos - 1] == 0)
           direction = 1;
       //to switch to going left, all sides must be 0 except y-1
       if (grid[xpos][ypos - 1] != 0 && grid[xpos + 1][ypos] == 0 && grid[xpos][ypos + 1] == 0 && grid[xpos - 1][ypos] == 0)
           direction = 2;
       //to switch to going up, all sides must be 0 except x+1
       if (grid[xpos +1][ypos] != 0 && grid[xpos -1][ypos] == 0 && grid[xpos][ypos + 1] == 0 && grid[xpos][ypos - 1] == 0)
       direction = 3;
       //to switch to going right, all sides must be 0 except y+1
       if (grid[xpos][ypos + 1] != 0 && grid[xpos - 1][ypos] == 0 && grid[xpos][ypos -1] == 0 && grid[xpos + 1][ypos] == 0)
           direction = 0;
        }
       //implement direction
       if(direction == 0)
           xpos++;
       if(direction == 1)
           ypos++;
       if(direction == 2)
           xpos--;
       if(direction == 3)
           ypos--;
       
    }
    for(int i = 0;i<1003; i++)
    {
         for(int j = 0;j<1003; j++)
         {
         if(grid[j][i] < 10)
         {
             System.out.print(" ");
         }
         System.out.print(grid[j][i] + " ");
         }
         System.out.println();
    }
    //calculate sum of diagonals
    for(int i = 0; i<1003;i++)
    {
        sum+=grid[i][i];
    }
    
    int x = 0;
    for(int y = 1002; y>=0;y--)
    {
        sum+=grid[x][y];
        x++;
        
    }
    System.out.println(sum -1);
    
    }
    
    
}
