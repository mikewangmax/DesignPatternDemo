package com.mike.designpattern.oowisedom.Inheritance_mistakes.over_specialisation;

import java.util.List;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        List sentence = new Vector<String>();
        InYodaOrderPutWords inYodaOrderPutWords = new InYodaOrderPutWords();
//        inYodaOrderPutWords.say(sentence); // you can change the words type from Arraylist to List

    }
}
