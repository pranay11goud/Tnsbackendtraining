package mypack;

public class Animal {
    // Instance variables
    String name;
    String species;
    int age;

    // Static variable
    static String habitat = "Wildlife Park";

    public void printDetails() {
        String sound = "makes a cool sound!";
        System.out.println("Animal Details: " + name + " | " + species + " | Age: " + age + " | Habitat: " + habitat + " | " + sound);
    }
}