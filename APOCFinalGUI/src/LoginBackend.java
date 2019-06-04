import java.io.*;
import java.util.*;

public class LoginBackend {

	public final String filename;
	private boolean valid;
	private HashMap<String, String> users;
	
	public LoginBackend(String name) throws IOException {
		filename = name;
		valid = false;
		users = new HashMap<String, String>();
		try {
			String line = "";
			String user = "";
			String pass = "";
			BufferedReader reader = new BufferedReader(new FileReader( new File(filename)));
			
			line = reader.readLine();

			while (line != null) {	
				Scanner sc = new Scanner(line).useDelimiter(",");
				user = sc.next();
				pass = sc.next();
				users.put(user, pass);
				sc.close();
				line = reader.readLine();
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println ("File not found");
		}
	}
	
	public boolean login (String user, String pass) {
		if (users.containsKey(user) && users.get(user).equals(pass)) {
			valid = true;
		}
		return valid;
	}
	
}
