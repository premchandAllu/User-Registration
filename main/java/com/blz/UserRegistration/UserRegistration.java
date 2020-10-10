package com.blz.UserRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		System.out.println("Enter your First Name");
		Scanner sc= new Scanner(System.in);
		String FirstName =sc.nextLine();

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
		
		
		
		System.out.println("Enter your Last Name");
		String LastName =sc.nextLine();
		sc.close();

		String LastNamePattern = "[A-Z]{1}[a-zA-Z]{2,}";
		Pattern lNamePatternObj =  Pattern.compile(LastNamePattern);
		Matcher lastName= lNamePatternObj.matcher(LastName);
		
		if(lastName.matches())
		{ 
			System.out.println("Your Last Name is "+LastName);
		}
		else
		{ 
			System.out.println("Please Enter Last Name correctly");
		}
		
	}

}
