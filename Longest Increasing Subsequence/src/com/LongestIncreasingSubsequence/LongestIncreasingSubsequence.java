package com.LongestIncreasingSubsequence;

import java.util.Scanner;



public class LongestIncreasingSubsequence {
	
		
	
	public int[] lis(int[] ref)
    {        
        int n = ref.length - 1;
        int[] ArrayOne = new int[n + 1];  
        int[] ArrayTwo = new int[n + 1]; 
        int L = 0;
 
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
for (int pos = L ; pos >= 1; pos--)
            {
                if (ref[ArrayOne[pos]] < ref[i])
                {
                    j = pos;
                    break;
                }
            }            
            ArrayTwo[i] = ArrayOne[j];
            if (j == L || ref[i] < ref[ArrayOne[j + 1]])
            {
                ArrayOne[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
 
       
 
        int[] result = new int[L];
        int pos = ArrayOne[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = ref[pos];
            pos = ArrayTwo[pos];
        }
        return result;             
    }
 
   
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Longest Increasing Subsequence\n");
 
        System.out.println("Enter length of Longest Increasing Subsequence");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements with space");
        for (int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
 
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence(); 
        int[] result = obj.lis(arr);       
 
       
 
        System.out.print("\nResult of Longest Increasing Subsequence is: ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    
    }
}