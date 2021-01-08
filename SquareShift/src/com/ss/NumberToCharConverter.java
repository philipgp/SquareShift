package com.ss;

public class NumberToCharConverter {

	

	private int number;

	private int curCharPointer = -1;

	private String[] stringSet = new String[] {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", };

	public NumberToCharConverter(int number) {
		super();
		this.number = number;
	}

	public char getCurrentChar() {
		if(curCharPointer == -1)
			advanceCharPointer();
		if (number <= 1)
			return Character.MIN_VALUE;
		else {
			return stringSet[number].charAt(curCharPointer);
		}
	}
	
	public void reset() {
		curCharPointer = -1;
	}

	public char getNextChar() {
		advanceCharPointer();
		return getCurrentChar();
	}

	private void advanceCharPointer() {
		if (isLastItem())
			curCharPointer = 0;
		else
			curCharPointer++;
	}

	public boolean isLastItem() {
		String currentCharString = stringSet[number];
		return currentCharString.length() == curCharPointer + 1;
	}
	
	public boolean isFirstItem() {
		return 0 == curCharPointer ;
	}
	
	public int getNumber() {
		return number;
	}

}
