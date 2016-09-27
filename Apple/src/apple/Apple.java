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
public class Apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};

        System.out.println(MaxProfit(stockPricesYesterday));
        
    }
    
    
    
    /*
    Apple stock - How much profit you can make from yesterdaystock
    Buying at the lowest price and selling at the highest price
    int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
    --- returns 6 (buying for $5 and selling for $11)
    
     O(n) time and O(1)space
    */
    public static int MaxProfit(int[] StockFromYesterday){
        
        if(StockFromYesterday.length <2){
            throw new IllegalArgumentException("Need At Least 2 prices");
        }
        
        // Greedy Method
        int minprice = StockFromYesterday[0];
        int maxprice = StockFromYesterday[0];
        
        for(int i =1;i<StockFromYesterday.length;i++){
            int current = StockFromYesterday[i];
            
            minprice = Math.min(minprice,current);
            maxprice = Math.max(maxprice, current);
        }
        return maxprice - minprice;
    }
    
    
    public static int[] ProductArray(int[] anArray){
        int[] Beforeindex = new int[anArray.length];
        int ProductSoFar =1;
        for(int i =0;i<anArray.length;i++){
            Beforeindex[i]= ProductSoFar;
            ProductSoFar *=Beforeindex[i];
        }
        
        for(int i = anArray.length;i>0;i--){
            
        }
        
        return anArray;
    }
}
