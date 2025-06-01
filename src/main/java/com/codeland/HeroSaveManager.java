package com.codeland;

import java.io.*;
import java.util.List;

public class HeroSaveManager {

    public static void saveHero(String name, String type, int age, int strength, int experience, List<String> inventory, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Name: " + name + "\n");
            writer.write("Type: " + type + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Strength: " + strength + "\n");
            writer.write("Experience: " + experience + "\n");
            writer.write("Inventory: " + inventory + "\n");
        } catch (IOException e) {
            System.out.println("❌ Error saving hero: " + e.getMessage());
        }
    }

    public static void loadHero(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("📂 Hero Data From File:");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading hero file: " + e.getMessage());
        }
    }
}
