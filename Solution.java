// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int firstHalf=0;
        int secondHalf=0;
        int difference=0;
        
        int sum=0;
        int result=Integer.MAX_VALUE;
        
        for (int i=0; i<A.length; i++){
            sum = sum+A[i];
        }//A regular template to get sum of an array
        
        for(int p=1; p<A.length; p++){
            
            firstHalf = firstHalf + A[p-1];
            secondHalf = sum - firstHalf;
            difference=Math.abs(firstHalf-secondHalf);
        
            result = Math.min(difference,result);
            
        }
        
        return result;
        
        
    }
    
}
