package edu.penzgtu;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path >> ");
        String filePath = scanner.nextLine();
        scanner.close();
        Path path = Paths.get(filePath);

        
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException error) {
            
            System.out.println("File read error: " + error.getMessage());
        }
    }
}