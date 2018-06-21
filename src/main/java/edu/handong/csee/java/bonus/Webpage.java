package edu.handong.csee.java.bonus;


public class Webpage {

	public static void main(String[] args) {
		URLReader reader = new URLReader();
		Runner myRunner = new Runner();
		
		
		myRunner.run(args);
		

		try {
			reader.urlRead(args[1], args[3]);
		} catch (Exception e) {
			//e.printStackTrace();
		}

	}

}
