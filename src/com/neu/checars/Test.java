package com.neu.checars;

import java.util.*;

public class Test{
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
           
            int character = 0, blank = 0, digit = 0, other = 0;
            for(int i = 0; i < s.length(); i ++){
                char c = s.charAt(i);
                if((c>='a' && c<='z') || (c>='A' && c<='Z'))
                    character ++;
                else if(c == ' ')
                    blank ++;
                else if(c>='0' && c<='9')
                    digit ++;
                else
                    other ++;
            }
            
            System.out.println(character);
            System.out.println(blank);
            System.out.println(digit);
            System.out.println(other);
        }
    }
    
}
