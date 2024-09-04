package com.tns.Day2;

public class LoopStatement {

	public static void main(String[] args) {
		//For Loop
		System.out.println("For Loop");
		for (int i = 0; i < 7; i++) {
			  System.out.println(i);
			}
		
		// While Loop
		int i = 0;
		System.out.println("While Loop");
		while (i < 10) {
		  System.out.println(i);
		  i++;
		}
		
		//Do While Loop
			int t= 0;
			System.out.println("Do While Loop");
			do {
			  System.out.println(t);
			  t++;
			}
			while (t < 5);
	}

}
