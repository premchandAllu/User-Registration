package com.blz.UserRegistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmailTesting {

		@Test
		public void testEmail()
		{
			UserRegistration obj = new UserRegistration();
			assertTrue("Check pattern defined for correct type of Email 1", obj.checkEmail("abc-100@yahoo.com"));
			assertTrue("Check pattern defined for correct type of Email 2", obj.checkEmail("abc@yahoo.com"));
			assertTrue("Check pattern defined for correct type of Email 3", obj.checkEmail("abc.100@yahoo.com"));
			assertTrue("Check pattern defined for correct type of Email 4", obj.checkEmail("abc111@yahoo.com"));
			assertTrue("Check pattern defined for correct type of Email 5", obj.checkEmail("abc-100@abc.net"));
			assertTrue("Check pattern defined for correct type of Email 6", obj.checkEmail("abc.100@abc.com.au"));
			assertTrue("Check pattern defined for correct type of Email 7", obj.checkEmail("abc@1.com"));
			assertTrue("Check pattern defined for correct type of Email 8", obj.checkEmail("abc@gmail.com.com"));
			assertTrue("Check pattern defined for correct type of Email 9", obj.checkEmail("abc+100@gmail.com"));
			
			assertFalse("Check pattern defined for wrong type of Email", obj.checkEmail("abc.xybl.co.in"));
			assertFalse("Check pattern defined for wrong type of Email", obj.checkEmail("abcd.xyz.bl.co.in"));
		}
	}

