package com.mike.designpattern.observer1;

public class ConditionDisplay2 implements Observer, DisplayElement{
	private float mTemprature;
	private float mHumidity;
	private float mPressure;
	private Subject mWeatherData;
	
	public ConditionDisplay2 (Subject weatherData) {
		mWeatherData = weatherData;
		mWeatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		mTemprature = temperature;
		mHumidity = humidity;
		mPressure = pressure;
		display();
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
