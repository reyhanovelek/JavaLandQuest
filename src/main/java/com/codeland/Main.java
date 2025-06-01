package com.codeland;
// TODO: Start Hero Dashboard or individual module tests

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task 1: Potion Calculator Test
        int ingredients = 13;

        int potions = PotionCalculator.calculateFullPotions(ingredients);
        int remaining = PotionCalculator.calculateLeftoverunits(ingredients);
        int cost = PotionCalculator.calculateTotalCost(ingredients);

        System.out.println("🔮 Full Potions: " + potions);
        System.out.println("🧂 Left Over Units: " + remaining);
        System.out.println("💰 Total Cost: " + cost + " euro");

        //Task 2 : SpellCostEstimator test
        String spell = "FireBall";
        int power = 5;

        int mana = SpellCostEstimator.calculateManaCost(spell,power) ;
        String summary = SpellCostEstimator.getSpellSummary (spell,power);

        System.out.println("\n🔢 Mana Cost: " + mana);
        System.out.println("📜 Spell Summary: " + summary);

        //Task 3 : HeroEligibilityChecker Test
        int age = 20;
        int strenght = 75;
        int experience = 60;

        boolean eligible = HeroEligibilityChecker.isEligible(age, strenght);
        String rank = HeroEligibilityChecker.getHeroRank(experience);

        System.out.println("\n🛡️ Can join the guild ?: " + eligible);
        System.out.println("🎖️ Hero Rank: " + rank);

        // Task 4 : GuildGatekeeper Test

        String heroType1 = "Knight";
        String heroType2 = "Mage" ;
        String heroType3 = "Thief" ;

        System.out.println("\n🏰 " + GuildGatekeeper.determineAccess(heroType1));
        System.out.println("📚 " + GuildGatekeeper.determineAccess(heroType2));
        System.out.println("🚫 " + GuildGatekeeper.determineAccess(heroType3));
        System.out.println();

        //Task 5 : DayScheduler Test

        for (int day = 0 ; day<8; day++) {
            String activity = DayScheduler.getActivityForDay(day);
            System.out.println("📅 Day " + day + ": " + activity);
        }

        // Task 6 : DungeonSimulator Test
            System.out.println("\n🏹 Gold Collection :");
            DungeonSimulator.simulateGoldCollection();

            System.out.println("\n🧭 Explore Dungeon Rooms:");
            DungeonSimulator.exploreDungeonRooms();

            System.out.println("\n🎁 TryingOpenChest:");
            DungeonSimulator.tryOpenChest();

         //Task 7 : Magic Inventory Test
        System.out.println("\n📚 Inventory Management:");
        MagicInventory.manageInventory();

        //Task 8 : Creature Battle Test
        System.out.println("\n⚔️ Task 8: Creature Battle");
        CreatureBattle.startBattle();

        //Task 9 : MagicBox Test
        System.out.println("\n🧬 Task 9: MagicBox Test");

        MagicBox<String> spellBox = new MagicBox<>();
        try {
            System.out.println("🔍Retrieving spell from box...");
            spell = spellBox.get();  // when box is  empty throw exception
            System.out.println("✨ Spell: " + spell);
        }catch (EmptyBoxException e) {
            System.out.println(e.getMessage());
        }
        //Put the spell in the Box
        spellBox.set ("invisibility");

        try {
            System.out.println("\n📦 Retrieving spell again from box...");
            spell = spellBox.get();  //this time no exception bcs box is not empty
            System.out.println("✨ Spell: " + spell);
        }catch (EmptyBoxException e) {
            System.out.println(e.getMessage());
        }

        //Task 10 : ScrollManager Test
        System.out.println("\n📜 Task 10: File Manager:");

        List<String> spells =new ArrayList<>();
        spells.add("Fireball");
        spells.add("Lightning Bolt");
        spells.add("Heal");

        String fileName = "scroll.txt";

        ScrollManager.writeSpellsToFile(spells,fileName);
        ScrollManager.readSpellsFromFile(fileName);

        //Task 11 : Final : HeroDashboard
        System.out.println("\n🏁 FINAL: Hero Dashboard Beginning...");
        HeroDashboard.startDashboard();

        }
        }


