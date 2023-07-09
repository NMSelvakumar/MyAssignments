package org.system;

public class Desktop extends Computer {
	
	public void DesktopSize() {
		System.out.println("DesktopSize function --> Desktop");
	}
	
	public static void main(String[] args) {
		Desktop dk = new Desktop();
		dk.DesktopSize();
		dk.ComputerModel();
	}
	
}
