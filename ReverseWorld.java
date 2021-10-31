package com.testLogic;

//import java.util.Scanner;

public class ReverseWorld {
	
	public static void main(String[] args) {
	
	String txt = "I am A Great human";
	
	String[] tampungTxt = txt.split("\\s+");		
	
	for (int i = 0; i < tampungTxt.length; i++) {

		StringBuilder sb = new StringBuilder(tampungTxt[i]);
			System.out.print(sb.reverse());
			System.out.print(" ");
			
	}		
	}

}
