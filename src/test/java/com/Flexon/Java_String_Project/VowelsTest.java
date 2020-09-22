package com.Flexon.Java_String_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsTest {

	@Test
	public void vowelsCountSameCase() {
		assertEquals(2, Vowels.countVowels("apple"));
		assertEquals(3, Vowels.countVowels("elephant"));
		
	}
	
	@Test
	public void vowelsCountDifferentCase() {
		assertEquals(2, Vowels.countVowels("aPPlE"));
		assertEquals(3, Vowels.countVowels("elEphANt"));
		
	}

}
