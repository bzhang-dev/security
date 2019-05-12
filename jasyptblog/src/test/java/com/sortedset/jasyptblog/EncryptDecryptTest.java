package com.sortedset.jasyptblog;

import junit.framework.Assert;

import org.junit.Test;

public class EncryptDecryptTest {
	public EncryptDecryptTest() {
	}

	@Test
	public void encryptDecryptTest() throws Exception {
		// Name of the properties file that needs encryption
		String propertyFileName = "application.properties";
		// Key portion of the properties the left hand side
		String userPwdKey = "database.user.password";
		// Key in the properties file that will tell us if the password is already
		// encrypted or not
		String isPwdEcnryptedKey = "is.database.user.password.encrypted";

		// Invoke the constrsuctor
		EncryptDecrypt app = new EncryptDecrypt(propertyFileName, userPwdKey, isPwdEcnryptedKey);

		// Retrieve the decrypted password
		String result = app.decryptedUserPassword;
		Assert.assertTrue("Decrypted password should be \"myPassWord\"", result.equalsIgnoreCase("myPassWord"));
	}

}