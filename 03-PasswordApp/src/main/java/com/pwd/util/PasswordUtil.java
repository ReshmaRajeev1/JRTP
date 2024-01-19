package com.pwd.util;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordUtil {
	public String encode(String value) {
		
		String encodeToString = Base64.getEncoder().encodeToString(value.getBytes());

		System.out.println("In password app");

		return encodeToString;
	}

}
