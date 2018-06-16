package com.mike.designpattern.example.others.observer.example0;

public class Test {
    public static void main(String[] args) {
        SignalFace signalFace = new SignalFace();
        SignalFaceObserver textSingalFaceObserver = new TextSingalFaceObserver();
        SignalFaceObserver twoDSingalFaceObserver = new TwoDSingalFaceObserver();
        SignalFaceObserver threeDSingalFaceObserver = new ThreeDSingalFaceObserver();

        signalFace.addObserver(textSingalFaceObserver);
        signalFace.addObserver(twoDSingalFaceObserver);
        signalFace.addObserver(threeDSingalFaceObserver);

        signalFace.setColor(100);
        signalFace.display();
    }
}
