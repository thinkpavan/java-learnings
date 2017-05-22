package com.learning.sun.tutorials.io;

import java.io.Console;
import java.util.Arrays;

public class Password {
	public static void main(String[] args) {
		Console c = System.console();
		if (c == null) {
			System.err.println(" no console");
			System.exit(1);
		}

		String login = c.readLine("Enter your login");
		char[] password = c.readPassword("Enter your password ");

		if (verify(login, password)) {
			boolean noMatch;
			do {
				char[] newPassword1 = c.readPassword("Enter new password");
				char[] newPassword2 = c
						.readPassword("Enter new password again");

				noMatch = !Arrays.equals(newPassword1, newPassword2);

				if (noMatch)
					System.err.println("Password did not match try again");
				else {
					change(login, newPassword1);
					c.format("Passowrd for %s changed.%n", login);
				}
			} while (noMatch);
		}
	}

	private static void change(String login, char[] newPassword1) {
		// do nothing
	}

	private static boolean verify(String login, char[] password) {
		// no implementation
		return true;
	}
}
