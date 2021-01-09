package com.ss;

public class Main {

	public static void main(String[] args) throws Exception {

		if(args.length!=2) {
			throw new Exception("use following format. java Main <dictionaryFileLocation> <phoneNumberFileLoca>");
		}
		Dictionary dictionary = new Dictionary(
				args[0]);
		PhoneNumberFile phoneNumberFile = new PhoneNumberFile(
				args[1], dictionary);
		phoneNumberFile.process();

	}
}
