package org.Java;

import java.awt.geom.Ellipse2D;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malayalam";
String res = "";

for (int i = s.length()-1; i >= 0; i--) {
	char c= s.charAt(i);
	
	res = res+c;	
}if (s.equals(res)) {
	System.out.println("palidrome");
	
} else {
	System.out.println("not palidrome");

}
	}
	

}
