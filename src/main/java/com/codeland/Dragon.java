package com.codeland;

public class Dragon extends Creature {
    public Dragon(String name) {
        super (name) ;
    }

    @Override
    public void attack() {
        // TODO: Implement Dragon-specific attack
        System.out.println("🐉 Dragon " + name + " breathes fire!");
    }
}
