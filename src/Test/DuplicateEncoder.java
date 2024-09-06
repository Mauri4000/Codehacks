package Test;

import java.util.Iterator;

public class DuplicateEncoder {

	public static String duplicatedEncoder(String anyWord) {
		String resultDuplicated = "";
		Boolean foundDuplicated = false; 
		
		for(int i=0; i<anyWord.length() -1; i++) {
			System.out.println("letra: " + anyWord.charAt(i));
			for(int j=i+1; j<anyWord.length(); j++) { 
				System.out.println("letra comparada: " + anyWord.charAt(j));
				if (anyWord.charAt(i) == anyWord.charAt(j) && !foundDuplicated) {
					resultDuplicated = resultDuplicated + ")";
					foundDuplicated = true;
				} 
			}
			if (!foundDuplicated) {
				resultDuplicated = resultDuplicated + "(";
			}
			foundDuplicated = false;
		}
		
		return resultDuplicated;
	}
	
	public static void duplicatedEncoderSecond(String anyWord) {
		String[] arrayWord = new String[anyWord.length()];
			
		for(int i=0; i<anyWord.length(); i++) {
			arrayWord[i] = String.valueOf(anyWord.charAt(i));
		}
		
		String[] duplicatedCharacters = new String[arrayWord.length];
		for (int i = 0; i < arrayWord.length -1; i++) {
			for (int j = i+1; j < arrayWord.length; j++) {
				System.out.println("Iteracion: " + arrayWord[i]);
				System.out.println("Todo: " + arrayWord[j]);
				if(arrayWord[i].equalsIgnoreCase(arrayWord[j])) {
					duplicatedCharacters[j] = ")";
					duplicatedCharacters[i] = ")";
				}
			}
		}
		for(int i=0; i<duplicatedCharacters.length; i++) {
			if(duplicatedCharacters[i] == null) {
				duplicatedCharacters[i] = "(";
			}
		}
		
		for (String letra : duplicatedCharacters) {
			System.out.print(letra);
		}
	}
	
	public static void main(String[] args) {
		
		String testWord = "(( @";
		
		duplicatedEncoderSecond(testWord);
		System.out.println();
		System.out.println("Expected: " + "))((");
		
	}

}
