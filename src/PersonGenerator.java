import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<Person> personData = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter person's ID:");
            String personId = input.nextLine();

            System.out.println("Enter person's first name:");
            String firstName = input.nextLine();

            System.out.println("Enter person's last name:");
            String lastName = input.nextLine();

            System.out.println("Enter person's title:");
            String title = input.nextLine();

            System.out.println("Enter person's birth year:");
            int yearOfBirth = input.nextInt();
            input.nextLine();

            personData.add(new Person(personId, firstName, lastName, title, yearOfBirth));

            System.out.println("Do you want to enter more information? (yes/no)");
            String continueInput = input.nextLine().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }

        System.out.println("Enter the file name to save the data:");
        String fileName = input.next();

        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            for (Person person : personData) {
                System.out.println(person.toCSVDataRecord());
                writer.write(person.toCSVDataRecord() + "\n");
            }
            writer.close();
            System.out.println("Data saved to " + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
        }
    }
}








