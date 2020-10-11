package com.blz.UserRegistration;

public class UserRegistration {
  
	public boolean checkFirstName(String firstName)
	 {
	   boolean fName = firstName.matches ("^[A-Z][a-zA-Z]{2,}$");

     if(fName)
      {
  	  return true; } 
     else 
  	  return false;
	  }
	
	public boolean checkLastName(String LastName)
	 {
	   boolean LName = LastName.matches ("^[A-Z][a-zA-Z]{2,}$");

     if(LName)
      {
  	  return true; } 
     else 
  	  return false;
	  }
	
	
	public boolean checkEmail(String EmailID)
	 {
	   boolean e = EmailID.matches ("^[a-z]{3,}(.)[a-z]{0,}[@][a-z]{2,}[.][a-z]{2,}(.)[a-z]{0,}$");

     if(e)
      {
  	  return true; } 
     else 
  	  return false;
	  }
	
	
	public boolean checkPhoneNumber(String PhoneNo)
	 {
	   boolean p = PhoneNo.matches ("^[0-9]{2}[' '][6-9][0-9]{9}$");

     if(p)
      {
  	  return true; } 
     else 
  	  return false;
	  }
	
	public boolean checkPassword(String Password)
	 {
	   boolean p1 = Password.matches ("[a-z]{0,}[A-Z]{1,}[a-z]{0,}[@$%*#./?]{1}[0-9]{1,}${8,}");

    if(p1)
     {
 	  return true; } 
    else 
 	  return false;
	  }
	
}	



