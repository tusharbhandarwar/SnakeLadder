public class SnakeLadderUC2{

	public static void main(String args[]){
	
	int singlePlayer = 0;
	int diceRoll = 0;
	System.out.println("Game start at position:" +singlePlayer);
	
	int randomNumber =(int)Math.floor((Math.random()*10) % 6)+1;
	diceRoll = randomNumber;
	System.out.println("random number between 1 to 6 is:" +diceRoll);
	}
}
	
	