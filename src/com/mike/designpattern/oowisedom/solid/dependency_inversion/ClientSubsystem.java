package com.mike.designpattern.oowisedom.solid.dependency_inversion;

import java.util.ArrayList;

public class ClientSubsystem {
    public IEnterpriseSubsystem enterpriseSubsystem;

    public ClientSubsystem(IEnterpriseSubsystem enterpriseSubsystem) {
        this.enterpriseSubsystem = enterpriseSubsystem;
    }

    public void sort() {
        this.enterpriseSubsystem.sort(new ArrayList());
    }
}
