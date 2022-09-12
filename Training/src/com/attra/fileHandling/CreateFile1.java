package com.attra.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		
		System.out.println("Starting the program....");
		for (int i=1; i<=5; i++) {
		File file1 = new File("D:\\Training\\File"+i+".txt");
		try {
			if(file1.createNewFile()) {
				System.out.println("File"+i+" is created");
				
			}
			else {
				System.out.println("File"+i+" is not created");
			}
		} catch (IOException e) {
			System.out.println("Error while creating the file....");
			e.printStackTrace();
		}

	}

}}
