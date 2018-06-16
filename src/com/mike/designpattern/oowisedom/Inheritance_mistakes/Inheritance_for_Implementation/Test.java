package com.mike.designpattern.oowisedom.Inheritance_mistakes.Inheritance_for_Implementation;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 *  Inheritance for Implementation
 *
 *
 *  Bad design is that in Java Collection, for Stack and Vector, Stack is the subclass of Vector
 *
 *  so Stack class can use the super class's method like insertElementAt(content, index), it broke
 *
 *  the define of stack, because of that, we think this is not a good design.
 *
 *
 *  --------------
 *
 *
 *  If inheritance can not meet your needs, choose decomposition to change it.
 *
 *  principle: favour composition over inheritance
 *
 */
public class Test {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("1");
        String s = stack.elementAt(0);
        System.out.println("index 0  is :" + s);

        stack.insertElementAt("2", 0);

        Enumeration<String> elements = stack.elements();
        System.out.println("elements is :" + stack.toString());
    }

}
