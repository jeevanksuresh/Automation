package com.attra.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContentToFile {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter = null;
		System.out.println("Program started....");
	  try {
		File file=new File("D:\\Training\\File.txt");
		if(!file.exists()) {
			System.out.println("Creating a new file....");
			
				file.createNewFile();
		}	
			
			System.out.println("Writing content into file");
			filewriter = new FileWriter(file);
			filewriter.write("Hi, this is a graduate technical training");
			filewriter.write("This is from second line: Training is held at Ecity.");
			
			System.out.println("contenet written successfully");
	  }
			catch (IOException e) {
				System.out.println("No permission to write content..");
				e.printStackTrace();
		
			}
			finally {
				filewriter.close();
			}
		}
			

	}


