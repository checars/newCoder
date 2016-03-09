package com.neu.checars;

public class ArrayFind {

	/**
	 * @param args
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
