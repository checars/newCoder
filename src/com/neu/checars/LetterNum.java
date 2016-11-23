package com.neu.checars;

import java.util.Scanner;

public class LetterNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int num = 0;
			String inputText = scan.nextLine();
			String c = scan.nextLine();
			
			char[] cArr = inputText.toCharArray();
			
			for (int i = 0; i < cArr.length; i++) {
				
				if(cArr[i] == c.charAt(0)){
					num ++;
				}
			}
			System.out.println(num);
		}
		
		scan.close();
	}
}
