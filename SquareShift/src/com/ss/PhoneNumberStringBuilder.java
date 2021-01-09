package com.ss;

/**
 * This class act as String builder wrapper with the specific rule 
 * @author Philip
 *
 */
public class PhoneNumberStringBuilder {

	private StringBuilder phoneNumberStringBuilder = new StringBuilder();

	public void addMatchedString(String matchedString) {
		if (phoneNumberStringBuilder.length() > 0)
			phoneNumberStringBuilder.append("-").append(matchedString);
		else
			phoneNumberStringBuilder.append(matchedString);
	}
	
	public String getString() {
		return phoneNumberStringBuilder.toString();
	}

}
