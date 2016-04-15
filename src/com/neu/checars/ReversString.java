package com.neu.checars;

public class ReversString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotateString("ABCDEFGH",8,4));
		int[][] a = null;
		
	}
	public static String rotateString(String A, int n, int p) {
        // write code here
        String firstStr = A.substring(0,p+1);
        String secondStr = A.substring(p+1);
        String result = revers( revers(firstStr) + revers(secondStr));
        return result;
    }
    public static String revers(String str){
        int index = str.length() - 1;
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length/2; i++)
        {
            char temp = charArr[i];
            charArr[i] = charArr[index];
            charArr[index] = temp;
            index --;
        }
        return String.valueOf(charArr);
    }
    
   

}
