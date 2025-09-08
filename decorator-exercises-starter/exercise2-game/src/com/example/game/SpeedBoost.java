package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private int boostAmount;

    public SpeedBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + boostAmount;
    }

    @Override
   public void move() {
       System.out.println("Moving at speed " + (getSpeed() + boostAmount) + " with sprite " + getSprite());
   }
}
