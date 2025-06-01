package com.codeland;

import java.io.*;
import java.util.List;

public class ScrollManager {
    // TODO: Read and write scrolls (text files) using BufferedReader/Writer

    //1. Writing method
    public static void writeSpellsToFile(List<String> spells, String filename) {
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            for (String spell : spells) {
                writer.write(spell);
                writer.newLine(); //every spell in new Line
            }
            writer.close();
            System.out.println("\n✅ Spells has written to file :" + filename);

        }catch (IOException e) {
            System.out.println("❌ Writing error" + e.getMessage());
        }
    }

    //2.Reading method
    public static void readSpellsFromFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename)) ;
            String line;
            System.out.println("📖 Spells on file: ");
            while ((line = reader.readLine()) !=null) {
                System.out.println("✨ " + line);
            }
            reader.close();
        }catch (IOException e) {
        System.out.println("❌ Reading error : " + e.getMessage());

        }
    }
}
