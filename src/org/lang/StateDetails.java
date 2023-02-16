package org.lang;

public class StateDetails extends LanguageInfo {
	
	public void southIndia() {

		System.out.println("SouthIndia is Tamil");
	}

	public void northIndia() {

		System.out.println("NorthIndia is Hindi");
	}
	
	public static void main(String[] args) {
		
		StateDetails s = new StateDetails();
		s.tamilLanguage();
		s.englishLanguage();
		s.hindiLanguage();
		s.southIndia();
		s.northIndia();
	}
}
