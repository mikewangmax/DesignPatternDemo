package com.mike.designpattern.oowisedom.solid.interface_segregation;

/**
 *
 * Interface Segregation
 *
 * 1, A class should not be forced to depend on methods it does not use
 *
 * 2, Interfaces should be split up in such a way that
 *
 * it can properly describe the separate functionalities of your system
 *
 *
 *
 */
public class HumanCashier implements ICashier, IHumanWorker{
    @Override
    public void scanItem() {

    }

    @Override
    public void takePayment() {

    }

    @Override
    public void dispenseChange() {

    }

    @Override
    public void startShift() {

    }

    @Override
    public void takeBreak() {

    }

    @Override
    public void completeShift() {

    }
}
