package com.codeland;

public class DungeonSimulator {
    // TODO: Use loops to simulate treasure collection and dungeon traversal

// Collecting gold (while Loop)
    public static void simulateGoldCollection(){
        int gold = 0 ;
        int attempt = 1;

        while (gold < 100){
            gold+=10; //every attempt find 15 golds
            System.out.println("💰 Attempt " + attempt + ": Total Gold = " + gold);
            attempt++;
        }
        System.out.println("🎉 100 golds reached!");
    }

    // Explore the room (for Loop)
       public static  void exploreDungeonRooms(){
        for (int room =1; room <=5; room++) {
            System.out.println("🚪 Room " + room + " explored.");
        }
       }

       //Open Chest (DO-WHILE LOOP)
    public static void tryOpenChest() {
        int tries = 0;
        boolean opened = false;

        do {
            tries++;
            System.out.println("🔐 Trying to open chest..." + tries);
            if (tries ==2) {
                opened = true;
                System.out.println("🎉 Chest opened successfully!");
            }
        } while (!opened && tries <3) ;

         if(!opened) {
             System.out.println("😢 Chest could not open.");
         }
    }

}
