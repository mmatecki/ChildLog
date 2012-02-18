package com.example.childlog.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Event implements Serializable{

	private EventType eventType;
	private Timestamp dateAdd;
	
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public Timestamp getDateAdd() {
		return dateAdd;
	}
	public void setDateAdd(Timestamp dateAdd) {
		this.dateAdd = dateAdd;
	}
	
	
	
}
