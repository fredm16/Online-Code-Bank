/*
CountdownGame.java
F Marinov
x19365173
09/04/2020->07/05/2020
*/
package com.tasksapp.countdown;
import javax.swing.*;//import JOptionPane
import java.util.*;//import Scanners
public class CountdownGame{
	public static void main(String args[]){

		String playAgain="";//string used for loop
do{
		//Data members
		String winner;
		String letterMesh;
		String userInput;
	    int playerOneCounter;
	    int playerTwoCounter;
	    String playerOneWord;
		String playerTwoWord;
		int index0, index1, index2, index3, index4, index5, index6, index7, index8;
	   	String letters1, letters2, letters3, letters4, letters5,letters6, letters7, letters8, letters9;

		//declare and create new object
		Countdown myCountdown;
		myCountdown=new Countdown();
		Scanner prLet = new Scanner(System.in);

		//loop to set up how many rounds
		int rounds;
		rounds=Integer.parseInt(JOptionPane.showInputDialog(null, "How many rounds would you like to play? Please only enter a number."));
		for(int l=0;l<rounds;l++){

		//my inputs methods
		myCountdown.ComputeLetters();
		letters1=myCountdown.getLetters1();
		letters2=myCountdown.getLetters2();
		letters3=myCountdown.getLetters3();
		letters4=myCountdown.getLetters4();
		letters5=myCountdown.getLetters5();
		letters6=myCountdown.getLetters6();
		letters7=myCountdown.getLetters7();
		letters8=myCountdown.getLetters8();
		letters9=myCountdown.getLetters9();
		System.out.println("Your letters will be displayed in the terminal, they are: ");
		System.out.println(letters1 +" "+ letters2 +" "+ letters3 +" "+ letters4 +" "+ letters5 +" "+ letters6 +" "+ letters7 +" "+ letters8 +" "+ letters9);
		playerOneWord=JOptionPane.showInputDialog(null, "Player one, with the letters you have seen in the terminal, please construct a java term");
		myCountdown.setPlayerOneWord(playerOneWord);
		playerTwoWord=JOptionPane.showInputDialog(null, "Player two, with the letters you have seen in the terminal, please construct a java term");
		myCountdown.setPlayerTwoWord(playerTwoWord);

		//my process methods
		myCountdown.ComputeWordsValid();
		myCountdown.ComputeWordLength();
		myCountdown.ComputeWinner();
		}

		//my get methods and display
		playerOneCounter=myCountdown.getPlayerOneCounter();
		JOptionPane.showMessageDialog(null,"This is player one's score: "+playerOneCounter);
		playerTwoCounter=myCountdown.getPlayerTwoCounter();
		JOptionPane.showMessageDialog(null,"This is player two's score: "+playerTwoCounter);
		winner=myCountdown.getWinner();
		JOptionPane.showMessageDialog(null, winner);

		playAgain=JOptionPane.showInputDialog(null, "Do you want to play again?");//done this work in a previous example in the random guesser in class, an infinite loop
	}while(playAgain.equalsIgnoreCase("yes"));//if the user types yes the game starts again

	}
}
