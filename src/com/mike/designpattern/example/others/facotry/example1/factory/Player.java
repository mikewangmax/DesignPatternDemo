package com.mike.designpattern.example.others.facotry.example1.factory;

import com.mike.designpattern.example.others.facotry.example1.product.Weapon;

public abstract class Player {
    protected Weapon mWeapon;

    public Player() {
        mWeapon  = weaponFactory();
    }

    protected abstract Weapon weaponFactory();

    @Override
    public String toString() {
        return "I am a player";
    }

    public void attack() {
        mWeapon.hit();
    };
}
