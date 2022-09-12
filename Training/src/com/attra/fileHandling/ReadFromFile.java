package com.attra.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		System.out.println("Program started....");
		File file=new File("D:\\Training\\File.txt");
		Scanner scanner = null;
		
		if (file.exists()) {
			try {
				scanner = new Scanner(file);
			} catch (FileNotFoundException e) {
				System.err.println("Error while reading the contents from the file");
				e.printStackTrace();
			}
			System.out.println("Printing the contents of a file");
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}scanner.close();
			
		}
		
	}

}
