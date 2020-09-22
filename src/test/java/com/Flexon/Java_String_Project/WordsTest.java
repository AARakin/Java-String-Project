package com.Flexon.Java_String_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordsTest {

	@Test
	public void correctGrammaticalSentence() {
		assertEquals(5, Words.countWords("Hi my name is Azraf."));
		assertEquals(6, Words.countWords("It is very windy is London."));
	}
	
	@Test
	public void incorrectGrammaticalSentence() {
		assertEquals(5, Words.countWords("Hi         how  are  you?"));
		assertEquals(6, Words.countWords("What   is your  problem?"));
	}

}
