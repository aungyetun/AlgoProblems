/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apple;

/**
 *
 * @author aung
 */
/*
Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
*/
import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> array = new ArrayList<Integer> ();
        for(int i =0; i<size*size;i++){
            array.add(scan.nextInt());
        }
        int primary = 0;
        int count1 = size+1;
        for(int m =0; m <array.size();m=m+count1){
            primary = primary +array.get(m);
        }
        
        int secondary = 0;
        int count2 = size-1;
        for(int n = size-1;n<array.size()-1;n=n+count2){
            secondary = secondary + array.get(n);
        }
        System.out.println(Math.abs(primary- secondary));
    }
}
