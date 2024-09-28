package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.File;

public class RightAligned {
    public static void main(String[] args) {
        try {
            // Reading input from the user for file name on console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter File Name (with full path or just name if in the working directory): ");
            String fileName = br.readLine();
            
            // Check if the file exists
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Find the maximum line length
            BufferedReader br1 = new BufferedReader(new FileReader(fileName));
            String line;
            int maxLineLength = 0;
            while ((line = br1.readLine()) != null) {
                maxLineLength = Math.max(maxLineLength, line.length());
            }
            br1.close();

            // Read the file again to print right-aligned content
            BufferedReader br2 = new BufferedReader(new FileReader(fileName));
            while ((line = br2.readLine()) != null) {
                int spaces = maxLineLength - line.length();  // Calculate how many spaces to prepend
                // Print spaces for right-alignment
                for (int i = 0; i < spaces; i++) {
                    System.out.print("-");
                }
                // Print the actual line
                System.out.println(line);
            }
            br2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
