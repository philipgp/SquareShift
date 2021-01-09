package com.ss;

/**
 * This class act as a pointer to current substring which we have extracted for processing
 * @author Philip
 *
 */
public class PhoneNumberSubstring {

	private PhoneNumber phoneNumber;

	private int startIndex = 0;

	private int endIndex = 1;

	public PhoneNumberSubstring(PhoneNumber phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public String get() {
		return phoneNumber.getPhoneNumber().substring(startIndex, endIndex);
	}

	public void increementStartIndex() {
		startIndex++;
	}

	public void increementEndIndex() {
		endIndex++;
	}
	/**
	 * This method slides the window
	 */
	public void moveStartIndexToEndIndex() {
		startIndex = endIndex;
	}

	public boolean hasMoreCharactersToProcess() {
		return endIndex <= phoneNumber.getPhoneNumber().length();
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

}
