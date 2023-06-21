package com.example.runFile;

public interface SayGreetings {
	
	static String greetBasedOnTimeOfDay()
	{
		int hour=java.time.LocalTime.now().getHour();
		
		if(hour>=12 && hour<=15)
		{
			return "Good Afternoon!";
		}
		else if(hour>15 && hour<21)
		{
			return "Good Evening!";
		}
		else if(hour>20 && hour <24)
		{
			return "Good Night!";
		}
		else if(hour>=0 && hour<7)
		{
			return "Good night!";
		}
		return "Good Morning!";
	}
}
