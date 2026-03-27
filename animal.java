public class Animal { // create the animal class and make it public so it can be used in other files

    private String name; // create the strings and int (for numbered age) for the animal class to run
                         // with the zoo class
    private String color;
    private int age;
    private String favFood;

    public Animal(String name, String color, int age, String favFood) {
        this.name = name; // use this. since professor said its important to know the exact variable being
                          // used
        this.color = color; // this variable color is the same one being used in the zoo class so this. is
                            // needed
        this.age = age;
        this.favFood = favFood;
    }

    // these are the getters below, they get the information inputted by the user
    // return it to the zoo class so it can be printed out

    public String getName() { // create the getters for the animal class to run with the zoo class. this file
                              // this file holds data, zoo file prints the data from users input
        return name; // get the name inputted and return it to the zoo class.
    }

    public String getcolor() { // same as above, get the color (data) inputted and return it to the zoo class
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getFavFood() {
        return favFood;
    }

    // after the getters, we need setters, they set the information inputted by
    // the user and return it to the zoo class. this changes the animals name etc to
    // what the user inputs

    public void setName(String name) { // sets the name of the animal to what the user inputted in the zoo class
        this.name = name;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    // print the details of the animal

    public void printDetails() { // use void again since we are not returning anything, just printing the details
                                 // of the animal
        System.out.printf("Animal Details:\n"); // /n means new line (makes it look cleaner)
        System.out.printf("Name: %s\n", name); // %s is used for strings
        System.out.printf("color: %s\n", color);
        System.out.printf("Age: %d\n", age); // %d is used for integers since the age being inputted is a number, not
                                             // string
        System.out.printf("Favorite Food: %s\n", favFood);
    }
}