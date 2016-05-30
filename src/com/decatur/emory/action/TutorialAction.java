package com.decatur.emory.action;

import com.decatur.emory.service.TutorialFinderService;

public class TutorialAction {
	private String tutorialFinderService;
	private String lang;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}


	public String getTutorialFinderService() {
		return tutorialFinderService;
	}


	public void setTutorialFinderService(String tutorialFinderService) {
		this.tutorialFinderService = tutorialFinderService;
	}


	public String addTutorial() {
		//TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//setTutorialFinderService(tutorialFinderService.getBestTutorialSite(getLang()));
		System.out.println("executed addTutorial()");
		return "success";
	}
	public String getTutorial() {
		System.out.println("executed getTutorial()");
		return "success";
	}
	
}
