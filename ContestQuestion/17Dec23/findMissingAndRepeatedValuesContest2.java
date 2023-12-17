import java.util.*;

public class  findMissingAndRepeatedValuesContest2 {
    
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        
        Set<Integer> set  = new HashSet<>();
        int [] list = new int[2];
        int missing = 0;
        
        
       
         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int element = grid[i][j];
                 if(!set.add(element))
                {
                     list[0]= element;
                    
                }
                
            }
         }
        
        for(int i=1 ; i <grid.length * grid[0].length; i++)
        {
            if(!set.contains(i))
            {
               missing = i;
               break;
            }
            
        }
        list[1] = missing;
        
        for(int i=0; i< list.length; i++)
        {
            if(list[i]==0)
            {
              int val= grid.length * grid[0].length;
                
                list[1] = val;
                break;
        }
        }
       
        return list;
       
        
    }
    public static void main(String args[]) {
      int [][] grid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 9, 10, 11},
            {12, 13, 14, 15}
        };

        int[] result = findMissingAndRepeatedValues(grid);

        System.out.println("Number of Repeated Elements: " + result[0]);
        System.out.println("Missing Value: " + result[1]);
    }
}