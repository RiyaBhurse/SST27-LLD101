package com.example.game;

public class GoldenAura extends CharacterDecorator {
    
    // GoldenAura (changes sprite, small buffs, logs aura on actions)
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "GoldenAura(" + super.getSprite() + ")";
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Golden aura enhances attack!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Golden aura leaves a trail!");
    }
}   

