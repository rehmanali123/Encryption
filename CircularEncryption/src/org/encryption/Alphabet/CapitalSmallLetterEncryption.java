package org.encryption.Alphabet;

/*
 * 
 * This is one way of encryption where the pattern is 
 * 
 * Capital Letters -- and then -- Small Letters
 * 
 * Exclusively in that order
 * 
 * If you change the pattern the output will be different
 * 
 * The Decryption algorithm given in this project is also according to this pattern
 * 
 */

public class CapitalSmallLetterEncryption {

	public static String encrypt(String string, int round) {

		char[] array1 = { 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] array2 = { 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
				'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
				'Z' };

		char[] newArray = string.toCharArray();
		char[] array = new char[newArray.length];
		string = "";

		for (int i = 0; i < newArray.length; i++) {

			for (int j = 0; j < array1.length; j++) {

				if (newArray[i] == ' ') {

					array[i] = ' ';

				} else if (array1[j] == newArray[i]) {

					array[i] = array2[j + round];

				}
			}
		}

		for (char ch : array) {
			string += ch;
		}

		return string;

	}

}
