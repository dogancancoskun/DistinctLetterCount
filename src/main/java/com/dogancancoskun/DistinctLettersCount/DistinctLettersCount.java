package com.dogancancoskun.DistinctLettersCount;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctLettersCount {

	public static int getDistinctLettersCount(String input) {
		return getMiminumDeletedCharacterCount(getSortedInput(input));
	}
	
	public static int getMiminumDeletedCharacterCount(char[] input) {
		HashMap<Integer, String> uniqueSet = new HashMap<Integer, String>();
		Integer count = 0;
		int miminumDeletedCharacterCount = 0;
		int deletedCountByCharacter = 0;
		
		for (int i = input.length - 1; i >= 0; i--) {
			count++;
			if (i == 0 || input[i] != input[i - 1] ) {
				
				//Not permitted to delete count smaller than 0
				deletedCountByCharacter = getDeletedCountByCharacter(uniqueSet, count);
				count = count - deletedCountByCharacter > 0 ? count - deletedCountByCharacter : 0;
				
				//If count bigger than 0 , letter can be put to unique list
				if (count > 0) {
					uniqueSet.put(count, String.valueOf(input[i]));
				}
				
				//set count to 0 , if new character is appear
				count = 0;
				miminumDeletedCharacterCount += deletedCountByCharacter;
			}
		}
		
		return miminumDeletedCharacterCount;
	}

	//will be deleted depends on unavailability as recursively
	public static int getDeletedCountByCharacter(HashMap<Integer, String> uniqueSet, int count) {
		if (uniqueSet.get(count) != null) {
			return 1 + getDeletedCountByCharacter(uniqueSet, --count);
		} else {
			return 0;
		}
	}
	
	//Sort input character
	public static char[] getSortedInput(String unsortedInput) {
		char[] sortedInput = unsortedInput.toCharArray();
		Arrays.sort(sortedInput);
		return sortedInput;
	}
	
}
