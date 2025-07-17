package logic;

import java.io.*;
import java.util.*;

public class ResourceLoader 
{

    public String[] loadResources(String career) 
    {
    	
        List<String> resourceList = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("data/resources.txt"))) 
        {
        	
            String line;
            boolean sectionFound = false;
            
            while ((line = reader.readLine()) != null) 
            {
            	
                if (line.equalsIgnoreCase("[" + career + "]")) 
                {
                
                	sectionFound = true;
                    continue;
                }
                
                if (sectionFound) 
                {
                	
                    if (line.startsWith("[")) 
                    {
                    
                    	break;
                    }
                    
                    resourceList.add(line);
                }
            }
        } 
        
        catch (IOException e) 
        {
        
        	System.out.println("❌ Error reading resource file: " + e.getMessage());
        }

        return resourceList.toArray(new String[0]);
    }
}
