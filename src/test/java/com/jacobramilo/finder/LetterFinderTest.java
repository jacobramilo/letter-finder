package com.jacobramilo.finder;

import static org.junit.Assert.*;
import org.junit.Test;

public class LetterFinderTest {

	@Test(expected = IllegalArgumentException.class)
	public void testNullInputValidation() {
		LetterFinder letterFinder = new LetterFinder();
		letterFinder.find('m', null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyInputValidation() {
		LetterFinder letterFinder = new LetterFinder();
		letterFinder.find('m', "");
	}
	
	@Test
	public void testFindInFirstIndex() {
		String inputString = "asgwuwgayq";
		
		LetterFinder letterFinder = new LetterFinder();
		assertEquals(0, letterFinder.find('a', inputString));
	}
	
	@Test
	public void testFindInLastIndex() {
		String inputString = "sgwuwgyqa";
		
		LetterFinder letterFinder = new LetterFinder();
		assertEquals(8, letterFinder.find('a', inputString));	
	}
	
	@Test
	public void testFindInMidIndex() {
		String inputString = "sgwuwagyq";
		
		LetterFinder letterFinder = new LetterFinder();
		assertEquals(5, letterFinder.find('a', inputString));	
	}
	
	@Test
	public void testFindMultipleOccurence() {
		String inputString = "sgaaaaawuwaaaagyq";
		
		LetterFinder letterFinder = new LetterFinder();
		assertEquals(2, letterFinder.find('a', inputString));	
	}
	
	@Test
	public void testCannotFind() {
		String inputString = "sgwuwqgyq";
		
		LetterFinder letterFinder = new LetterFinder();
		assertEquals(-1, letterFinder.find('a', inputString));	
	}
}
