import java.io.Console;

public class TreeStory {

	public static void main(String[] args) {
		Console console = System.console(); 
		/*	Some terms:
			noun - Person, place or thing
			verb - An action
			adjective - A description used to modify or describe a noun
			Enter you amazing code here!
		*/
		// __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
		int age = 12;
		if (age < 13) {
			//Insert exit code 
			console.printf("Sorry, you must be at least 13 to use this program. \n");
			System.exit(0);
		}

		String name = console.readLine("Enter a name:  ");
		String adjective = console.readLine("Enter an adjective: ");
		String noun = console.readLine("Enter a __noun__:  ");
		String adverb = console.readLine("Enter an adverb: ");
		String verb = console.readLine("Enter a verb: ");
		//A nice little hearder first: 
		console.printf(" TreeStory: \n----------------\n");
		console.printf("%s is a(n) %s %s. They are always %s %s.\n", name, adjective, noun, adverb, verb);

	}
}