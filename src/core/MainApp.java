package core;

import java.util.Scanner;
import logic.InputHandler;
import logic.CareerSuggester;
import logic.ResourceLoader;
import logic.RoadmapBuilder;

public class MainApp 
{

    public static void main(String[] args)
    {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("🚀 Welcome to Career Map Generator");
        InputHandler input = new InputHandler();
        String[] userInput = input.captureInput(sc);

        CareerSuggester suggester = new CareerSuggester();
        String career = suggester.suggestCareer(userInput);

        ResourceLoader loader = new ResourceLoader();
        String[] resources = loader.loadResources(career);

        RoadmapBuilder roadmap = new RoadmapBuilder();
        roadmap.buildRoadmap(career, userInput, resources);

        sc.close();
        System.out.println("\n✅ Your personalized roadmap has been generated in 'export/roadmap.txt'.");
    }
}
