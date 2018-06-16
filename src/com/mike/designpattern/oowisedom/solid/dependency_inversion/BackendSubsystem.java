package com.mike.designpattern.oowisedom.solid.dependency_inversion;

/**
 *  Dependency Inversion
 *
 *  1, Change the referencing of concrete classes from being direct to indirect
 *
 *  2, Generalize the behaviors of you concrete classes into abstract classes and interfaces.
 *
 *  3, Have client classes interact with your system through a generalization
 *  rather than directly with concreate resources
 *
 *  4, Put emphasis on high level dependency over low level concrete dependency
 *
 */
public class BackendSubsystem implements IBackendSubsystem {
    @Override
    public String getInfo() {
        return null;
    }
}
