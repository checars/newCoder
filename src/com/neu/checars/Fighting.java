package com.neu.checars;

import java.util.Scanner;

public class Fighting {

	/**
	 * @param args
	 */
	public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int capable = scanner.nextInt();
        
        int[] a = new int[num];
        
        for(int i = 0; i < num; i++)
        {
            a[i] = scanner.nextInt();
            capable = capable >= a[i] ? capable+a[i] : capable+gcd(capable,a[i]);
        }
        scanner.close();
        System.out.println(capable);
        
    }
    
    public static int gcd(int n, int m)
    {
    	int result = n<m ? n : m;
    	for(int i = result; i >= 1; i--)
    	{
    		if((n%i) == 0 && (m%i ==0))
    		{
    			result = i;
    			break;
    		}
    	}
    	return result;
    }

}
