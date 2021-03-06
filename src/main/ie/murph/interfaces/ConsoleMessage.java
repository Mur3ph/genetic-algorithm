package main.ie.murph.interfaces;

public interface ConsoleMessage 
{
	// Interfaces have every field public, static and final: Constant variables used throughout the application. TODO: See could I remove public, static and final
	public final static String STARTING_GENETIC_ALGORITHM = "*** STARTING *** GENERATING THE RANDOM FITNESS VALUES INTO AN ARRAY.!";
	public final static String GENERATE_UNORGANISED_FITNESS_VALUES_PHASE_ONE = "1). My Map with the random fitness values 1 - Unorganised fitness: ";
	public final static String GENERATE_ORGANISED_FITNESS_VALUES_PHASE_TWO = "2). My Map with the random fitness values 2 - Organised fittest: ";
	public final static String CALCULATING_TOTAL_FITNESS_VALUE_PHASE_THREE = "3). Finding the total fitness number of all the combined data: ";
	public final static String CALCULATING_NORMALIZED_FITNESS_VALUE_PHASE_FOUR = "4). Dividing each individual fitness value by the total - Calculating Normalized data ";
	public final static String CALCULATING_CUMULATIVE_FREQUENCY_VALUE_PHASE_FIVE = "5). Adding the normalised data to get the Cumulative frequency: ";
	public final static String CHOOSE_RANDOM_NUMBER_BETWEEN_ONE_AND_ZERO_PHASE_SIX = "6). Choose a random number between 0 - 1 to select which fitnesses should be used: ";
	public final static String COMPARE_RANDOM_NUMBERS_BETWEEN_ONE_AND_ZERO_PHASE_SIX_AGAINST_CUMULATIVE_FREQUENCY_PHASE_SEVEN = "7). Compare numbers between(0,1) against cumulative frequency: ";
	public final static String GET_INTERGER_VALUE_P_REPRESENTATION_PHASE_EIGHT = "8). From the random number chosen between (0-1) Get the integer value[P] representation in the same position of the cumulative frequency number chosen at random: ";
	public final static String CROSSOVER_OF_TWO_BINARY_STRINGS_PHASE_NINE = "9). CROSSOVER of both binary strings: ";
	public final static String MUTATION_OF_OFFSPRING_STRING_PHASE_TEN = "10). Mutation of offspring string: ";
	public final static String CONVERT_OFFSPRING_BACK_TO_INTEGER_PHASE_ELEVEN = "11). Convert the offspring back to an Integer: ";
	public final static String SEND_NEW_FITNESS_TO_RANDOM_GENERATOR_TO_CREATE_NEXT_GENERATION_PHASE_TWELVE = "12). Send the two new fitness to the random generator method and receive them back here for next generation: ";
	public final static String BREAK_DIVIDER_TO_SEPERATE_EACH_PHASE = "\n ################################################################### \n";
	public final static String ASK_HOW_MANY_HUMAN_GENERATIONS_USER_WANTS_TO_CLACULATE = "How many generations do you want to calculate.!";
	public final static String GENERATION = " Generation: ";
	public final static String GOOD_BYE = "Good bye!";
	public final static String NEXT_LINE = "\n";
	public final static String QUESTION_DO_YOU_WANT_TO_RUN_ALGORITHM_AGAIN = "Do you want to run it again: (y/n)";
	public final static String[] TODO_LIST = {
												"***************************\n******** TODO LIST ********\n***************************",
												"Shortcuts to find 'todo' list: ",
												"Ctrl + H, File Search tab for 'TODO'",
												"Window --> Show View --> Tasks --> (Shows all the todo list, if todo keyword was used)\n",
												"-- 01). Phase 12 (Genetic Algorithm class): Clearing the fitness to begin again with new better population, I think I am adding the previous total with the new total were I should be clearing the previous total and starting with fresh data", 
												"-- 02). Phase 11: Mutated offspring: Instead of using one set of autogenerated positions. I am generating two sets, using the first number in the first set and second number in the second set. I should just use one set ", 
												"-- 03). Phase 7 (Genetic Algorithm class): I should be using value [p] (i.e. The Tree Map Key, instead I am using fitness [P] Tree Map value )",
												"-- 04). Phase unknown (Genetic Algorithm class): Can only chose one offspring per pair of elite candidates AND generate more random parents",
												"-- 05). Phase unknown (BinaryUtil class): Change setRandomNumberbetween(0, 5) as First bit never gets mutated",
												"-- 06). Phase unknow (Cumulative frequency class): Delete when no longer needed for visual test",
												"-- 07). Phase unknown (ConsoleMessage class): See could I remove public, static and final",
												"-- 08). Entire Application: Replace console message with logging - STARTED",
												"-- 09). Tidy up Genetic Algorithm class"
											 };
}
