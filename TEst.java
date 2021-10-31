package com.testLogic;

import java.util.Scanner;

public class TEst {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input1, input2;
		String s = "1";
		
		System.out.print("Masukan angka :");
	    input1 = sc.nextInt();
	    System.out.print("masukan lagi :");
	    input2 = sc.nextInt();
	    
	    for(int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 10; j++) {
	    		for( int k = input1; k < input2; k++) {
	    			System.out.print(k +", ");
	    		}System.out.println();
	    	}
//	    	System.out.println();
	    }
	}

}
