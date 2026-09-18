/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
    public class Login {

    // Variables
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;

    // Constructor
    public Login(String firstName, String lastName, String username,
                 String password, String cellPhoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    // Check if username contains an underscore
    // and is no more than 5 characters long
    public boolean checkUserName() {

        return username != null
                && username.contains("_")
                && username.length() <= 5;
    }

    // Check password complexity
    // Password must:
    // - Be at least 8 characters long
    // - Contain a capital letter
    // - Contain a number
    // - Contain a special character
    public boolean checkPasswordComplexity() {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char character : password.toCharArray()) {

            if (Character.isUpperCase(character)) {
                hasCapital = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecial = true;
            }
        }

        return hasCapital && hasNumber && hasSpecial;
    }

    // Check South African cell phone number
    // International country code must be +27
    // followed by no more than 10 digits.
    //
    // Regular expression reference:
    // Oracle Java Pattern documentation:
    // https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/regex/Pattern.html
    public boolean checkCellPhoneNumber() {

        String regex = "^\\+27[0-9]{1,10}$";

        return cellPhoneNumber != null
                && cellPhoneNumber.matches(regex);
    }

    // Registration method
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        return "User successfully registered.";
    }

    // Check login details against registered details
    public boolean loginUser(String enteredUsername, String enteredPassword) {

        return username != null
                && password != null
                && username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }

    // Return login status message
    public String returnLoginStatus(boolean loginSuccessful) {

        if (loginSuccessful) {

            return "Welcome " + firstName + " " + lastName
                    + ", it is great to see you again.";

        } else {

            return "Username or password incorrect, please try again.";
        }
    }
}
