package com.mike.designpattern.example.headfirst.observer2;

import java.util.Observable;
import java.util.Observer;

import com.mike.designpattern.example.headfirst.observer1.DisplayElement;

public class ConditionDisplay3 implements Observer, DisplayElement{
	private float mTemprature;
	private float mHumidity;
	private float mPressure;
	private Observable mObservable;
	
	public ConditionDisplay3 (Observable o) {
		mObservable = o;
		mObservable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			mTemprature = weatherData.getTemperature();
			mHumidity = weatherData.getHumidity();
			mPressure = weatherData.getPressure();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println(getClass().getName() + " Current condition ---- mTemprature is :"
				+ mTemprature + " mHumidity is :" + mHumidity
				+ " mPressure is :" + mPressure + " HeatIndex is :" + getHeatIndex());
	}
	
	private float getHeatIndex() {
		return mTemprature * mHumidity * mPressure;
	}


}
