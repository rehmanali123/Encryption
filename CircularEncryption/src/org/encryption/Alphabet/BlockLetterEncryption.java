package org.encryption.Alphabet;

public class BlockLetterEncryption {

	public static String encrypt(String string, int round) {

		char[] array1 = { 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] array2 = { 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'G', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		string = string.toUpperCase();
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

		System.out.println(string);

		return string;

	}

}
