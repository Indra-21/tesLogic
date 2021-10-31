package com.testLogic;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

	String[] fb = new String[3];
	fb[0] = "FizzBuzz";
	fb[1] = "Fizz";
	fb[2] = "Buzz";
	
	Scanner n = new Scanner(System.in);
	int in = n.nextInt();
	
	for (int i = 1; i <= in; i++) {
		
		if(i % 3 == 0 && i % 5 == 0){
			System.out.print(fb[0]+" ");
		}else if(i % 5 == 0) {
			System.out.print(fb[2]+" ");
		}else if(i % 3 == 0) {
			System.out.print(fb[1]+" ");
		}else {
			System.out.print(i + " ");
		}
	}
		
	
	n.close();
    }
}
