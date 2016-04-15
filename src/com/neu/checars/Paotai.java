package com.neu.checars;

import java.util.Scanner;

public class Paotai {

	/**
	 * @param args
	 */
	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            int[] a = new int[9];
        	int sum = 0;
        
        	for(int i = 0; i < 9; i ++)
        	{
            	a[i] = scan.nextInt();
        	}
        	if(distance(a[1],a[2],a[7],a[8]) < a[0]) sum ++;
        	if(distance(a[3],a[4],a[7],a[8]) < a[0]) sum ++;
        	if(distance(a[5],a[6],a[7],a[8]) < a[0]) sum ++;
        	
        	System.out.println(sum + "x");
        }
        scan.close();
    }
	public static int distance(int x, int y, int x0, int y0)
    {
        int xx = (int)Math.abs((x-x0));
        int yy = (int)Math.abs((y-y0));
        return (int)Math.sqrt(xx*xx + yy*yy);
    }

}
