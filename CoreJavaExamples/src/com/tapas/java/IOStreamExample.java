package com.tapas.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class IOStreamExample {

	public static void main(String[] args)  {

		try(PrintWriter pw = new PrintWriter("E:/file.txt");
			BufferedReader br1 = new BufferedReader(new FileReader("E:/file2.txt"));
			BufferedReader  br2 = new BufferedReader(new FileReader("E:/file3.txt"))) {
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while(line1!=null || line2!=null) {
			if(line1!=null) {
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null) {
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		System.out.println("All data inserted into file.txt");
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
