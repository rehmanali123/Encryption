package org.encryption.Alphabet;

public class SmallLetterEncryption {

	public static String encrypt(String string, int round) {

		char[] array1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] array2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		string = string.toLowerCase();
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
