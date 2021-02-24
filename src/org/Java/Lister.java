package org.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer>li = new LinkedList<Integer>();
li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
li.add(60);
System.out.println(li);
//to print size
int text = li.size();
		System.out.println(text);
//to remove particular index	 
		li.remove(2);
	System.out.println(li);
		//to get the particular value
	Integer particular = li.get(3);
	System.out.println(particular);
	//TO ADD THE VALUES
	li.add(2,100);
	System.out.println(li);
	//to set the values
	li.set(4, 100);
	//to contains
	boolean b = li.contains(10);
	System.out.println(b);
int i = li.indexOf(10);
System.out.println(i);
	}
	
		
}
