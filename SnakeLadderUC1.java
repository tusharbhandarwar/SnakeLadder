public class SnakeLadderUC1{
		 	
		public static void main(String args[]){
		 int singlePlayer = 0;
			System.out.println("Gane starts at:" +singlePlayer);
		
		int random =(int)Math.floor(Math.random()*10) % 6;
	
		if( random != singlePlayer){
			
			singlePlayer = random;
			
		System.out.println("Game is start and moved to position:" +singlePlayer);
		}
	}
}