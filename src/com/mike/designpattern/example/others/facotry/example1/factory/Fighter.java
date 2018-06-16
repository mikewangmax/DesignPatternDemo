package com.mike.designpattern.example.others.facotry.example1.factory;

import com.mike.designpattern.example.others.facotry.example1.product.Sword;
import com.mike.designpattern.example.others.facotry.example1.product.Weapon;

public class Fighter extends Player {
    @Override
    public Weapon weaponFactory() {
        return new Sword();
    }

    @Override
    public String toString() {
        return "I am a fighter";
    }

    @Override
    public void attack() {
        mWeapon.hit();
    }
}
