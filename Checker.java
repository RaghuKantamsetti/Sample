package org.tasksix.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Checker {
	DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
    LocalDateTime today = LocalDateTime.now();
    
	public void earlierOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, formatedDate);
		if (myDate.isBefore(today)) {
	        System.out.println(userDate + " is in the past.");
	    }
	}
	
	public void AfterOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, formatedDate);
		 if (myDate.isAfter(today)) {
		        System.out.println(userDate + " is in the future.");
		 }
	}
	public void converter() {
		System.out.println(formatedDate.toString());
	}
}
