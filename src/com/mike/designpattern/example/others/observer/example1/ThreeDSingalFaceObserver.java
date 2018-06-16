package com.mike.designpattern.example.others.observer.example1;

import java.beans.PropertyChangeEvent;

public class ThreeDSingalFaceObserver extends SignalFaceObserver {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        super.propertyChange(evt);
        System.out.println("ThreeDSingalFaceObserver propertyChange() property:" + evt.getPropertyName()
                + " oldValue:" + evt.getOldValue() + " newValue:" + evt.getNewValue());
    }
}
