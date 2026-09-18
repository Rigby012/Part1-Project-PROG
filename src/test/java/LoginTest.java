/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    // ==============================
    // TEST USERNAME
    // ==============================

    @Test
    public void testCheckUserName() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "john_",
                "Password1!",
                "+27828234567"
        );

        assertTrue(user.checkUserName());
    }

    // ==============================
    // TEST PASSWORD COMPLEXITY
    // ==============================

    @Test
    public void testCheckPasswordComplexity() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "john_",
                "Password1!",
                "+27828234567"
        );

        assertTrue(user.checkPasswordComplexity());
    }

    // ==============================
    // TEST CELL PHONE NUMBER
    // ==============================

    @Test
    public void testCheckCellPhoneNumber() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "john_",
                "Password1!",
                "+27828234567"
        );

        assertTrue(user.checkCellPhoneNumber());
    }

    // ==============================
    // TEST REGISTRATION
    // ==============================

    @Test
    public void testRegisterUser() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "john_",
                "Password1!",
                "+27828234567"
        );

        assertEquals(
                "User successfully registered.",
                user.registerUser()
        );
    }

    // ==============================
    // TEST LOGIN
    // ==============================

    @Test
    public void testLoginUser() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "john_",
                "Password1!",
                "+27828234567"
        );

        assertTrue(
                user.loginUser(
                        "john_",
                        "Password1!"
                )
        );
    }

    // ==============================
    // TEST LOGIN STATUS
    // ==============================

    @Test
    public void testReturnLoginStatus() {

        Login user = new Login(
                "Thabo",
                "Dlamini",
                "Thabo_",
                "Password1!",
                "+27828234567"
        );

        assertEquals(
                "Welcome John Smith, it is great to see you again.",
                user.returnLoginStatus(true)
        );
    }
}