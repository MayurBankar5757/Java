package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckDirec {

	

		    public static void main(String[] args) {
		    	try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		        System.out.print("Enter the file or directory path: ");
		        String path = br.readLine();

		        // Create a File object
		        File file = new File(path);

		        // Check if the path is a directory or a file
		        if (file.exists()) {
		            if (file.isDirectory()) {
		                // If it is a directory, list all files in the directory
		                System.out.println("It's a directory. Listing files:");
		                File[] filesList = file.listFiles();
		                if (filesList != null && filesList.length > 0) {
		                    for (File f : filesList) {
		                        System.out.println(f.getName());
		                    }
		                } else {
		                    System.out.println("The directory is empty.");
		                }
		            } else if (file.isFile()) {
		                // If it is a file, check its size
		                long fileSize = file.length();
		                System.out.println("It's a file with size: " + fileSize + " bytes.");

		                // If the file size is more than 25 bytes, use buffering to read the content
		                if (fileSize > 25) {
		                    System.out.println("Reading content using buffering:");
		                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
		                        String line;
		                        while ((line = bufferedReader.readLine()) != null) {
		                            System.out.println(line);
		                        }
		                    } catch (IOException e) {
		                        System.out.println("An error occurred while reading the file: " + e.getMessage());
		                    }
		                } else {
		                    // If the file size is 25 bytes or less, use FileInputStream to read the content
		                    System.out.println("Reading content using FileInputStream:");
		                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
		                        int content;
		                        while ((content = fileInputStream.read()) != -1) {
		                            System.out.print((char) content);
		                        }
		                        System.out.println(); // For a new line after the content
		                    } catch (IOException e) {
		                        System.out.println("An error occurred while reading the file: " + e.getMessage());
		                    }
		                }
		            } else {
		                System.out.println("The path is neither a file nor a directory.");
		            }
		        } else {
		            System.out.println("The specified path does not exist.");
		        }}catch(Exception e) {
		        	e.printStackTrace();
		        }

		       
		    }
		

}
