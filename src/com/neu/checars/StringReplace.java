package com.neu.checars;

public class StringReplace {

	/**
	 * @param args
	 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("This is a   StringBuffer");
		System.out.println(replaceSpace(str));
	}
	public static String replaceSpace(StringBuffer str) {
		
    	while (str.indexOf(" ") >= 0)
        {
    		
        	str.replace(str.indexOf(" "), str.indexOf(" ") + 1,"%20");    
        }
		
    	
        return str.toString();
    }

}
