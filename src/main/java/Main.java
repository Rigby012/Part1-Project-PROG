/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

 import java.util.Scanner;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Registration =====");

        // Get user's first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        // Get user's last name
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Get username
        System.out.print("Enter your username: ");
        String username = input.nextLine();

        // Get password
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        // Get South African cell phone number
        System.out.print("Enter your South African cell phone number: ");
        String cellPhoneNumber = input.nextLine();

        // Create Login object
        Login user = new Login(
                firstName,
                lastName,
                username,
                password,
                cellPhoneNumber
        );

        // Register the user
        String registrationMessage = user.registerUser();

        // Display registration result
        System.out.println();
        System.out.println(registrationMessage);

        // Only continue to login if registration was successful
        if (registrationMessage.equals("User successfully registered.")) {

            System.out.println();
            System.out.println("===== Login =====");

            // Get login username
            System.out.print("Enter your username: ");
            String loginUsername = input.nextLine();

            // Get login password
            System.out.print("Enter your password: ");
            String loginPassword = input.nextLine();

            // Check login details
            boolean loginSuccessful =
                    user.loginUser(loginUsername, loginPassword);

            // Display login status
            System.out.println(
                    user.returnLoginStatus(loginSuccessful)
            );
        }

        input.close();
    }


