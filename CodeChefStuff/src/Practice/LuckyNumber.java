/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author sverma
 * 
 * 
 *  Chef loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Let F(X) equals to the number of lucky digits in decimal representation of X. Chef wants to know the number of such integers X, that L ≤ X ≤ R and F(X) is a lucky number. Help him and calculate that number modulo 109+7.
Input

First line contains one integer T, the number of test cases. Each of the following T lines contains two space separated positive integers L and R.
Output

For each of the T test cases print one integer, the number of such X, that L ≤ X ≤ R and F(X) is a lucky number, modulo 1000000007.
Constraints

1 ≤ T ≤ 10

1 ≤ L ≤ R ≤ 101000
Example

Input:
4
1 100
1 10000
1 100000
4444 4447

Output:
0
16
640
2

Notes

First test case: of course, any number of less than 4 digits can't contain lucky number of lucky digits, so the answer is 0.

Second test case: 16 required numbers are 4444 4447 4474 4477 4744 4747 4774 4777 7444 7447 7474 7477 7744 7747 7774 7777.

Third test case: there are 640 required lucky numbers. Some of them are 4474, 14747, 41474, 77277, 44407, 74749.

Fourth test case: the only two required numbers are 4444 and 4447.
 */
public class LuckyNumber {
    
    public int countLuckyDigits(int num) {
        String s = String.valueOf(num);
        int count=0;
        char[] sArr = s.toCharArray();
        for(int i=0;i<sArr.length;i++) {
            if(sArr[i]=='4' || sArr[i]=='7') {
                count++;
            }
        }
        return count;
    }
    
    public int getNumDigit(int num) {
        int count=1;
        while(num%10!=0) {
            num/=10;
            count++;
        }
        return count;
    }
    
    public int findNumLuckyNumbers(int min, int max) {
        int numLuckyNum = -1;
        
        //if num digits is less than 4, there is no such number
        //min such number is 4444 
        //4 digit nums 2^4 == 16
        //5digit is 640
        if(max<4444) return 0;
        
        int numDigitL = getNumDigit(min);
        int numDigitR = getNumDigit(max);
        //System.out.println(numDigitL + " "+numDigitR);
        
        
        return numLuckyNum;
    } //findNumLuckyNumbers 
    
    public static void main(String[] args) {
        
        int T = 1; //Number of Test Cases
        int L = 1; // Left Limit
        int R = 100; //Right Limit
        
        LuckyNumber driver = new LuckyNumber();
        
        
        for(int i=0;i<T;i++) {
            driver.findNumLuckyNumbers(L,R);
        }
    } //main
    
} //LuckyNumber
