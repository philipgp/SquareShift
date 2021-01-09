package com.ss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneNumberFile {
	
	private String file;
	private Dictionary dictionary;

	public PhoneNumberFile(String file,Dictionary dictionary) {
		super();
		this.file = file;
		this.dictionary = dictionary;
	}
	
	public void process() {
		try (Scanner scanner = new Scanner(new File(file))) {
			while(scanner.hasNext()) {
				String currentPhoneNumber = scanner.nextLine();
				PhoneNumber phoneNumber = new PhoneNumber(currentPhoneNumber, dictionary);
				System.out.println(phoneNumber.generateString());
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
