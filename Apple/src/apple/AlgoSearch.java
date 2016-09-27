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
    Determine if there exists an element in the array such that the sum of the elements on its left is 
    equal to the sum of the elements on its right. If there are no elements to the left/right, 
    then the sum is considered to be zero

Sample Input

2
3
1 2 3
4
1 2 3 3
Sample Output

NO
YES
Explanation 
For the first test case, no such index exists. 
For the second test case,A[1]+A[2]=A[4] , therefore index 3 satisfies the given conditions.
*/
import java.io.*;
import java.util.*;

public class AlgoSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        
        for(int i = 0; i<cases;i++){
            int size = scan.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>(size);
            for(int m =0;m<size;m++){
                temp.add(scan.nextInt());
            }
            System.out.println(Sherlock(temp));    
        }
    }
    
    public static String Sherlock(ArrayList<Integer> array){
        
        if(array.size() ==1){
            return "YES";
        }
        
        int total = 0;
        for(int i =0;i<array.size();i++){
            total +=array.get(i);
        }

        int lefttotal =0;
        int indextotal = array.get(0);
        int righttotal =0;
       
        
        for(int i =1;i<array.size()-1;i++){
            lefttotal = lefttotal+array.get(i-1);
            indextotal = indextotal+array.get(i);
            righttotal = total- indextotal;
            if(lefttotal == righttotal){
                return "YES";
            }
        }
        return "NO";
    }
}
