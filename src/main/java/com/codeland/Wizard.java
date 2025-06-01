package com.codeland;

public class Wizard extends Creature {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        // TODO: Implement Wizard-specific attack
        System.out.println(name + "🧙 Wizard throws java assignments!");
    }
}
