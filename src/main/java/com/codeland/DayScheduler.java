package com.codeland;

public class DayScheduler {
    // TODO: Implement switch-case to return activity by day

    public static String getActivityForDay (int day){
        switch (day) {
            case 1:
                return "Train with the sword";
            case 2:
                return "Study java coding";
            case 3:
                return "Brew healing potions";
            case 4:
                return "Explore the intellij idea";
            case 5:
                return "Defend the village";
            case 6:
                return "Rest with meditating";
            case 7:
                return "Attend soft skill classes";
            default:
                return "Invalid day";
        }
    }
}
