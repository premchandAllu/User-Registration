package com.blz.UserRegistration;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) throws InvalidUserDetailsException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		UserRegistration ur = new UserRegistration();

		// First Name
		System.out.println("Enter your First Name");
		String fName = sc.next();
		boolean firstName = ur.checkFirstName(fName);

		// Validating First Name

		try {
			if (firstName == true) {
				System.out.println("Your First Name is : " + fName);
			} else {
				throw new InvalidUserDetailsException("Invalid First Name");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating First Name By lambda Expression
		Validate firstName1 = validateFirstName();
		if (firstName1.validateDetails(fName))
			System.out.println("First name is valid");
		else
			System.out.println("First name is invalid");

		// Last Name
		System.out.println("Enter your Last Name");
		String lName = sc.next();
		boolean lastName = ur.checkLastName(lName);

		// Validating Last Name
		try {
			if (lastName == true) {
				System.out.println("Your Last Name is : " + lName);
			} else {
				throw new InvalidUserDetailsException("Invalid Last Name");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating Last Name By lambda Expression
		Validate lastName1 = validateFirstName();
		if (lastName1.validateDetails(lName))
			System.out.println("Last name is valid");
		else
			System.out.println("Last name is invalid");

		// Email
		System.out.println("Enter your email");
		String e = sc.next();
		boolean email = ur.checkEmail(e);

		// Validating Email
		try {
			if (email == true) {
				System.out.println("Your Email is : " + e);
			} else {
				throw new InvalidUserDetailsException("Invalid Email");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating Email By lambda Expression
		Validate email1 = validateEmail();
		if (email1.validateDetails(e))
			System.out.println("Email is valid");
		else
			System.out.println("Email is invalid");

		// Mobile Number
		System.out.println("Enter your mobile number");
		String m = sc.nextLine();
		sc.nextLine();
		boolean mobile = ur.checkMobile(m);

		// Validating Mobile Number
		try {
			if (mobile == true) {
				System.out.println("Your Mobile number is : " + m);
			} else {
				throw new InvalidUserDetailsException("Invalid Mobile Number");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating Mobile By lambda Expression
		Validate mobile1 = validateMobile();
		if (mobile1.validateDetails(m))
			System.out.println("Mobile is valid");
		else
			System.out.println("Mobile is invalid");

		// Password
		System.out.println("Enter your password");
		String passWord = sc.next();
		boolean p = ur.checkPassword(passWord);

		// Validating password using Rules
		try {
			if (p == true) {
				System.out.println("Your Password is : " + passWord);
			} else {
				throw new InvalidUserDetailsException("Invalid Password");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating password By lambda Expression
		Validate password = validatePassword();
		if (password.validateDetails(passWord))
			System.out.println("Password is valid");
		else
			System.out.println("Password is invalid");

		// Email Samples
		System.out.println("Enter your email sample");
		String emailSample = sc.next();
		boolean e2 = UserRegistration.emailCheck(emailSample);

		// Validating email samples
		try {
			if (e2 == true) {
				System.out.println("Your email sample is : " + emailSample);
			} else {
				throw new InvalidUserDetailsException("Invalid Email Sample");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e1);
		}

		// Validating password By lambda Expression
		Validate emailSamples = validateEmailSamples();
		if (emailSamples.validateDetails(emailSample))
			System.out.println("Email samples are valid");
		else
			System.out.println("Email samples are invalid");
	}

	public boolean checkFirstName(String firstName) {
		// TODO Auto-generated method stub
		return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
	}

	public boolean checkLastName(String lastName) {
		// TODO Auto-generated method stub
		return lastName.matches("^[A-Z][a-zA-Z]{2,}$");
	}

	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return email.matches("^[a-z]{3,}(.([a-z]{3,}))?@[a-z]{2,}.[a-z]{2,}.in$");
	}

	public boolean checkMobile(String mobile) {
		// TODO Auto-generated method stub
		return mobile.matches("^[0-9]{2}[\\s][6-9][0-9]{9}$");
	}

	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return password.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[<>!@#$%^&*'\"/;`%]).{8,})");
	}

	public static boolean emailCheck(String input) {
		// TODO Auto-generated method stub
		return input.matches(
				"^(abc)+(((\\.[0-9])|(\\+[0-9])|(\\-[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z]{2,}(.))|([a-z]{2,}(,)))[a-z]{0,}");
	}

	public static Validate validateFirstName() {
		Validate obj = (String firstName) -> {
			if (firstName.matches("^[A-Z][a-zA-Z]{2,}$"))
				return true;
			else
				return false;
		};
		return obj;
	}

	public static Validate validateLastName() {
		Validate obj = (String lastName) -> {
			if (lastName.matches("^[A-Z][a-zA-Z]{2,}$"))
				return true;
			else
				return false;
		};
		return obj;
	}

	public static Validate validateEmail() {
		Validate obj = (String email) -> {
			if (email.matches("^[a-z]{3,}(.([a-z]{3,}))?@[a-z]{2,}.[a-z]{2,}.in$"))
				return true;
			else
				return false;
		};
		return obj;
	}

	public static Validate validateMobile() {
		Validate obj = (String mobile) -> {
			if (mobile.matches("^[0-9]{2}[\\s][6-9][0-9]{9}$"))
				return true;
			else
				return false;
		};
		return obj;
	}
	
	public static Validate validatePassword() {
		Validate obj = (String passWord) -> {
			if (passWord.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[<>!@#$%^&*'\"/;`%]).{8,})"))
				return true;
			else
				return false;
		};
		return obj;
	}
	
	public static Validate validateEmailSamples() {
		Validate obj = (String emailSample) -> {
			if (emailSample.matches("^(abc)+(((\\.[0-9])|(\\+[0-9])|(\\-[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z]{2,}(.))|([a-z]{2,}(,)))[a-z]{0,}"))
				return true;
			else
				return false;
		};
		return obj;
	}

}