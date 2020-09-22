package com.Flexon.Java_String_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void palindromeSameCase() {
		assertTrue(Palindrome.isPalindrome("rotor"));
		assertTrue(Palindrome.isPalindrome("ROTOR"));
		assertFalse(Palindrome.isPalindrome("hello"));
	}
	
	@Test
	public void palindromeMixedCases() {
		assertTrue(Palindrome.isPalindrome("rotoR"));
		assertTrue(Palindrome.isPalindrome("Rar"));
		assertFalse(Palindrome.isPalindrome("heLLo"));
	}
	
	

}
