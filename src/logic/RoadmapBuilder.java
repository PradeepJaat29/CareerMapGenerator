package logic;

import java.io.*;
import java.nio.file.*;

public class RoadmapBuilder {

    public void buildRoadmap(String career, String[] userInput, String[] resources) {
        StringBuilder sb = new StringBuilder();

        sb.append("👨‍🎓 Career Roadmap for ").append(userInput[0]).append("\n");
        sb.append("📌 Suggested Career: ").append(career).append("\n");
        sb.append("🎯 Goal: ").append(userInput[2]).append("\n\n");
        sb.append("📚 Recommended Resources:\n");

        for (String res : resources) {
            sb.append(" - ").append(res).append("\n");
        }

        try {
            Files.createDirectories(Paths.get("export"));
            Files.write(Paths.get("export/roadmap.txt"), sb.toString().getBytes());
        } catch (IOException e) {
            System.out.println("❌ Error writing roadmap.txt: " + e.getMessage());
        }
    }
}
