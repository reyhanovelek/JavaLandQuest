package com.codeland;

import java.util.*;

public class MagicInventory {
    // TODO: Use List, Set, and Map to manage hero's magical inventory

    public static void manageInventory() {
        //1. List : Store  the items in an Inventory List.Items in the list may repeat.
        List<String> items = new ArrayList<>();
        items.add("Sword");
        items.add("Shield");
        items.add("Health Potion");
        items.add("Gold");
        items.add("Health Potion");
        System.out.println("🎒 Inventory (List): " + items);

        //2. Set : Track unique potion types.Items in the list can not be repeat.
        Set<String> potions = new HashSet<>();
        potions.add("Health Potion");
        potions.add("Mana Potion");
        potions.add("Nazar Potion");
        potions.add("Health Potion");

        System.out.println("🧪 Potions (Set): " + potions);

        //3.Map : Store items with Quantities.
        Map<String, Integer> itemQuantities = new HashMap<>();
        itemQuantities.put("Sword",2);
        itemQuantities.put("Shiled",1);
        itemQuantities.put("Health Potion", 5);
        itemQuantities.put("Gold", 100);

        System.out.println("📦 Item Quantities (Map): " + itemQuantities);

    }
}
