package com.blz.UserRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		System.out.println("Enter your First Name");
		Scanner sc= new Scanner(System.in);
		String FirstName =sc.nextLine();
		sc.close();
		
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
		Pattern patternObj =  Pattern.compile(pattern);
		Matcher m= patternObj.matcher(FirstName);
		
		if(m.matches())
		{ 
			System.out.println("Your First Name is "+FirstName);
		}
		else
		{ 
			System.out.println("Please Enter First Name correctly");
		}
		
	}

}
