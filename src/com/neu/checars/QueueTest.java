/**
 * 
 */
package com.neu.checars;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CheQingShou
 *
 */
public class QueueTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ddad");
		list.add(":");
		Queue<Object> linkedList = new LinkedList<Object>(list);
		linkedList.add("test");
		linkedList.add("String");
		while(!linkedList.isEmpty()){
			System.out.println(linkedList.poll());
		}
	}
}
