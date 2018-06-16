package com.mike.designpattern.example.headfirst.observer1;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> mObservers;
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	public WeatherData() {
		mObservers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		mObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = mObservers.indexOf(o);
		if (i > 0) {
			mObservers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		int size = mObservers.size();
		for (int i=0; i<size; i++) {
			Observer observer = mObservers.get(i);
			observer.update(mTemperature, mHumidity, mPressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		mTemperature = temperature;
		mHumidity = humidity;
		mPressure = pressure;
		measurementsChanged();
	}

}
