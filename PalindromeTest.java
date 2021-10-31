package com.testLogic;

import java.util.Scanner;

public class PalindromeTest {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String palin;
		//String drome = "";
		//String targt ="" ;
		int cek ;
		String palindrome = "# --> Palindrome";
		String notPalindrome = "# --> Not Palindrome";
		
		do {
			
		String drome = "";
		System.out.print("Input : ");
		palin = in.nextLine();
		
		cek = palin.length();
	
			for(int i = cek - 1; i >= 0; i--  ) {
			drome = drome + palin.charAt(i);
		}
		
		if(palin.equalsIgnoreCase(drome)) {
			System.out.printf("%-20s %s\n\n", palin, palindrome );
		}else {
			System.out.printf("%-20s %s\n\n", palin, notPalindrome);
		}
		
		
		
		}
	while(!palin.equals("end"));
		System.out.println("Thank's");
		in.close();

	}
}

