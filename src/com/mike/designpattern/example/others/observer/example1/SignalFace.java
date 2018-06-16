package com.mike.designpattern.example.others.observer.example1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SignalFace {
    private int color = 10;
    private PropertyChangeSupport mPropertyChangeSupport = new PropertyChangeSupport(this);
    public void display() {
    };

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        mPropertyChangeSupport.firePropertyChange("color", this.color, color);
        this.color = color;
    }

    public void addListener(PropertyChangeListener l) {
        mPropertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removeListener(PropertyChangeListener l) {
        mPropertyChangeSupport.removePropertyChangeListener(l);
    }
}
