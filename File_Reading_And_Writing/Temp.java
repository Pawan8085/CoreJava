package pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Temp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// *Writing file

		//** BufferedWriter
		
		FileWriter fw = new FileWriter("b://pawan.txt"); //!note We need Writer class to work with BufferedWriter
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100); // write d
		bw.newLine(); // for newLine
		bw.write("Pawan");
		bw.newLine();
		bw.write("Kumar");
		bw.newLine();
		char[] ch= {'p', 'w','n'};
		bw.write(ch);
		
		bw.flush();
		bw.close();
		
		System.out.println("We are done!");
		
		
		//** PrintWriter 
		// With PrintWriter we can write primitive also
        PrintWriter pw = new PrintWriter("b://placement.txt");
		
		pw.println("Java Topics :-");
		pw.println("Thread");
		pw.println("Exceptions");
		pw.println("Stream api");
		pw.println('j');
		
		pw.write(2023);
		pw.println(true);
		
		pw.close();
		
		
		
		// *Reading File 
		
		//** BufferedReader

		FileReader fr = new FileReader("b://placement.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			
			line = br.readLine();
		}
		
		
	}

}
