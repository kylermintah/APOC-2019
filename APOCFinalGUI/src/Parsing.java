import java.awt.*;
import java.io.*;

public class Parsing {


	int q1;
	int q2;
	int q3;
	int q4;
	String answer;
	
	public Parsing (int a, int b, int c, int d) {
		q1 = a;
		q2 = b;
		q3 = c;
		q4 = d;
		answer = "";
	}
	
	//Append everything to the answer, write the data to a file preceded by a ;
	public void submit(String filename) {
		answer = q1 + "," + q2 + "," + q3 + "," + q4;
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			out.write(answer);
			out.close();
		} catch (IOException e) {
			System.out.println("error while scanning document:");
			e.printStackTrace();
		}	
	}
}
