package com.ss;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a permutter class
 * It generates various possible permutations possible for a phone number substring<br/>
 * eg: 23 will return AD,AE,AF,BD,BE,BF,CD,CE,CF<br/>
 * Strings are generated in natural order so that binary search in dictionary is effective.
 * @author Philip
 *
 */
public class PhoneNumberPermutter {

	private PhoneNumberPermutter varPhoneNumberPermutter;
	
	private boolean exhausted = false;
	
	private NumberToCharConverter fixedConv;
	

	public PhoneNumberPermutter(String subString) {
		
		if(subString.length() == 1) {
			fixedConv = new NumberToCharConverter(subString.charAt(0)-48);
		}
		else {
			setPhoneNumberPermutter(String.valueOf(subString.charAt(0)), subString.substring(1));
		}
		
	}
	
	
	public PhoneNumberPermutter(String fixedPart,String variablePart) {
		setPhoneNumberPermutter(fixedPart, variablePart);
	}
	
	private void setPhoneNumberPermutter(String fixedPart,String variablePart) {
		fixedConv = new NumberToCharConverter(fixedPart.charAt(0) - 48);
		fixedConv.getNextChar();
		if(variablePart.length()>1)
			varPhoneNumberPermutter = new PhoneNumberPermutter(variablePart.substring(0,1), variablePart.substring(1));
		else
			varPhoneNumberPermutter = new PhoneNumberPermutter(variablePart.substring(0,1));
	}
	
	
	public String getNext() {
		if(exhausted)
			return "";
		
		String varNextVal = null;
		if(varPhoneNumberPermutter!=null)
			varNextVal = varPhoneNumberPermutter.getNext();
		else {
			fixedConv.getNextChar();
			if(fixedConv.isLastItem())
				exhausted = true;
		}
		
		String fullString = String.valueOf(fixedConv.getCurrentChar());
		if(varNextVal!=null) {
			fullString+=varNextVal;
		}
		if(varPhoneNumberPermutter!=null && varPhoneNumberPermutter.isExhausted()) {
			if(fixedConv.isLastItem())
				exhausted  = true;
			else {
				fixedConv.getNextChar();
				varPhoneNumberPermutter.resetExhaustion();
			}
		}
		
		return fullString;
	
	}

	static List<NumberToCharConverter> initializeConverter(String substring) {
		List<NumberToCharConverter> localConverters = new ArrayList<>();
		for (int i = 0; i < substring.length(); i++) {
			localConverters.add(new NumberToCharConverter(substring.charAt(i) - 48));
		}
		return localConverters;
	}
	
	public boolean isExhausted() {
		return exhausted;
	}
	private void resetExhaustion() {
		exhausted  = false;
		resetPointers();
		if(varPhoneNumberPermutter!=null) {
			
			varPhoneNumberPermutter.resetExhaustion();
			
		}
	}
	
	private void resetPointers() {
		fixedConv.reset();		
		
	}

}
