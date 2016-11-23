package com.neu.checars;

import java.util.Scanner;

public class TheLastWordLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			String inputText = scan.nextLine();
			String[] temp = inputText.split(" ");
			String result = temp[temp.length-1];
			System.out.println(result.length());
		}
		
		scan.close();
	}
}
