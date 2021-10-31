package com.testLogic;

import java.util.Scanner;

public class LeadYear {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1, input2;
		
		System.out.print("Masukan Tahun awal : ");
		input1 = in.nextInt();
		System.out.print("Masukan Tahun akhir :");
		input2 = in.nextInt();
		
		for (int i = input1; i <= input2; i++) {
			if(i % 400 == 0 || i % 4 == 0) {
					System.out.print(i+", ");
				}
			if (i % 44 == 0) {
				System.out.println();
			}
		}in.close();
	}

}
