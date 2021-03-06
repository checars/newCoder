package com.neu.checars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
 
public class RemoveSort
{
	/**
	 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），
	 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
	 * 请你协助明明完成“去重”与“排序”的工作。
	 * */
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            List<Integer> list = new ArrayList<Integer>();
            int num = scanner.nextInt();
            int arrIndex = 0;
            
            for(int i =0; i < num; i++)
            {
            	int temp = scanner.nextInt();
            	if(!list.contains(temp))
            	{
            		list.add(temp);
            		arrIndex ++;
            	}
            }
            
            int[] a = new int[arrIndex];
            for (int i = 0; i < list.size(); i++) {
				a[i] = list.get(i);
			}
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
            
        }
        scanner.close();
    }
}