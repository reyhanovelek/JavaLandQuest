package com.codeland;

public class SpellCostEstimator {
    // TODO: Write a method to estimate mana cost of spells

    public static int calculateManaCost (String spellName, int powerLevel){
        return powerLevel * 10 ; // basic formula ,every level 10 manas
    }
    //create a spell summary
    public static String getSpellSummary (String spellName, int powerLevel){
        int manaCost = calculateManaCost(spellName,powerLevel); //invoke the method
        return "Potion: "  + spellName + " | Power : " + powerLevel+ " | Mana: " + manaCost;
    }
}
