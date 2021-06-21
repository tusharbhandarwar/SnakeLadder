public class SnakeLadderUC7
{
	public static void main(String[] args)
	{
	 int player_Position1 = 0;
	 int player_Position2 = 0;
	 int snake_Position = 30;
	 while(player_Position1 < 100)
	 {
		  int random_Check1 = (int)Math.floor(Math.random() * 10) % 6;
		  int random_Check2 = (int)Math.floor(Math.random() * 10) % 6;
		  if(random_Check1 != 0 || random_Check2 != 0)
		  { 
			   player_Position1 = player_Position1 + random_Check1;
			   player_Position2 = player_Position2 + random_Check2;
			   if(player_Position1 == snake_Position)
			   { 
			   	  System.out.println("First Person's Dies meet the Snake position so he need to move in backward direction ");
				  player_Position1 = 0;
			   }
			   else if(player_Position2 == snake_Position)
			   {
				   System.out.println("First Person's Dies meet the Snake position so he need to move in backward direction ");
				   player_Position2 = 0;
			   }
		  }
			if(random_Check1 != 0 || random_Check2 != 0)
			{
				System.out.println("First Person move :" + player_Position1);
				System.out.println("Second Person move :" + player_Position2);
			}
			if(player_Position1 >= 100)
			{	
				System.out.println("First Person Won yhe Game.............");
				break;
			}
			if(player_Position2 >= 100)
			{
				System.out.println("Second Person Won the Game.............");
				break;
			}
		}
	}
}  