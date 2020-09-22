package com.Flexon.Java_String_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsonantsTest {

	@Test
	public void test() {
		assertEquals("*e**o*e!!!", Consonants.replaceConsonants("Welcome!!!"));
	}

}
