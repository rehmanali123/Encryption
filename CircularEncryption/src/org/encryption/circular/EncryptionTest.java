package org.encryption.circular;

import java.util.Scanner;

import org.encryption.Alphabet.BlockLetterEncryption;
import org.encryption.Alphabet.CapitalSmallLetterEncryption;
import org.encryption.Alphabet.SmallLetterEncryption;

public class EncryptionTest {

	// driver function
	public static void main(String argc[]) {

		SmallLetterEncryption smallLetter = new SmallLetterEncryption();
		BlockLetterEncryption blockLetter = new BlockLetterEncryption();
		CapitalSmallLetterEncryption alphabet = new CapitalSmallLetterEncryption();
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the expression to encrypt:");
		String string = input.nextLine();
		System.out.println("Enter the round number ( less then 26 ) ");
		int round = input.nextInt();
		
		System.out.println("The encrypted expression is ");

		//String str = smallLetter.encrypt(string, round);
		
		///// Block Letter Encryption Test; ///////
		// String str = blockLetter.encrypt(string, round);
		
		///// CapitalSmallLetterEncryption Encryption Test; ///////
		 String str = alphabet.encrypt(string, round);
		
		System.out.println(str);

	}

	

}
