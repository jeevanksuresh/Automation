package com.attra.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCanRead {

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
			}
			System.out.println(":::::::::::::::::::");
			System.out.println("Can file be read"+ file.canRead());
			System.out.println("Does the file have write permission"+file.canWrite());
			System.out.println("The file name is "+file.getName());
			System.out.println("The absolute path of file is"+ file.getAbsolutePath());
			scanner.close();
			
		
	

	}

}
}
