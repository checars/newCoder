package com.neu.checars;

public class ArrayFind {

	/**
	 * @param args
	 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array = {{1,3,5},
				{2,1,1,1,22,3},
				{3},
				{4}};
            System.out.println(Find(array,4));
           
	}
	public static boolean Find(int [][] array,int target) {
        int row = array.length - 1;
        int column = 0;
        while(row >= 0 && column < array[0].length)
        {
            if(target > array[row][column]) column ++;
            else if(target < array[row][column]) row --;
            else return true;
        }
        return false;
    }

}
