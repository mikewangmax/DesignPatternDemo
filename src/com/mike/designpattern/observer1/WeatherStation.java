package com.mike.designpattern.observer1;

public class WeatherStation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		ConditionDisplay1 conditionDisplay1 = new ConditionDisplay1(weatherData);
		ConditionDisplay2 conditionDisplay2 = new ConditionDisplay2(weatherData);
		ConditionDisplay3 conditionDisplay3 = new ConditionDisplay3(weatherData);
		weatherData.setMeasurements(1, 2, 3);
		weatherData.setMeasurements(4, 5, 6);
		weatherData.setMeasurements(7, 8, 9);
	}
}
