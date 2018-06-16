package com.mike.designpattern.oowisedom.principle.separation_of_concerns.example2;

public class SmartPhone {
    private ICamera camera;
    private IPhone iphone;

    public SmartPhone(IPhone iphone, ICamera camera) {
        this.iphone = iphone;
        this.camera = camera;
    }

    public void usePhone() {
        this.iphone.makePhoneCall();
    }

    public void useCamera() {
        this.camera.takePhoto();
    }
}
