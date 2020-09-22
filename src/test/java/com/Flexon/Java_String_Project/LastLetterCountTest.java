package com.Flexon.Java_String_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastLetterCountTest {

	@Test
	public void sAndYCountTest() {
		assertArrayEquals(new int [] {1,2} , LastLetterCount.sAndYCount("What's wrong with silly Harry"));
	}
	
	@Test
	public void consonantSwitchTest() {
		assertEquals("silly wrong with What's Harry" , LastLetterCount.replaceYandS("What's wrong with silly Harry"));
	}

}
