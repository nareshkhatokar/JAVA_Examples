package com.java.readNwrite;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {

	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C://IOFiles//Read.txt");
		FileWriter out = new FileWriter("C://IOFiles//Write.txt");
		int c;
		while ((c = in.read()) != -1){
			out.write(c);
		}
		in.close();
		out.close();
		
	}

}
