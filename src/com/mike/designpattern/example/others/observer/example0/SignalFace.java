package com.mike.designpattern.example.others.observer.example0;

import java.util.Observable;

public class SignalFace extends Observable {
    private int color;
    public void display() {
        setChanged();
        NotifyEvent event = new NotifyEvent();
        event.id = 101;
        notifyObservers(event);
    };

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
