package com.mike.designpattern.oowisedom.solid.dependency_inversion;

import java.util.List;

public class EnterpriseSubsystem implements IEnterpriseSubsystem{

    public IBackendSubsystem backendSubsystem;

    public EnterpriseSubsystem(IBackendSubsystem backendSubsystem) {
        this.backendSubsystem = backendSubsystem;
    }

    @Override
    public void sort(List list) {

    }

    public String getInfo() {
        return this.backendSubsystem.getInfo();
    }


}
