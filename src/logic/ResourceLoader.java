package logic;

import java.io.*;
import java.util.*;

public class ResourceLoader {

    public String[] loadResources(String career) {
        career = career.toLowerCase().trim();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/data/resources.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length != 2) continue;

                String key = parts[0].trim().toLowerCase();
                String[] resources = parts[1].split(",");

                if (key.equals(career)) {
                    for (int i = 0; i < resources.length; i++) {
                        resources[i] = resources[i].trim();
                    }
                    return resources;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading resources.txt: " + e.getMessage());
        }

        return new String[]{"Explore online platforms like Coursera, YouTube, and LinkedIn Learning."}; // default
    }
}
