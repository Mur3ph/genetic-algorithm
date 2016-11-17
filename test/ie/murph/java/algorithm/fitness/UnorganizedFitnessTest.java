package ie.murph.java.algorithm.fitness;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ie.murph.java.algorithm.randomnumber.RandomNumber;
import ie.murph.java.algorithm.randomnumber.RandomNumberGenerator;

public class UnorganizedFitnessTest 
{
	private final int lengthOfArray = 11;
	private RandomNumber randomNumber;
	private RandomNumberGenerator resultRrandomNumberGenerator;
	private UnorganizedFitness unorganizedFitness;
	
	@Before
    public void setUp() 
	{
		randomNumber = new RandomNumber();
		resultRrandomNumberGenerator = new RandomNumberGenerator(randomNumber);
		resultRrandomNumberGenerator.setRandomNumberbetween(1, 10);
		resultRrandomNumberGenerator.populateArrayWithRandomWholeNumbersOfLength(lengthOfArray);
		unorganizedFitness = new UnorganizedFitness(resultRrandomNumberGenerator);
    }
	
	@After
    public void tearDown() 
    {
		unorganizedFitness.emptyFitnessTreeMap();
    }
	
	@Test
	public void sizeOfUnOrganizedTreeMapTest() 
	{
		unorganizedFitness.putRandomNumbersIntoUnOrganizedTreeMap();
		assertTrue(isLengthSame(unorganizedFitness.getUnorganizedFitnessTreeMapValues().size()));
	}
	
	private boolean isLengthSame(final int amountOfValuesInCollection) 
	{
		if(amountOfValuesInCollection == lengthOfArray)
		{
			return true;
		}
		return false;
	}
	
	@Test
	public void isNotEmptyUnOrganizedTreeMapTest() 
	{
		unorganizedFitness.putRandomNumbersIntoUnOrganizedTreeMap();
		assertFalse(unorganizedFitness.getUnorganizedFitnessTreeMap().isEmpty());
	}
	
	@Test
	public void isEmptyUnOrganizedTreeMapTest() 
	{
		unorganizedFitness.putRandomNumbersIntoUnOrganizedTreeMap();
		unorganizedFitness.emptyFitnessTreeMap();
		assertTrue(unorganizedFitness.getUnorganizedFitnessTreeMap().isEmpty());
	}
	
	@Ignore
	public void isNullUnOrganizedTreeMapTest() 
	{
		assertNull(unorganizedFitness.getUnorganizedFitnessTreeMap());
	}
	
	@Ignore
	public void isNotNullUnOrganizedTreeMapTest() 
	{
		unorganizedFitness.putRandomNumbersIntoUnOrganizedTreeMap();
		assertNotNull(unorganizedFitness.getUnorganizedFitnessTreeMapValues().isEmpty());
	}

}
