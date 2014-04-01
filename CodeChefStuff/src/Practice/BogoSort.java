/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *http://www.codechef.com/problems/BOGOSORT
 * @author sverma
 */
public class BogoSort {
    
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
    
    public static void main(String[] args) {
        int T =1; //number of test cases
      
      
      
        int N=5; //number of elements
        
        BogoSort bs = new BogoSort();
        
        //generate a test case 
        int[] testArr = bs.getArr(N);
        bs.printArr(testArr);
        System.out.println(bs.isSorted(testArr));
        //do bogosort 
        
        
    }//main
    
}
