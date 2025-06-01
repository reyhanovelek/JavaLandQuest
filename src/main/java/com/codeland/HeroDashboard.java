package com.codeland;
import java.util.*;
import java.util.Scanner;
import com.codeland.HeroSaveManager;

public class HeroDashboard {
    // TODO: Combine all modules in a console-based hero management system
    public static void startDashboard() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("🛡️ WELCOME TO HERO MANAGER!");
        System.out.print("🔤 Heroes Name: ");
        String heroName = scanner.nextLine();
        System.out.print("📅 Age: ");
        int age = scanner.nextInt();

        System.out.print("💪 Power Level: ");
        int strength = scanner.nextInt();

        System.out.print("🎯 Experience Level(0-100): ");
        int experience = scanner.nextInt();

        scanner.nextLine(); // dummy line to consume newline

        System.out.print("🏷️ Hero Type (Knight/Mage/etc): ");
        String heroType = scanner.nextLine();

        System.out.print("🧪 Ingredients: ");
        int ingredients = scanner.nextInt();


        //1.Eligibility Control
        boolean eligible = HeroEligibilityChecker.isEligible(age,strength);
        String rank = HeroEligibilityChecker.getHeroRank(experience);
        String access = GuildGatekeeper.determineAccess(heroType);

        //2.Potion Calculator
        int potions = PotionCalculator.calculateFullPotions(ingredients);
        int remaining = PotionCalculator.calculateLeftoverunits(ingredients);

        //3.Inventory
        List<String> inventory = new ArrayList<>();
        inventory.add("Sword");
        inventory.add("Shield");
        inventory.add("Health Potion");
        inventory.add("Gold");

        //4.Magic Box
        MagicBox<String> spellBox = new MagicBox<>();
        spellBox.set("Fireball");


        //5.Spell Summary
        String spellSummary = SpellCostEstimator.getSpellSummary("Fireball",5);

        //6.War Simulation
        List<Creature> enemies = Arrays.asList (
                new Dragon("Azoroth"),
                new Goblin("Snark")
        );

        //7. Show Time
        System.out.println("\n👤 Hero: " + heroName);
        System.out.println("🎖️ Rank: " + rank);
        System.out.println("🧾 Access Situation : " + access);
        System.out.println("✅ Eligibilty: " + eligible);
        System.out.println("🧪 Full Potion: " + potions + " | Left Over Potion: " + remaining);
        System.out.println("🎒 Inventory: " + inventory);
        System.out.println("🧙 Spell Summary: " + spellSummary);

        // 8. Save Hero to File
        String filename = "hero_profile.txt";
        HeroSaveManager.saveHero(heroName, heroType, age, strength, experience, inventory, filename);
        HeroSaveManager.loadHero(filename);

        try {
            String spell = spellBox.get();
            System.out.println("📦 Spell in the Box: " + spell);
        }catch (EmptyBoxException e ) {
        System.out.println(e.getMessage());
            }
        System.out.println("\n⚔️ Battle Beginning!");
        for (Creature enemy : enemies ){
        enemy.attack();
        }

        //8. Write & Read the spells to the file
        List<String> spells = Arrays.asList("FireBall", "Heal", "Teleport");
        ScrollManager.writeSpellsToFile(spells, "hero_spells.txt");
        ScrollManager.readSpellsFromFile("hero_spells.txt");

        scanner.close();


    }
}
