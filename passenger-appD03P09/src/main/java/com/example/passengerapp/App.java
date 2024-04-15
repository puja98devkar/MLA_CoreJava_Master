package com.example.passengerapp;

import com.example.passengerapp.model.Passenger;
import com.example.passengerapp.service.PassengerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the PassengerService bean
        PassengerService passengerService = context.getBean(PassengerService.class);

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Insert a new Passenger");
            System.out.println("2. Update an existing Passenger");
            System.out.println("3. Retrieve details of a Passenger");
            System.out.println("4. Delete a Passenger");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    insertPassenger(scanner, passengerService);
                    break;
                case 2:
                    updatePassenger(scanner, passengerService);
                    break;
                case 3:
                    retrievePassenger(scanner, passengerService);
                    break;
                case 4:
                    deletePassenger(scanner, passengerService);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }

        // Close the Scanner and Spring context
        scanner.close();
        ((ClassPathXmlApplicationContext) context).close();
    }

    private static void insertPassenger(Scanner scanner, PassengerService passengerService) {
        System.out.println("Enter Passenger Details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Create a new Passenger object with the entered details
        Passenger newPassenger = new Passenger();
        newPassenger.setId(id);
        newPassenger.setName(name);
        newPassenger.setDob(dob);
        newPassenger.setPhone(phone);
        newPassenger.setEmail(email);

        // Call the addPassenger method to insert the new passenger
        passengerService.addPassenger(newPassenger);

        System.out.println("New passenger inserted successfully!");
    }

    private static void updatePassenger(Scanner scanner, PassengerService passengerService) {
        System.out.print("Enter ID of Passenger to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Passenger existingPassenger = passengerService.getPassengerById(id);
        if (existingPassenger == null) {
            System.out.println("Passenger with ID " + id + " not found!");
            return;
        }

        System.out.println("Enter new details for Passenger with ID " + id + ":");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Update the existing Passenger object
        existingPassenger.setName(name);
        existingPassenger.setDob(dob);
        existingPassenger.setPhone(phone);
        existingPassenger.setEmail(email);

        // Call the updatePassenger method to update the passenger
        passengerService.updatePassenger(existingPassenger);

        System.out.println("Passenger with ID " + id + " updated successfully!");
    }

    private static void retrievePassenger(Scanner scanner, PassengerService passengerService) {
        System.out.print("Enter ID of Passenger to retrieve: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Passenger passenger = passengerService.getPassengerById(id);
        if (passenger == null) {
            System.out.println("Passenger with ID " + id + " not found!");
        } else {
            System.out.println("Passenger Details:");
            System.out.println(passenger);
        }
    }

    private static void deletePassenger(Scanner scanner, PassengerService passengerService) {
        System.out.print("Enter ID of Passenger to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Passenger passenger = passengerService.getPassengerById(id);
        if (passenger == null) {
            System.out.println("Passenger with ID " + id + " not found!");
        } else {
            // Call the deletePassenger method to delete the passenger
            passengerService.deletePassenger(id);
            System.out.println("Passenger with ID " + id + " deleted successfully!");
        }
    }
}
