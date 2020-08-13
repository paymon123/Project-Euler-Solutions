
package euler;
import java.util.Arrays;
public class Euler79 {//easily solvable by hand using the data output
    String s = "319" +
"680" +
"180" +
"690" +
"129" +
"620" +
"762" +
"689" +
"762" +
"318" +
"368" +
"710" +
"720" +
"710" +
"629" +
"168" +
"160" +
"689" +
"716" +
"731" +
"736" +
"729" +
"316" +
"729" +
"729" +
"710" +
"769" +
"290" +
"719" +
"680" +
"318" +
"389" +
"162" +
"289" +
"162" +
"718" +
"729" +
"319" +
"790" +
"680" +
"890" +
"362" +
"319" +
"760" +
"316" +
"729" +
"380" +
"319" +
"728" +
"716";
    Euler79()
    {
    //two dimensional array to represent answer
    
    String[][] comesafter= new String[10][10];
    String[][] comesbefore = new String[10][10];
    char[] array = s.toCharArray();
    int counter = 0;
    int[] capos = new int[10];
    int[] cbpos = new int[10];
    for(int x = 0; x<array.length;x++)
    {
        //first element in a login attempt
        if (counter ==0)
        {
            if(!Arrays.asList(comesafter[Character.getNumericValue(array[x])]).contains(Character.toString(array[x+1])))
            {
            comesafter[Character.getNumericValue(array[x])][capos[Character.getNumericValue(array[x])]] = Character.toString(array[x+1]);
            capos[Character.getNumericValue(array[x])]++;
            }
            if(!Arrays.asList(comesafter[Character.getNumericValue(array[x])]).contains(Character.toString(array[x+2])))
            {
            comesafter[Character.getNumericValue(array[x])][capos[Character.getNumericValue(array[x])]] = Character.toString(array[x+2]);
            capos[Character.getNumericValue(array[x])]++;
            }
        }
        else if (counter ==1)
        {
            //second element in a login attempt
            if(!Arrays.asList(comesafter[Character.getNumericValue(array[x])]).contains(Character.toString(array[x+1])))
            {
            comesafter[Character.getNumericValue(array[x])][capos[Character.getNumericValue(array[x])]] = Character.toString(array[x+1]);
            capos[Character.getNumericValue(array[x])]++;
            }
            if(!Arrays.asList(comesbefore[Character.getNumericValue(array[x])]).contains(Character.toString(array[x-1])))
            {
            comesbefore[Character.getNumericValue(array[x])][cbpos[Character.getNumericValue(array[x])]] = Character.toString(array[x-1]);
            cbpos[Character.getNumericValue(array[x])]++;
            }
        }
        else if (counter == 2)
        {
            //third element in a login attempt
            if(!Arrays.asList(comesbefore[Character.getNumericValue(array[x])]).contains(Character.toString(array[x-1])))
            {
            comesbefore[Character.getNumericValue(array[x])][cbpos[Character.getNumericValue(array[x])]] = Character.toString(array[x-1]);
            cbpos[Character.getNumericValue(array[x])]++;
            }
            if(!Arrays.asList(comesbefore[Character.getNumericValue(array[x])]).contains(Character.toString(array[x-2])))
            {
            comesbefore[Character.getNumericValue(array[x])][cbpos[Character.getNumericValue(array[x])]] = Character.toString(array[x-2]);
            cbpos[Character.getNumericValue(array[x])]++;
            }
            
        }
        if (counter==2)
        {
        counter = 0;
        }
        else counter++;  
    }
    //represent answer data structure visually
        for(int i = 0; i<comesbefore.length;i++)
    {
        System.out.print("comes before " + i + ": ");
        for(int j = 0; j<comesbefore.length; j++)
        {
            if(comesbefore[i][j]!=null)
            System.out.print(comesbefore[i][j]+ " ");
        }
        System.out.println();
    }
        for(int i = 0; i<comesafter.length;i++)
    {
        System.out.print("comes after " + i + ": ");
        for(int j = 0; j<comesafter.length; j++)
        {
            if(comesafter[i][j]!=null)
            System.out.print(comesafter[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
