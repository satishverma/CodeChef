/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;

/**
 *http://www.codechef.com/problems/BOGOSORT
 * @author sverma
 */
public class BogoSort {
    
    public static int count=0;
    
    public int[] getArr(int N) {
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=N-1-i;
        }
        return arr;
    }
    
    public void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1]<arr[i])
                return false;
        }
        return true;
    }
    
    
    
    //bogosort
    public int[] bogoSort(int[] temp, int min, int max) {
        count++;
        //System.out.println("min max "+min +" "+max);
        temp = shuffle(temp,min,max);
        
        if(this.isSorted(temp)) {
            this.printArr(temp);
            return temp;
        }
        //more bogoSorts here
        //find all regions
        //this.printArr(temp);
        while(temp[min]==min) {
            min++;
        }
        while(temp[max]==max) {
            max--;
        }
        
        
        return(bogoSort(temp,min,max));
        
    }
    
    //shuffle an array
     public int[] shuffle(int[] a,int min,int max) {
         if(max<=min) return a;
         //System.out.println("shuffle min max " +min + " "+max);
        int N =max-min+1;
        //random number must be between 
        for (int i = min; i <= max; i++) {
            // choose index uniformly in [i, N-1]
            int r = i + (int) (Math.random() * (N -i));
            int swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
        return a;
    } //shuffle
     
    public ArrayList<Integer> inCorrect(int[] arr,ArrayList<Integer> x) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i) x.add(i);
        }
        return x;
    }
    
    public static void main(String[] args) {
        int T =1; //number of test cases
      
      
      
        int N=5; //number of elements
        
        BogoSort bs = new BogoSort();
        
        //generate a test case 
        int[] testArr = bs.getArr(N);
        bs.printArr(testArr);
        System.out.println(bs.isSorted(testArr));
        //do bogosort 

        //pseudo code
        
       
        bs.bogoSort(testArr, 0,testArr.length-1);
        
        System.out.println(count);
 
    }//main  
}
