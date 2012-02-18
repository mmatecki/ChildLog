package com.example.childlog.menu;


public class MainMenuItem {
	private Integer iconId;
	private Integer nameId;
	private Class<?> activityClass;
	
	public MainMenuItem(Integer iconId, Integer nameId, Class<?> activityClass){
		this.iconId = iconId;
		this.nameId = nameId;
		this.activityClass = activityClass;
	}
	
	public Integer getIconId(){
		return iconId;
	}
	
	public Integer getNameId(){
		return nameId;
	}
	
	public Class<?> getActivityClass(){
		return activityClass;
	}

}
