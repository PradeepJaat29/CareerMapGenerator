package logic;

import java.util.Scanner;

public class InputHandler
{

    public String[] captureInput(Scanner sc) 
    {
    
    	String[] input = new String[3];

        System.out.print("\n📘 Enter your stream (e.g., CS, Commerce, Bio): ");
        input[0] = sc.nextLine().trim();

        System.out.print("💡 Enter your interests (comma separated): ");
        input[1] = sc.nextLine().trim();

        System.out.print("⚙️ Enter your skill level (Beginner/Intermediate/Advanced): ");
        input[2] = sc.nextLine().trim();

        return input;
    }
}
