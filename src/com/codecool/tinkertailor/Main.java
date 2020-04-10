package com.codecool.tinkertailor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    TinkerTailor tinkerTailor = new TinkerTailor(5, 3);
	    List outcome = tinkerTailor.execute();
	    System.out.println("The outcome of the game is: " + outcome);

		TinkerTailor tinkerTailor2 = new TinkerTailor(6, 5);
		List outcome2 = tinkerTailor2.execute();
		System.out.println("The outcome of the game is: " + outcome2);


		TinkerTailor tinkerTailor3 = new TinkerTailor(3, 2);
		List outcome3 = tinkerTailor3.execute();
		System.out.println("The outcome of the game is: " + outcome3);
    }
}
