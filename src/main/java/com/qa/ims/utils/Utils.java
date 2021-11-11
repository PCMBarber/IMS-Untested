package com.qa.ims.utils;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {
	private final Scanner scanner;

	public Utils(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public Utils() {
		scanner = new Scanner(System.in);
	}

	public Long getLong() {
		String input;
		Long longInput = null;
		do {
			input = getString();
			try {
				longInput = Long.parseLong(input);
			} catch (NumberFormatException nfe) {
				System.out.println("Error please enter a number");
			}
		} while (longInput == null);
		return longInput;
	}

	public String getString() {
		return scanner.nextLine();
	}

	public Double getDouble() {
		String input;
		Double doubleInput = null;
		do {
			input = getString();
			try {
				doubleInput = Double.parseDouble(input);
			} catch (NumberFormatException nfe) {
				System.out.println("Error please enter a number");
			}
		} while (doubleInput == null);
		return doubleInput;
	}
	
	public Boolean getBoolean() {
		String input;
		Boolean boolInput = null;
		do {
			input = getString();
			switch(input.toLowerCase()) {
			case "true":
				boolInput = true;
				break;
			case "false":
				boolInput = false;
				break;
			default:
				System.out.println("Error please enter true or false");
			}
		} while (boolInput == null);
		return boolInput;
	}

}
