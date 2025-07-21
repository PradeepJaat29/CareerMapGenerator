package logic;

import java.util.Scanner;

public class InputHandler 
{

    public String[] captureInput(Scanner sc) 
    {
    	
        System.out.print("👤 Enter your name: ");
        String name = sc.nextLine().trim();

        System.out.print("📚 Enter your interest (e.g., coding, design, analytics): ");
        String interest = sc.nextLine().trim();

        System.out.print("🎯 Enter your goal (e.g., job, startup, research): ");
        String goal = sc.nextLine().trim();

        return new String[]{name, interest, goal};
    }
}
