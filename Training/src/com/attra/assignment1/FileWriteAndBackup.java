package com.attra.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



public class FileWriteAndBackup {



   public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("D:\\trainingWorkspace\\Assignment\\original.txt");
        File backup = new File("D:\\trainingWorkspace\\Assignment\\Jeevan.txt");
        File morebackup = new File("D:\\trainingWorkspace\\Assignment\\backup.txt");
        
        String source = "D:\\\\trainingWorkspace\\\\Assignment\\\\original.txt";
        String target = "D:\\\\trainingWorkspace\\\\Assignment\\\\Jeevan.txt";
        String bc = "D:\\\\trainingWorkspace\\\\Assignment\\\\backup.txt";
        
        
        
        try {
        FileWriter    fw = new FileWriter(file);
            fw.write("Jeevan");
            fw.close();
            
            Files.copy(Paths.get(source), Paths.get(target));
            Files.copy(Paths.get(target), Paths.get(bc));
        
        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            
        Scanner sc = new Scanner(backup);
        System.out.println(sc.nextLine());
        sc.close();        
        
        try {
            FileWriter fw2 = new FileWriter(morebackup);
            fw2.write("Welcome!!");
            fw2.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
