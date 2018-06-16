package com.mike.designpattern.example.others.facotry.example1.factory;

import com.mike.designpattern.example.others.facotry.example1.product.Wand;
import com.mike.designpattern.example.others.facotry.example1.product.Weapon;

public class Wizard extends Player{
    @Override
    public Weapon weaponFactory() {
        return new Wand();
    }

    @Override
    public String toString() {
        return "I am a wizard";
    }

    @Override
    public void attack() {
        mWeapon.hit();
    }

}
