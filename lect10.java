package banat1.tect_10__17.hw;
import java.time.LocalDate;


public class lect10 {
    public static void main(String[]args)
    {
        Box myBox = new Box(10.5, "Red");

        // initial info
        myBox.printInfo();

        // Open the box
        myBox.open();

        // Put an item into the box
        myBox.putItem("Book");

        // Try to put another item
        myBox.putItem("Laptop");

        // Print info after adding item
        myBox.printInfo();

        // Take the item out of the box
        myBox.takeItem();

        // Try to take an item again
        myBox.takeItem();

        // Close the box
        myBox.close();

        // Change the color of the box
        myBox.changeColor("Blue");

        // final info
        myBox.printInfo();


        User[] users = new User[10];

        // Fill the array with User objects
        users[0] = new User("John", "Doe", LocalDate.of(1980, 5, 15), "john.doe@example.com");
        users[1] = new User("Jane", "Smith", LocalDate.of(1975, 8, 20), "jane.smith@example.com");
        users[2] = new User("Emily", "Johnson", LocalDate.of(1995, 2, 10), "emily.johnson@example.com");
        users[3] = new User("Michael", "Brown", LocalDate.of(1960, 3, 25), "michael.brown@example.com");
        users[4] = new User("Chris", "Davis", LocalDate.of(1972, 7, 30), "chris.davis@example.com");
        users[5] = new User("Sarah", "Wilson", LocalDate.of(1970, 12, 5), "sarah.wilson@example.com");
        users[6] = new User("David", "Martinez", LocalDate.of(1988, 11, 2), "david.martinez@example.com");
        users[7] = new User("Laura", "Garcia", LocalDate.of(1965, 9, 14), "laura.garcia@example.com");
        users[8] = new User("Daniel", "Rodriguez", LocalDate.of(1993, 4, 18), "daniel.rodriguez@example.com");
        users[9] = new User("Anna", "Hernandez", LocalDate.of(1985, 6, 30), "anna.hernandez@example.com");

        // Loop through the array and show info for users older than 40
        System.out.println("Users older than 40:");
        for (User user : users) {
            if (user.isOlderThan(40)) {
                user.displayInfo();
            }
        }

    }

}
