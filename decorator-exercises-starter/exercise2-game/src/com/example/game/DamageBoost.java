package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int boostAmount;

    public DamageBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + boostAmount;
    }

    @Override
   public void attack() {
       System.out.println("Attacking with damage " + (getDamage() + boostAmount) + " with sprite " + getSprite());
   }
}