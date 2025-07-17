package logic;

import java.io.*;
import java.util.*;

public class CareerSuggester 
{

    public String suggestCareer(String[] input) 
    {
    	
        String stream = input[0].toLowerCase();
        String interests = input[1].toLowerCase();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/careers.txt"))) 
        {
        	
            String line;
            
            while ((line = reader.readLine()) != null) 
            {
            	
                String[] parts = line.split(":");
                
                if (parts.length >= 2) 
                {
                
                	String career = parts[0].trim();
                    String matchStream = parts[1].toLowerCase();

                    if (matchStream.contains(stream) || interests.contains(career.toLowerCase())) 
                    {
                    	
                        return career;
                    }
                }
            }
        }
        
        catch (IOException e)
        {
         
        	System.out.println("❌ Error reading career file: " + e.getMessage());
        }
        return "Generalist";
    }
}
