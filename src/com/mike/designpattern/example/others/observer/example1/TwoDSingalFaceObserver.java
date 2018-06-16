package com.mike.designpattern.example.others.observer.example1;

import java.beans.PropertyChangeEvent;

public class TwoDSingalFaceObserver extends SignalFaceObserver {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        super.propertyChange(evt);
        System.out.println("TwoDSingalFaceObserver propertyChange() property:" + evt.getPropertyName()
                + " oldValue:" + evt.getOldValue() + " newValue:" + evt.getNewValue());
    }
}
