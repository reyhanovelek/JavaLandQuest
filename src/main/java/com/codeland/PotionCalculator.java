package com.codeland;

public class PotionCalculator {
    // TODO: Implement method to calculate potion counts and leftovers

    public static int calculateFullPotions(int totalIngredients){
        return totalIngredients / 5 ;
    }
    public static int calculateLeftoverunits(int totalIngredients) {
        return totalIngredients % 5 ;
    }
    public static int calculateTotalCost(int totalIngredients){
        return totalIngredients * 3 ;
    }
}
