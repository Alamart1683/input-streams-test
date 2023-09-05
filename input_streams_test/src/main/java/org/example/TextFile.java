package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            int n = 1000000;
            for (int i = 0; i < n; i++) {
                writer.write(i + " " + (n - i) + " " + n / (i + 1) + " " +  (double) (n - i) / (double) n + "\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
