package com.emisdep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseCat garfield = new HouseCat("Garfield", "Orange", 2_500, false, "Persian Tabby");

        garfield.displayWeightInPounds();
        garfield.meow();
    }
}
