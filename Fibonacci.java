package com.testLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int a;
		
		System.out.print("Input deret :");
		a = in.nextInt();
		ArrayList<Integer> fab = new ArrayList<Integer>(a);
		fab.add(15);
		fab.add(1);
		fab.add(3);
		
		for (Integer fibonaci : fab) {
			System.out.print(fibonaci + " ");
		}
		System.out.println(fab.get(0)+fab.get(1)+fab.get(2)+ a);
		in.close();
//		for(int i = 0; i < a; i++) {
			
//		}
	}

}
