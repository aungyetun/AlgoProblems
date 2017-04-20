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
import java.io.*;
import java.util.*;

public class MaxArraySub {

    public static void main(String[] args) {
       
         Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int size = scan.nextInt();
        int mod = scan.nextInt();
        int[] array = new int[size];
        for(int i =0;i<size;i++){
            array[i]= scan.nextInt();
        }
        System.out.println(MaxArray(array,mod));
    }
    
    public static int MaxArray(int[] array,int mod){
        int max = 0;
        for(int m=0;m<array.length;m++){
        int first = array[m];
            max = Math.max(first%mod,max);
        for(int i=1;i<array.length;i++){
            first = first+ array[i];
            max = Math.max(first%mod,max);
        }
        }
        return max;
    }
}
