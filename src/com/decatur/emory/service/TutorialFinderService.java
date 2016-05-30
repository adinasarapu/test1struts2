package com.decatur.emory.service;

public class TutorialFinderService {
	public String getBestTutorialSite(String lan){
		if(lan.equals("telugu")){
			return "telugu";
		} else return "english";	
	}
}
