package com.codeland;

public class Goblin extends Creature {
    public Goblin(String name) {
        super(name);
    }

    @Override
    public void attack() {
        // TODO: Implement Goblin-specific attack
        System.out.println("👺 Goblin " + name + " swings his club!");
    }
}
