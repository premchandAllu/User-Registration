package com.blz.UserRegistration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		// First Name
		System.out.println("Enter your First Name");
		Scanner sc = new Scanner(System.in);
		String FirstName = sc.nextLine();

		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
		Pattern patternObj = Pattern.compile(pattern);
		Matcher m = patternObj.matcher(FirstName);

		if (m.matches()) {
			System.out.println("Your First Name is " + FirstName);
		} else {
			System.out.println("Please Enter First Name correctly");
		}

		// Last Name
		System.out.println("Enter your Last Name");
		String LastName = sc.nextLine();

		String LastNamePattern = "[A-Z]{1}[a-zA-Z]{2,}";
		Pattern lNamePatternObj = Pattern.compile(LastNamePattern);
		Matcher lastName = lNamePatternObj.matcher(LastName);

		if (lastName.matches()) {
			System.out.println("Your Last Name is " + LastName);
		} else {
			System.out.println("Please Enter Last Name correctly");
		}

		// Last Name
		System.out.println("Enter your Email ID");
		String Email = sc.nextLine();
		sc.close();

		String EmailPattern = "^[a-z]{3,}([.][a-z]{3,})[@][a-z]{2,}.[a-z]{2,}(.in)$";
		Pattern EmailPatternObj = Pattern.compile(EmailPattern);
		Matcher Emailmatcher = EmailPatternObj.matcher(Email);

		if (Emailmatcher.matches()) {
			System.out.println("Your Email ID is " + Email);
		} else {
			System.out.println("Please Enter Email ID correctly");
		}

	}

}
