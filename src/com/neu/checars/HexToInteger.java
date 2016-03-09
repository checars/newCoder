

package com.neu.checars;

import java.util.Scanner;

public class HexToInteger {

	/**
	 * @param args
	 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。
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
