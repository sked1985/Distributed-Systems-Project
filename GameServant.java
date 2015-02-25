import java.io.*;
import org.omg.CORBA.*;
import GameApp.*;
import org.omg.CosNaming.* ;
import org.omg.CosNaming.NamingContextPackage.*;
import java.util.Properties;

//This is the servant for our rock, paper, scissors game
public class GameServant implements GameOperations
{
		//Declaring player 1 and player2
		String player1 = "";
		String player2 = "";
		String registered = "";
		String selected = "";

    public String player1(String name1)
    {
		System.out.println("Received a call to the GameServant from player1.");
			return player1;

    }

     public String player2(String name2)
	{
		System.out.println("Received a call to the GameServant from player2.");
			return player2;
    }

     public String register(String username)
	{
		System.out.println("Received a call to the GameServant to register player.");
			return registered;

    }

    public String chooseMove(String option)
    {
		System.out.println("Received a call to the GameServant to choose a move to play.");
			return selected;

	}

	public boolean playAgain(int choice){
		return false;
	}

}