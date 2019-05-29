import java.awt.*;
import java.io.*;

public class Parsing {


	int q1;
	int q2;
	int q3;
	int q4;
	int q5;
	int q6;
	int q7;
	int q8;
	int q9;
	int q10;
	String answer;
	
	public Parsing (int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		q1 = a;
		q2 = b;
		q3 = c;
		q4 = d;
		q5 = e;
		q6 = f;
		q7 = g;
		q8 = h;
		q9 = i;
		q10 = j;
		answer = "";
	}
	
	//Append everything to the answer, write the data to a file preceded by a ;
	public void submit(String filename) {
		answer = answer + q1 + "," + q2 + "," + q3 + "," + q4 + "," + q5 +
                  "," + q6 + "," + q7 + "," + q8 + "," + q9 + "," + q10 + ";";
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
