package banat1.tect_10__17.hw;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;

    // Constructor to initialize all fields
    public User(String firstName, String lastName, LocalDate dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    // Method to display user information
    public void displayInfo() {
        System.out.println(firstName + " " + lastName + ": " +
                "First name " + firstName + " Last name " + lastName + "; " +
                "Date of birth: " + dateOfBirth + "; " +
                "Email: " + email);
    }

    // Method to check if user is older than a certain age
    public boolean isOlderThan(int age) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() > age;
    }
}