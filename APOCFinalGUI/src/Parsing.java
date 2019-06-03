import java.awt.*;
import java.io.*;

public class Parsing {


	private int q1;
	private int q2;
	private int q3;
	private int q4;
        private int q5;
        private int q6;
	String answer;
	
	public Parsing (int a, int b, int c, int d, int e, int f) {
		q1 = a;
		q2 = b;
		q3 = c;
		q4 = d;
                q5 = e;
                q6 = f;
		answer = "";
	}
	
	//Append everything to the answer, write the data to a file preceded by a ;
	public void submit(String filename) {
		answer = q1 + "," + q2 + "," + q3 + "," + q4 + "," + q5 + "," + q6;
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
