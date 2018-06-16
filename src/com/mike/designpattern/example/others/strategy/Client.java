package com.mike.designpattern.example.others.strategy;


/**
 *
 * what is the difference of strategy and command
 *
 * 1:
 * strategy is to use different ways to do samething
 *
 * but
 *
 * command is to use different ways to different things
 *
 * 2:
 *strategy is focus on replacement
 *
 * but
 *
 * command is to uncoupling the requester and operator
 *
 *
 *
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        IAlgorithm algorithm1 = new Gzip();
        Context context1 = new Context(algorithm1);
        context1.compress("from", "to");
        context1.uncompress("from", "to");

        IAlgorithm algorithm2 = new Zip();
        context1 = new Context(algorithm2);
        context1.compress("from", "to");
        context1.uncompress("from", "to");
    }
}
