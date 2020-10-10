package com.blz.UserRegistration;

import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name");
		String firstName = sc.nextLine();
		boolean fName = firstName.matches("^[A-Z][a-zA-Z]{2,}$");

		// Validating First Name
		if (fName == true) {
			System.out.println("Your First Name is : " + firstName);
		} else {
			System.out.println("First Name does not match the requirements");
		}

		System.out.println("Enter your Last Name");
		String lastName = sc.nextLine();
		boolean lName = lastName.matches("^[A-Z][a-zA-Z]{2,}$");

		// Validating Last Name
		if (lName == true) {
			System.out.println("Your Last Name is : " + lastName);
		} else {
			System.out.println("Last Name does not match the requirements");
		}

		System.out.println("Enter your email");
		String email = sc.nextLine();
		boolean e = email.matches("^[a-z]{3,}(.)[a-z]{0,}[@][a-z]{2,}[.][a-z]{2,}(.)[a-z]{0,}$");

		// Validating Email
		if (e == true) {
			System.out.println("Your Email is : " + email);
		} else {
			System.out.println("Email does not match the requirements");
		}

		System.out.println("Enter your mobile number");
		String mobile = sc.nextLine();
		boolean m = mobile.matches("^[0-9]{2}[' '][6-9][0-9]{9}$");

		// Validating Mobile Number
		if (m == true) {
			System.out.println("Your Mobile number is : " + mobile);
		} else {
			System.out.println("Mobile number does not match the requirements");
		}
		
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		sc.close();
		Boolean p = password.matches("[a-z]{0,}[A-Z]{1,}[a-z]{0,}[0-9]{1,}${8,}");

		// Validating password using Rule 3
		if (p == true) {
			System.out.println("Your Password is : " + password);
		} else {
			System.out.println("Password does not match the requirements");
		}
	}

}
