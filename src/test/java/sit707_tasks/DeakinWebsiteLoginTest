import org.junit.Assert;
import org.junit.Test;

public class DeakinWebsiteLoginTest {

    // Mock login service or class 
    private UnitWebsiteLoginService loginService = new UnitWebsiteLoginService();

    // Test valid credentials
    @Test
    public void testValidCredentials() {
        String username = "Apurv.Sapar";
        String password = "welcome123";
        boolean loginResult = loginService.login(username, password);
        Assert.assertTrue(loginResult);
    }

    // Test invalid username
    @Test
    public void testInvalidUsername() {
        String username = "invalid_user";
        String password = "password123";
        boolean loginResult = loginService.login(username, password);
        Assert.assertFalse(loginResult);
    }

    // Test invalid password
    @Test
    public void testInvalidPassword() {
        String username = " Apurv.Sapar";
        String password = "invalid_password";
        boolean loginResult = loginService.login(username, password);
        Assert.assertFalse(loginResult);
    }

    // Test empty username
    @Test
    public void testEmptyUsername() {
        String username = "";
        String password = "password123";
        boolean loginResult = loginService.login(username, password);
        Assert.assertFalse(loginResult);
    }

    // Test empty password
    @Test
    public void testEmptyPassword() {
        String username = " Apurv.Sapar";
        String password = "";
        boolean loginResult = loginService.login(username, password);
        Assert.assertFalse(loginResult);
    }

    // Test special characters in username
    @Test
    public void testSpecialCharactersInUsername() {
        String username = "user!@#";
        String password = "password123";
        boolean loginResult = loginService.login(username, password);
        Assert.assertFalse(loginResult);
    }
    
    // Additional tests for other equivalence classes can be added here
}

// Mock UnitWebsiteLoginService class (for demonstration purposes)
class UnitWebsiteLoginService {

    public boolean login(String username, String password) {
        // Simulate login logic (e.g., checking credentials against a database)
        // Return true for successful login, false otherwise
        if (username.equals("Apurv.Sapar") && password.equals("welcome123")) {
            return true;
        }
        return false;
    }
}
