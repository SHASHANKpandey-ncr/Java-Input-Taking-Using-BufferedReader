/*


Sample Input:

2  3  1
2  4  16
16 32 96



*/


// Input Format 

// The first line contains three-separated integers,  n, m and q, the number of rows and columns in the matrix and number representing the query.
// The next n lines represent the content of the matrix. 


import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{

    
    public static void main(String[] agrs) throws IOException{
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int tc = Integer.parseInt(input.readLine());
        
        for(int i=0; i<tc; i++){
            
            String[] par = input.readLine().trim().split(" ");
            
             int row = Integer.parseInt(par[0]);
             int col = Integer.parseInt(par[1]);
             int query = Integer.parseInt(par[2]);
             
             int[][] arr = new int[row][col];
             for(int j=0; j<row; j++){
                 
                 int[] arr1 =Stream.of(input.readLine().trim().split(" ")).mapToInt(s->{
                     
                     return Integer.parseInt(s);
                 }).toArray();
                 
                 arr[j] = arr1;
                 
             }
              
              System.out.println(row+" "+col+" "+query);
              System.out.println(Arrays.deepToString(arr));
            
           
        }
        
    }
}
