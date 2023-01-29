package com.Q1.Driver;

import com.Q1.Serivce.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BracketBalance bracketBalance = new BracketBalance();


		// Declaring no. of Brackets
		System.out.println("Enter Brackets To Check Wether They Are Balanced Or Not");
		String expr = sc.nextLine();
		
		if (bracketBalance.areBracketsBalanced(expr))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	
		sc.close();
	}
	

}
