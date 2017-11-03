package com.jacobramilo.finder;

/**
 * A class that mainly used to find a character in a given string input. 
 * <br />
 * Example:<br />
 * Find the index of a in a given string = sdjinwsknadj
 * <br />
 * Output : 9
 *
 * 
 * @author jacobramilo
 *
 */
public class LetterFinder {

	/**
	 * A method used to locate the first position of a character in a given string.
	 * 
	 * @param letter - the character to find. This is case sensitive.
	 * @param inputString - the string where to find the character
	 * @return the first index of the character in the given input string. -1 is returned if not found.
	 */
	public synchronized int find(final char letter, final CharSequence inputString) {
		if(inputString == null || inputString.length() == 0) {
			//Validate the input. Null is not allowed.
			throw new IllegalArgumentException("The input string cannot be null or empty!");
		}

		return privFindLetter(letter, 0, inputString);
	}

	private int privFindLetter(final char letter, int offset, final CharSequence inputString) {
		if(inputString.length() > 0) {
			if(inputString.charAt(0) == letter) {
				//Found! return the last index searched.
				return offset;
			} 
			
			//If not found, eliminate the first character and move to the next character.
			offset++;
			
			return privFindLetter(letter, offset, inputString.subSequence(1, inputString.length()));
		}
		
		return -1;
	}
}