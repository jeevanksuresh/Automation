package com.attra.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiozationOfEmployee {

	public static void main(String[] args) {
		System.out.println("Deserialization program started....");
		ObjectInputStream inputStream = null;
		try {
		FileInputStream fileInputStream = new FileInputStream("D:\\Training\\Serialization\\sample.txt");
		inputStream = new ObjectInputStream(fileInputStream);
		Employee emp = (Employee)inputStream.readObject();
		System.out.println("The state of deserialized object is ");
		System.out.println(emp.toString());
		inputStream.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

		
	}

