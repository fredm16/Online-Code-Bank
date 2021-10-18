/*
Countdown.java
F Marinov
x19365173
09/04/2020->07/05/2020
*/
import javax.swing.*;//Import JOptionPane
public class Countdown{

	//Data Members

	//SECTION FOR ARRAYS
	private final String bank[]={"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "import",  "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};
	private final String vowels[]={"a", "e", "i", "o", "u"};
	private final String consonants[]={"b", "c", "d", "f", "g", "h", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w", "x", "y", "z"};


	//SECTION FOR WORDS AND PLAYERS
	private String userInput;
	private String playerOneWord;
	private String playerTwoWord;
	private boolean valid1;
	private boolean valid2;


	//SECTION FOR PLAYER COUNTERS
    private int playerOneCounter;
    private int playerTwoCounter;

    //SECTION FOR WINNER MESSAGE
    private String winner;

	//SECTION FOR INDEXES
   	private int index0, index1, index2, index3, index4, index5, index6, index7, index8;
	private String letters1, letters2, letters3, letters4, letters5,letters6, letters7, letters8, letters9;

	//MAIN CONSTRUCTOR
	Countdown(){

		winner="";

		playerOneWord="";
		playerTwoWord="";
		userInput="";
		valid1=false;
		valid2=false;

		playerOneCounter=0;
		playerTwoCounter=0;

		playerOneWord="";
		playerTwoWord="";


		index0=0;
		index1=0;
		index2=0;
		index3=0;
		index4=0;
		index5=0;
		index6=0;
		index7=0;
		index8=0;

		letters1="";
		letters2="";
		letters3="";
		letters4="";
		letters5="";
		letters6="";
		letters7="";
		letters8="";
		letters9="";

		}
	//Setters
	public void setPlayerOneWord(String playerOneWord){
		this.playerOneWord=playerOneWord;
	}
	public void setPlayerTwoWord(String playerTwoWord){
			this.playerTwoWord=playerTwoWord;
	}

	//Constructor for letter compution
	public void ComputeLetters(){
		userInput=JOptionPane.showInputDialog(null, "(FIRST LETTER - please enter 'consonant' or 'vowel'");
				if(userInput.equalsIgnoreCase("vowel")){
							index0=(int)(Math.random()*4);
							letters1=vowels[index0];
						}
				else if(userInput.equalsIgnoreCase("consonant")){
						index0=(int)(Math.random()*20);
						letters1=consonants[index0];
						}
				else{
					JOptionPane.showMessageDialog(null, "False input, the letter has been set to a vowel");
					index0=(int)(Math.random()*4);
					letters1=vowels[index0];
					}

				userInput=JOptionPane.showInputDialog(null, "(SECOND LETTER - please enter 'consonant' or 'vowel'");
						if(userInput.equalsIgnoreCase("vowel")){
									index1=(int)(Math.random()*4);
									letters2=vowels[index1];
								}
						else if(userInput.equalsIgnoreCase("consonant")){
								index1=(int)(Math.random()*20);
								letters2=consonants[index1];
								}
						else{
							JOptionPane.showMessageDialog(null, "False input, the letter has been set to a consonant");
							index1=(int)(Math.random()*20);
							letters2=consonants[index1];
					}

				userInput=JOptionPane.showInputDialog(null, "(THIRD LETTER - please enter 'consonant' or 'vowel'");
								if(userInput.equalsIgnoreCase("vowel")){
											index2=(int)(Math.random()*4);
											letters3=vowels[index2];
										}
								else if(userInput.equalsIgnoreCase("consonant")){
										index2=(int)(Math.random()*20);
										letters3=consonants[index2];
										}
								else{
									JOptionPane.showMessageDialog(null, "False input, the letter has been set to a vowel");
									index2=(int)(Math.random()*4);
									letters3=vowels[index2];
					}

				userInput=JOptionPane.showInputDialog(null, "(FOURTH LETTER - please enter 'consonant' or 'vowel'");
										if(userInput.equalsIgnoreCase("vowel")){
													index3=(int)(Math.random()*4);
													letters4=vowels[index3];
												}
										else if(userInput.equalsIgnoreCase("consonant")){
												index3=(int)(Math.random()*20);
												letters4=consonants[index3];
												}
										else{
											JOptionPane.showMessageDialog(null, "False input, the letter has been set to a consonant");
											index3=(int)(Math.random()*20);
											letters4=consonants[index3];
					}

				userInput=JOptionPane.showInputDialog(null, "(FIVE LETTER - please enter 'consonant' or 'vowel'");
												if(userInput.equalsIgnoreCase("vowel")){
															index4=(int)(Math.random()*4);
															letters5=vowels[index4];
														}
												else if(userInput.equalsIgnoreCase("consonant")){
														index4=(int)(Math.random()*20);
														letters5=consonants[index4];
														}
												else{
													JOptionPane.showMessageDialog(null, "False input, the letter has been set to a vowel");
													index4=(int)(Math.random()*4);
													letters5=vowels[index4];
					}

				userInput=JOptionPane.showInputDialog(null, "(SIX LETTER - please enter 'consonant' or 'vowel'");
														if(userInput.equalsIgnoreCase("vowel")){
																	index5=(int)(Math.random()*4);
																	letters6=vowels[index5];
																}
														else if(userInput.equalsIgnoreCase("consonant")){
																index5=(int)(Math.random()*20);
																letters6=consonants[index5];
																}
														else{
															JOptionPane.showMessageDialog(null, "False input, the letter has been set to a vowel");
															index5=(int)(Math.random()*20);
															letters6=consonants[index5];
					}

				userInput=JOptionPane.showInputDialog(null, "(SEVENTH LETTER - please enter 'consonant' or 'vowel'");
																if(userInput.equalsIgnoreCase("vowel")){
																			index6=(int)(Math.random()*4);
																			letters7=vowels[index6];
																		}
																else if(userInput.equalsIgnoreCase("consonant")){
																		index6=(int)(Math.random()*20);
																		letters7=consonants[index6];
																		}
																else{
																	JOptionPane.showMessageDialog(null, "False input, the letter has been set to a consonant");
																	index6=(int)(Math.random()*20);
																	letters7=consonants[index6];
					}
		         userInput=JOptionPane.showInputDialog(null, "(EIGHTH LETTER - please enter 'consonant' or 'vowel'");
																		if(userInput.equalsIgnoreCase("vowel")){
																					index7=(int)(Math.random()*4);
																					letters8=vowels[index7];
																				}
																		else if(userInput.equalsIgnoreCase("consonant")){
																				index7=(int)(Math.random()*20);
																				letters8=consonants[index7];
																				}
																		else{
																			JOptionPane.showMessageDialog(null, "False input, the letter has been set to a vowel");
																			index6=(int)(Math.random()*20);
																			letters8=vowels[index7];
																			}

				userInput=JOptionPane.showInputDialog(null, "(NINETH LETTER - please enter 'consonant' or 'vowel'");
																		if(userInput.equalsIgnoreCase("vowel")){
																					index8=(int)(Math.random()*4);
																					letters9=vowels[index8];
																				}
																		else if(userInput.equalsIgnoreCase("consonant")){
																				index8=(int)(Math.random()*20);
																				letters9=consonants[index8];
																				}
																		else{
																			JOptionPane.showMessageDialog(null, "False input, the letter has been set to a consonant");
																			index8=(int)(Math.random()*20);
																			letters9=consonants[index8];
									}
	}
	//Constructor for word validator
	public void ComputeWordsValid(){
		for(int i=0;i<bank.length;i++){
			if(playerOneWord.equalsIgnoreCase(bank[i])){//it takes my word, and checks if it is in my word bank, word bank is associated with the loop i
				valid1=true;//i have setup a boolean as emer said, and autoassigned it to be false in the constructuor of Countdown() during support classes on booleans
				}
			}

		for(int i=0;i<bank.length;i++){
			if(playerTwoWord.equalsIgnoreCase(bank[i])){
				valid2=true;
				}
			}

		if(valid1){
			JOptionPane.showMessageDialog(null,"Your word is valid player one!");//if boolean is valid print this message
			}
		else if(!valid1){
			JOptionPane.showMessageDialog(null, "Your word is not valid player one! You just lost a point :(");//else if boolean is not valid print this message and execute a score minus
			playerOneCounter=playerOneCounter-1;
			}

		if(valid2){
			JOptionPane.showMessageDialog(null,"Your word is valid player two!");
			}
		else if(!valid2){
			JOptionPane.showMessageDialog(null, "Your word is not valid player two! You just lost a point :(");
			playerTwoCounter=playerTwoCounter-1;
			}
		}

		//Constructor for word length compution
		public void ComputeWordLength(){

			if((playerOneWord.length()>playerTwoWord.length())&&(valid1=true)){
				JOptionPane.showMessageDialog(null,"Player one has won this round!");
				playerOneCounter=playerOneCounter+1;
				}
			else if((playerTwoWord.length()>playerOneWord.length())&&(valid2=true)){
				JOptionPane.showMessageDialog(null, "Player two has won this round!");
				playerTwoCounter=playerTwoCounter+1;
				}
			else{
				JOptionPane.showMessageDialog(null, "It seems like no one has one this round?...What a shame.");
				}


			}
		//Constructor for winner decclaration
		public void ComputeWinner(){
			if(playerOneCounter>playerTwoCounter){
				winner="Congradulations player one! You did it! You Won!";
				}
			else if(playerTwoCounter>playerOneCounter){
				winner="Congradulationns player two! You did it! You Won!";
				}
			else{
				winner="We've seen to end up in a draw?! Good game boys/girls!";
				}
			}


		//getters
		public String getLetters1(){
				return letters1;
		}
		public String getLetters2(){
				return letters2;
		}
		public String getLetters3(){
				return letters3;
		}
		public String getLetters4(){
				return letters4;
		}
		public String getLetters5(){
				return letters5;
		}
		public String getLetters6(){
				return letters6;
		}
		public String getLetters7(){
				return letters7;
		}
		public String getLetters8(){
				return letters8;
		}
		public String getLetters9(){
				return letters9;
		}

		public int getPlayerOneCounter(){
				return playerOneCounter;
			}
		public int getPlayerTwoCounter(){
				return playerTwoCounter;
		}
		public String getWinner(){
			return winner;
			}
}