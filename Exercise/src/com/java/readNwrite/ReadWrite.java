package com.java.readNwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C://IOFiles//Read.txt");
		int c;
		FileOutputStream out = new FileOutputStream("C://IOFiles//Write.txt");
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		out.close();
		in.close();
	}

}
