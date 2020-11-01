import java.io.Console;

public class Introductions {

	public static void main(String[] args) {
		Console console = System.console();
		//Welcome to the Introductions program! Your code goes below here:
		String firstName = console.readLine("What is your fiirst name?  ");
		//thisIsAnExampeOfCamelCasing
		//the f means it prints formattted text (or format string %s)
		String lastName = console.readLine("What is your last last name?  ");
		console.printf("Hello, my name is %s %s.\n", firstName, lastName);
		console.printf("I am finally learning how write Java!\n", firstName);

	}
}
