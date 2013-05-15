package com.mike.designpattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}
	
	@Override
	public synchronized void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}
	
	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}
	
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		mTemperature = temperature;
		mHumidity = humidity;
		mPressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return mTemperature;
	}

	public float getHumidity() {
		return mHumidity;
	}

	public float getPressure() {
		return mPressure;
	}
	
	
	
}
