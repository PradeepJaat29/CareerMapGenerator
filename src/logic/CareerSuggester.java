package logic;

import java.io.*;
import java.util.*;

public class CareerSuggester {

    public String suggestCareer(String[] userInput) {
        String interest = userInput[1].toLowerCase().trim();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/data/careers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length != 2) continue;

                String category = parts[0].trim().toLowerCase();
                String[] careers = parts[1].split(",");

                if (category.equals(interest)) {
                    // Return first matching career (you can randomize this)
                    return careers[0].trim(); 
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading careers.txt: " + e.getMessage());
        }

        return "Generalist"; // Default if no match
    }
}
