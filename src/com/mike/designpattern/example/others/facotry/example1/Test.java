package com.mike.designpattern.example.others.facotry.example1;

import com.mike.designpattern.example.others.facotry.example1.factory.Fighter;
import com.mike.designpattern.example.others.facotry.example1.factory.Player;
import com.mike.designpattern.example.others.facotry.example1.factory.Wizard;
import com.mike.designpattern.example.others.facotry.example1.product.Sword;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Fighter();
        Sword sword = new Sword();
//        Wand wand1 = new Wand();
//        player1.loadWeapon(wand1);
        player1.attack();


//        System.out.println(player1);
//        player1.weaponFactory().hit();

        Player player2 = new Wizard();
//        Wand wand = new Wand();
//        player2.loadWeapon(wand);
        player2.attack();
//        System.out.println(player2);
//        player2.weaponFactory().hit();
    }
}
