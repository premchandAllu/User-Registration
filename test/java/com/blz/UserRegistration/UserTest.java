package com.blz.UserRegistration;

public class UserTest {

	
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
	   boolean e = EmailID.matches ("^[A-Z][a-zA-Z]{2,}$");

      if(e)
       {
   	  return true; } 
      else 
   	  return false;
	  }
	
	
	public boolean checkPhoneNumber(String PhoneNo)
	 {
	   boolean p = PhoneNo.matches ("^[A-Z][a-zA-Z]{2,}$");

      if(p)
       {
   	  return true; } 
      else 
   	  return false;
	  }
	
}
