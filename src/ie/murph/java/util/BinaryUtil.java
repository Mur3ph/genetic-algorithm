package ie.murph.java.util;

import ie.murph.java.algorithm.math.CumulativeFrequency;

public class BinaryUtil 
{
//	static int bit128 = 128; 	// for 8 bit we use 128      (i.e. 7 bit = 128)
	static int bit32 = 32; 		// for 6 bit we use 32 etc.  (i.e. 5 bit = 32)
//	static int bit16 = 16; 		// for 5 bit we use 32 etc.  (i.e. 4 bit = 32)
	
	static char negativeBinaryBit = '0';
	static char positiveBinaryBit = '1';
	
	// Method to find the (6 bit) binary equivalent of an integer - or change the length of loops to whatever size bit you need
	public static String convertIntegerToBinaryString(int integerValue, int lengthOfBinaryString) 
	{
		String binary = "";
		for(int x = 0; x < lengthOfBinaryString; x++)
		{
			//If the value has a remainder use the '1' binary bit
			if(hasRemainder(integerValue))
			{
				binary = appendPositiveBinaryBit(binary);
			}
			if(hasNoRemainder(integerValue))
			{
				binary = appendNegativeBinaryBit(binary);
			}
			integerValue = half(integerValue);
		}
		return binary;
	}
	
	private static boolean hasRemainder(int integerValue) 
	{
		return integerValue % 2 == 1;
	}

	private static String appendPositiveBinaryBit(String binary)
	{
		return "1" + binary;
	}
	
	private static boolean hasNoRemainder(int integerValue) 
	{
		return integerValue % 2 == 0;
	}
	
	private static String appendNegativeBinaryBit(String binary)
	{
		return "0" + binary;
	}
	
	private static int half(int integerValue) 
	{
		return integerValue/2;
	}
	
	//Converting my binary bits back to Integer
	public static int convertBinaryToInteger(String binary)
	{
		int integer = 0;
		int bit32 = 32;
		
		for(int atPositionX = 0; atPositionX < 6; atPositionX++)
		{
			char character = binary.charAt(atPositionX);
			// Single quotations needed when using 'char'
			if(character == positiveBinaryBit)
			{
				//Only if the binary bit is a one do we calculate sum below
				integer = integer + (bit32*1);
			}
			//We are working from the left of the binary string to the right, so we start at 32, then half for 16, next 8, and so on
			bit32=bit32/2;
		}
		return integer;
	}
	
	// Altering one of the bits in the binary string using the StringBuilder Object
	public static StringBuilder[] mutateBinaryStrings(String offspringBinaryStr_1, String offspringBinaryStr_2, CumulativeFrequency cumulativeFrequency)
	{
		//Converting the string to string builder object because easy to alter or manipulate binary bits
		StringBuilder offspringBinaryBuilder_1 = new StringBuilder(offspringBinaryStr_1);
		StringBuilder offspringBinaryBuilder_2 = new StringBuilder(offspringBinaryStr_2);
		StringBuilder[] bothOffspringBinaryBuilderStringsToBeAlteredArray = new StringBuilder[]{offspringBinaryBuilder_1, offspringBinaryBuilder_2};
		StringBuilder[] strBuilderArrayWithBothAlteredBinaryCodes = new StringBuilder[2];
		
		//Choosing the bit in each binary string to be altered at random each time
		cumulativeFrequency.getNormalization().getOrganizedFitness().getUnorganizedFitness().getRandomNumberGenerator().setRandomNumberbetween(1, 5);
		int randomPositionOfBinaryBitToBeAltered_1 = cumulativeFrequency.getNormalization().getOrganizedFitness().getUnorganizedFitness().getRandomNumberGenerator().getARandomWholeNumber();
		int randomPositionOfBinaryBitToBeAltered_2 = cumulativeFrequency.getNormalization().getOrganizedFitness().getUnorganizedFitness().getRandomNumberGenerator().getARandomWholeNumber();
		Integer[] bothrandomNumbersOfPositionsOfBinaryBitToBeAltered = new Integer[]{randomPositionOfBinaryBitToBeAltered_1, randomPositionOfBinaryBitToBeAltered_2};
		
		// Getting that bit in the random position
		char binaryBitOfOffspring_1 = offspringBinaryStr_1.charAt(randomPositionOfBinaryBitToBeAltered_1);
		char binaryBitOfOffspring_2 = offspringBinaryStr_2.charAt(randomPositionOfBinaryBitToBeAltered_2);
		char[] bothbinaryBitsOfOffspringStringToBeAltered = new char[]{binaryBitOfOffspring_1, binaryBitOfOffspring_2};
		
		//If it is a zero binary bit change to a one and so on..
		for(int atPositionX = 0; atPositionX < bothOffspringBinaryBuilderStringsToBeAlteredArray.length; atPositionX++)
		{
			if(bothbinaryBitsOfOffspringStringToBeAltered[atPositionX] == negativeBinaryBit)
			{
				bothOffspringBinaryBuilderStringsToBeAlteredArray[atPositionX].setCharAt(bothrandomNumbersOfPositionsOfBinaryBitToBeAltered[atPositionX], positiveBinaryBit);
				strBuilderArrayWithBothAlteredBinaryCodes[atPositionX] = bothOffspringBinaryBuilderStringsToBeAlteredArray[atPositionX];
			}
			else
			{
				bothOffspringBinaryBuilderStringsToBeAlteredArray[atPositionX].setCharAt(bothrandomNumbersOfPositionsOfBinaryBitToBeAltered[atPositionX], negativeBinaryBit);
				strBuilderArrayWithBothAlteredBinaryCodes[atPositionX] = bothOffspringBinaryBuilderStringsToBeAlteredArray[atPositionX];
			}
		}
		
		System.out.println("Mutated offspring 1: " + offspringBinaryBuilder_1 + " Bit at positon " + randomPositionOfBinaryBitToBeAltered_1);
		System.out.println("Mutated offspring 2: " + offspringBinaryBuilder_2 + " Bit at positon " + randomPositionOfBinaryBitToBeAltered_2);
		return strBuilderArrayWithBothAlteredBinaryCodes;
	}
	
	private static StringBuilder offspringBinaryBitBuilder(String offspringBinary)
	{
		return new StringBuilder(offspringBinary);
	}
	
}
