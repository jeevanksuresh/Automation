package com.attra.fileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMove {

	public static void main(String[] args) {
		
		String src = "D:\\Training\\File2.txt";
		String tar = "D:\\Training\\Processed\\File2.txt";
		System.out.println("Program started.....");
		File file = new File("D:\\Training\\Processed\\");
		System.out.println("Is the target a directory" + file.isDirectory());
		if (file.isDirectory()) {
			try {
				Path path = Files.move(Paths.get(src), Paths.get(tar));
				System.out.println(path);
				System.out.println("Files moved Successfully");
			} catch (IOException e) {
				System.err.println("File couldn't be moved");
				e.printStackTrace();
			}
		}
		

	}

}
