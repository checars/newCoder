

package com.neu.checars;

import java.util.Scanner;

public class HexToInteger {

	/**
	 * @param args
	 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
        	String tempStr = scanner.nextLine();
        	tempStr = tempStr.substring(2);
            System.out.println(Integer.parseInt(tempStr, 16));
        }
	}

}
