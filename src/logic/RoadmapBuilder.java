package logic;

import java.io.*;

public class RoadmapBuilder
{

    public void buildRoadmap(String career, String[] userInput, String[] resources) 
    {
    	
        File folder = new File("export");
        
        if (!folder.exists())
        {
        	
            folder.mkdirs();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("export/roadmap.txt")))
        {
        	
            writer.println("🚀 Personalized Career Roadmap");
            writer.println("Career: " + career);
            writer.println("Stream: " + userInput[0]);
            writer.println("Interests: " + userInput[1]);
            writer.println("Skill Level: " + userInput[2]);
            writer.println("\n📚 Recommended Resources:");

            if (resources.length == 0) 
            {
            
            	writer.println("⚠️ No resources found. Explore online platforms like Coursera, Udemy, or edX.");
            } 
            
            else 
            {
            
            	for (String res : resources) {
                    writer.println("🔗 " + res);
                }
            }

        } 
        
        catch (IOException e) 
        {
        
        	System.out.println("❌ Error writing roadmap: " + e.getMessage());
        }
    }
}
