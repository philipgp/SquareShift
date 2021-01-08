package com.ss;

public class PhoneNumber {
	
	public String phoneNumber;
	
	private StringBuilder generatedString = new StringBuilder();
	
	private Dictionary dictionary;
	
	
	private int skipCount = 0;
	

	public PhoneNumber(String phoneNumber,Dictionary dictionary) {
		super();
		this.phoneNumber = phoneNumber;
		this.dictionary = dictionary;
	}
	
	
	public String getSubstring(int startIndex,int endIndex) {
		return phoneNumber.substring(startIndex, endIndex);
	}
	
	
	public String generateString() {
		int startIndex = 0;
		int endIndex = 1;
		while(endIndex<=phoneNumber.length()) {
			String cur2 = getSubstring(startIndex, endIndex);
			PhoneNumberPermutter permutter = new PhoneNumberPermutter(cur2);
			String cur = null;
			boolean dictStartMatchFound = false;
			while((cur = permutter.getNext())!="") {
					if(dictionary.startsWith(cur)) {
						dictStartMatchFound = true;
					}
						
				
				if(dictionary.findItem(cur)) {
					addMatchedString(cur);
					startIndex = endIndex;
					break;
				}
				
				
			} 
			if(!dictStartMatchFound) {
				if(canSkipAgain()) {
					if(cur2.length()==1) {
						addMatchedString(cur2);
					}else {
						addMatchedString(cur2.substring(0,1));
					}
					skipCount++;
					startIndex++;
				}
				else {
					return "";
				}
					
					
			}
			endIndex++;
			
		}
		return generatedString.toString();
	}
	
	private void addMatchedString(String matchedString) {
		if(generatedString.length()>0)
			generatedString.append("-").append(matchedString);
		else
			generatedString.append(matchedString);
	}
	
	
	private boolean canSkipAgain() {
		return skipCount == 0 ;
	}
	
	

}
