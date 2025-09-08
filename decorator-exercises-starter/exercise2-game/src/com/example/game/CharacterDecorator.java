package com.example.game;

public class CharacterDecorator implements Character{
    Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
    }
    @Override
    public void attack() {
        System.out.println("Attacking with sprite " + getSprite() + " for damage " + getDamage());
    }
    @Override
    public int getSpeed() {
        return character.getSpeed();
    }
    @Override
    public int getDamage() {
        return character.getDamage();
    }
    @Override
    public String getSprite() {
        return character.getSprite();
    }
    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }
}
