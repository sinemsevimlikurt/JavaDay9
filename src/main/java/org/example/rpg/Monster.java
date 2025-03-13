package org.example.rpg;

public abstract class Monster implements Bleedable, Poisonable{

    private String name;
    private int hitPoints;
    private double damage;

    public Monster(double damage, int hitPoints, String name) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }

    public double attack(){
        return getDamage() + bleed() + poison();
    }
}
