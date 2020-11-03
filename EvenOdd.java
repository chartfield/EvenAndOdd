package com.journaldev.log;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd 
{
	private int errCount = 0; //implementation of comment 2
	private int warnCount = 0; //implementation of comment 2
	private int infoCount = 0; //implementation of comment 2
	private List<String> messages = new ArrayList<String>();

	public void logError(String message) 
	{
		messages.add("ERROR: " + message);
		errCount++;
	}

	public void logWarning(String message) 
	{
		messages.add("WARNING: " + message);
		warnCount++;
	}

	public void logInformation(String message) 
	{
		messages.add("INFO: " + message);
		infoCount++;
	}

	public void displayLog() 
	{ //implementation of comment 5
		for (String str : messages) 
		{
			System.out.println(str);
		}
	}

	public void displayStats() 
	{ //implementation of comment 6
		System.out.println("Error messsages "+ errCount);
		System.out.println("Warning messsages "+ warnCount);
		System.out.println("Information messsages "+ infoCount);
	}

	public final static void main(String args []) 
	{
		EvenOdd log = new EvenOdd();
		log.logError("error");
		log.logWarning("warning");
		log.logInformation("Information");
		log.logError("error1");
		log.logWarning("warning1");
		log.logInformation("Information1");
		log.logError("error3");
		log.logError("error4");
		log.logWarning("warning3");
		log.displayLog(); //implementation of comment 7
		log.displayStats(); //implementation of comment 7
	}

}
