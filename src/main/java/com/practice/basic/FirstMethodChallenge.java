package com.practice.basic;

public class FirstMethodChallenge {
	public static void main(String[] args) {
		displayHighScorePosition("Napster", 1);
		System.out.println(calculateHighScore(1500));
		System.out.println(calculateHighScore(1000));
		System.out.println(calculateHighScore(500));
		System.out.println(calculateHighScore(100));
		System.out.println(calculateHighScore(25));
	}

	public static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
	}

	public static int calculateHighScore(int playerScore) {
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}
		return position;
	}
}
