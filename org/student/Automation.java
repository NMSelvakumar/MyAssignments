package org.student;

public class Automation extends MultipleLangauge {

	@Override
	public void Java() {
		System.out.println("Java Function --> Languages Class");		
	}
	
	@Override
	public void Selenium() {
		System.out.println("Selenium Function --> TestTool Class");		
	}	

	@Override
	public void Ruby() {
		System.out.println("Ruby Function --> MultipleLangauge Class");		
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.Ruby();
		auto.Python();
	}

}
