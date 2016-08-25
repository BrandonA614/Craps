import java.util.Random;
import java.util.Scanner;

public class CrapsSimulation
	{
		static int dice;
		static int diceTwo;
		static int bothDice;
		static int secondDice;
		static int secondDiceTwo;
		static int totalDice;
		public static void main(String[] args)
			{
				
//				TEST TEST TEST
//				
//				
				boolean	stillPlaying = true;
				// Rolling Variables
//				int dice = new Random().nextInt(6) + 1;
//				int diceTwo = new Random().nextInt(6) + 1;
//				int secondSet = new Random().nextInt(6) + 1;
//				int secondSetTwo = new Random().nextInt(6) + 1;
//				int secondSetBoth = secondSet + secondSetTwo;
//				int bothDice = dice + diceTwo;
				
				//Betting Variables												
				int money = 100;
				int newAmountWin;
				int newAmountLose;
				 
				//Name Input		 
				Scanner input = new Scanner(System.in);
				System.out.println("What is your Name? ");
				String name = input.nextLine();
				
				
				//Beginning of bets
				System.out.println("Hello, " + name + " Please place a bet! ");			     
				
				
				Scanner bet = new Scanner(System.in);
				int betAmount = bet.nextInt(); 
				
				
				
			    /*Pause Variables
				Scanner pause = new Scanner(System.in);
				String pauseTwo = pause.nextLine();
				*/
				
				
				// Initial Rolling of Dice
				rollDice();
				diceTwo();
				
				// Start Code Chunks
				
				if(bothDice == 2 || bothDice == 12 ){
					newAmountLose = money - betAmount;
					System.out.println("You rolled a " + dice + " and a " + diceTwo + " for a total of " + bothDice + " You lose!" + " You now have $" + newAmountLose);	
						
						
					}else if(bothDice == 7){
						newAmountWin = betAmount + money;
						System.out.println("You rolled a  " + dice + " and a " + diceTwo + " for a total of " + bothDice + " You Win! " + " You now have $" + newAmountWin);
						
					
					
					}else
						System.out.println("You rolled a " + dice + " and a " + diceTwo + " for a total of " + bothDice);
						System.out.println("Please hit enter to roll again!");
						Scanner pause = new Scanner(System.in);
						String pauseTwo = pause.nextLine();
				
					
			while(stillPlaying)
				{
					if(totalDice == 7){
						newAmountLose = money - betAmount;
						System.out.println("Your point is " + bothDice + " but you rolled " + secondDiceTwo + " and " + secondDice + " for a total of " + totalDice +" You Lose!" + " You now have $" + newAmountLose);
						stillPlaying = false;
						
					}else if(bothDice != totalDice){
						diceTwo();
						System.out.println("Your point is " + bothDice + " but you rolled " + secondDice + " and " + secondDiceTwo + " Press enter to Reroll");
						Scanner pauseSecond = new Scanner(System.in);
						String pauseTwoSecond = pause.nextLine();
						
					}else if(bothDice == totalDice){
						newAmountWin = betAmount + money;
						System.out.println("Your point is " + bothDice + " and you rolled " + secondDice + " and " + secondDiceTwo + " You win!!" + " You now have $" + newAmountWin);
						stillPlaying = false;
						
					}
						
				}
				

			}
		
		public static int rollDice()
		{
			 dice = new Random().nextInt(6) + 1;
			 diceTwo = new Random().nextInt(6) + 1;
			 bothDice = dice + diceTwo;
			 return bothDice;
			
		}
		public static int diceTwo(){
			 secondDice = new Random().nextInt(6) + 1;
			 secondDiceTwo = new Random().nextInt(6) + 1;
			 totalDice = secondDice + secondDiceTwo;
			 return totalDice;
			
		}
		

	}
