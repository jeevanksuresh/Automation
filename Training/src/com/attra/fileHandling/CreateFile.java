package com.attra.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		System.out.println("Starting the program....");
		File file = new File("D:\\Training\\file.txt");
				try {
					boolean isCreate = file.createNewFile();
					if(isCreate) {
						System.out.println("File created successfully...");}
					else {
						System.out.println("File couldn't be created .");
					}
				} catch (IOException e) {
					System.out.println("Error while creating the file...");
					e.printStackTrace();
				}
		
	}

}
