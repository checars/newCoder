package com.neu.checars;

import java.util.Scanner;

public class DrinkNum {

	/**
	 * @param args
	 * ������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ���������£�
	 * ����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ�
	 * �����Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ�
	 */
	public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            int temp = scanner.nextInt();
            System.out.println(drinkNum(temp));
        }
        scanner.close();
    }
    
    public static int drinkNum(int emptyNum)
    {
        if (emptyNum == 0 || emptyNum == 1) return 0;
        if (emptyNum == 2) return 1;
        else return drinkNum(emptyNum - 2) + 1;
    }

}
