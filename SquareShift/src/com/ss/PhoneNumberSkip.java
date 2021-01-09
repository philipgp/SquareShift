package com.ss;

/**
 * This class checks whether skips are allowed or not
 * @author Philip
 *
 */
public class PhoneNumberSkip {

	
	private int skipIndex = -1;
	
	
	public void skip(int startIndex) {
		skipIndex = startIndex;
	}
	
	public boolean canSkip(int currentIndex) {
		return (skipIndex!=-1 && skipIndex+1 == currentIndex)?false:true; 
	}
}
