package com.mike.designpattern.example.others.observer.example1;

public class Test {
    public static void main(String[] args) {
        SignalFace signalFace = new SignalFace();
        SignalFaceObserver textSingalFaceObserver = new TextSingalFaceObserver();
        SignalFaceObserver twoDSingalFaceObserver = new TwoDSingalFaceObserver();
        SignalFaceObserver threeDSingalFaceObserver = new ThreeDSingalFaceObserver();

        signalFace.addListener(textSingalFaceObserver);
        signalFace.addListener(twoDSingalFaceObserver);
        signalFace.addListener(threeDSingalFaceObserver);

        signalFace.setColor(100);
        signalFace.display();
    }
}
