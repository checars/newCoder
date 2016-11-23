package com.neu.checars;

import java.util.Scanner;

public class ZhiShu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long ulDataInput = scan.nextLong();
			System.out.println(getResult(ulDataInput));
		}
		scan.close();
	}
	
	public static String getResult(long ulDataInput){
		StringBuffer strBuf = new StringBuffer();
		int k = 2;
		
		while(ulDataInput >= k){
			if(ulDataInput % k == 0){
				strBuf.append(k + " ");
				ulDataInput = ulDataInput / k;
			}
			else{
				k ++;
			}
		}
		
		return strBuf.toString();
	}
}
