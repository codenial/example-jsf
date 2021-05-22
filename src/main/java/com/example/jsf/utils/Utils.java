package com.example.jsf.utils;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Utils {
	
	public static int randomNumber(int min,int max) {
		return RandomUtils.nextInt(min, max);
	}
	
	public static String randomString(int count) {
		return String.valueOf(System.currentTimeMillis());//RandomStringUtils.random(count);
	}
	
	private Utils() {}

}
