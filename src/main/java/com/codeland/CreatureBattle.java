package com.codeland;
import java.util.*;


public class CreatureBattle {
    public static void startBattle() {
        List<Creature> creatures = new ArrayList<>();
        creatures.add(new Dragon("Trumph"));
        creatures.add(new Goblin("RTE"));
        creatures.add(new Goblin("Putin"));
        creatures.add(new Wizard("Musk"));

        System.out.println("⚔️ Creatures are attacking!\n");

        for (Creature c : creatures) {
            c.attack() ; //polymorphism
        }
    }
}
