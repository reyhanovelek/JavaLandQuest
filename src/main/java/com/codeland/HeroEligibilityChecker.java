package com.codeland;

public class HeroEligibilityChecker {
    // TODO: Use boolean logic and ternary operator to check hero eligibility
    // Task 1: Age Eligibility
    public static boolean isEligible(int age, int strength) {
        return age > 18 && strength > 70;
    }

    //Task2 : 50 years and more experienced called Warrior , less Apprentice
    public static  String getHeroRank(int experience){
        return experience >= 50 ? "Warrior" : "Apprentice" ;
    }
}
