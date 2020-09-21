package com.Flexon.Java_String_Project;

public class Palindrome {
	
	public static String reverse(String str) {
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		return rev;
	}
	
	public static boolean isPalindrome(String str) {
		
		String rev = reverse(str);
		System.out.println(rev);
		
		
		return str.equalsIgnoreCase(rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("raR"));
	}

}
