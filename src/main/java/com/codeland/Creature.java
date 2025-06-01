package com.codeland;

public abstract class Creature {
    protected String name ;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void attack();


}
