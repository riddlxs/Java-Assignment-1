import java.util.Scanner; // import the scanner

public class Zoo { // create the class zoo
    public static void main(String[] args) { // starting the code with the same method taught in past lessons
        Scanner scanner = new Scanner(System.in); // make the scanner scan what the user is typing in the console

        System.out.print("Enter animal name: "); // prompt the user to enter an animal name
        String name = scanner.nextLine(); // read the animal name from the user input

        System.out.print("Enter animal color: "); // Copy the same code above but change the prompt to ask the user
        String color = scanner.nextLine(); // same code as above again, now the string name is changed to color, NOT
                                           // name

        System.out.print("Enter animal age: "); // same code as above again, but now the prompt is asking for the animal
                                                // age
        int age = scanner.nextInt(); // read the animal age from the user input, but this time it is an integer, not
                                     // a string since its a number being imputted
        scanner.nextLine(); // wasnt letting user input fav food, so needed this to read until next enter
                            // press not the enter after inputting the age

        System.out.print("Enter animal's favorite food: "); // same code but for animal's favorite food
        String favFood = scanner.nextLine(); // create the string fav food to read the user input for the animal's
                                             // favorite food

        Animal animal = new Animal(name, color, age, favFood); // creates a new animal object using the variables name,
                                                               // color, age, and favFood

        System.out.println(); // print a blank line for better formatting
        animal.printDetails(); // now the animal has been created with user inputs, we can print the details
                               // submitted by the user, the print details line we used in the animal class

        scanner.close(); // close the scanner and finish the program
    }
}
