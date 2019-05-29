import java.io.IOException;

public class LoginTest {
	public static void main (String[] args) {
		
		String username = "yourmom";
		String password = "yourdad";
		
		try {
			LoginBackend log = new LoginBackend ("Data.txt");
			if (log.login(username, password)) {
				System.out.println("Successfully Logged In");
			} else {
				System.out.println("Login Failure");
			}
		} catch (IOException e) {
			System.out.println("Error accessing file");
		}
	}
}
