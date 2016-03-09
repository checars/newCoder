package com.neu.checars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
 
public class RemoveSort
{
	/**
	 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��100����
	 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
	 * ����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
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