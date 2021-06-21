public class SnakeLadderUC5 
{
	public static void main(String[] args)
   	{
   		int random_number = 0;
		int first_Ladder_Position = 10;
		int jumpFrom_firstLadder_Position = 38;
		int second_Ladder_Position = 43;
		int jumpFrom_secondLadder_Position = 87;
		int diff1, diff2;
		int firstSnake_Position = 25;
		int secondSnake_Position = 78;
		while(random_number < 100)
		{
			int random_Check = (int)Math.floor(Math.random() * 10) % 6;
			if(random_Check != 0)
			{
				random_number = random_number + random_Check;
			}
			if(random_number == firstSnake_Position)
			{
			 	System.out.println("if Ladder Moved to Snakes Position and moved towards backward direction:");
				random_number = random_number - random_Check;
			}
			else if(random_number == secondSnake_Position)
			{
				System.out.println("if Ladder Moved to Snakes Position and moved toeards backward direction:");
				random_number = random_number - random_Check;
			}
			if(random_number == first_Ladder_Position)
			{
				System.out.println("Ladder moved to upper Ladder Position is:");
				diff1 = jumpFrom_firstLadder_Position - first_Ladder_Position;
				random_number = random_number + diff1;
			}
			if(random_number == first_Ladder_Position)
                        {
                                System.out.println("Ladder moved to upper Ladder Position is:");
                                diff2 = jumpFrom_secondLadder_Position - second_Ladder_Position;
                                random_number = random_number + diff2;
                        }
 
			if(random_Check != 0)
			{
				System.out.println("Ladder got a Number"+ random_Check + "My Ladder Moved to the Position" + random_number);
			}
		
			if(random_number > 100)
			{
				random_number = random_number - random_Check;
	            		System.out.println(random_Check+" "+random_number);
		    		break;
                   	}		

		}
	    
	}
}