import java.io.*;
import java.util.*;
//Import Game module
import Game.*;
import java.util.Date.*;

//Game Servant
public class GameServant implements GameRoomOperations
{
	public static Hashtable hashtable;
	public static ORB orb;
	public static String UniqueID;
	public static Integer ID_Counter;
	Member[] members ;
	String[] names ;
	int numberMembers ;


	public GameServant(org.omg.CORBA.ORB orb){
		hashtable = new Hashtable();
		this.orb = orb;
		playerDetails GAMEplayerDetails = new playerDetails();
		GAMEplayerDetails.PlayerName = "JOE";
		GAMEplayerDetails.UniqueID = GAMEID;

		//members = new Member[10] ;
		//names = new String[10] ;
		//numberMembers = 0 ;



		ID_Counter =0;

		hashtable.put(GAMEplayerDetails.UniqueID, GAMEplayerDetails);

	}

	//Register for the game
	public void registerForGame(org.omg.CORBA.Any anyPlayerDetails, StringHolder password) {
		String timestamp=new Date().toString();
		UniqueID = Integer.toString(++ID_Counter);
		for (int i=0; i<numberMembers; i++) {
			members[i].callBack("New Member: " + name) ;
		}
		numberMembers++ ;
		m.callBack("Thank you " + name + ", you are now registered");
		System.out.println(name + " has just joined the game.");

	}

	public void game(String g, String name) {
		System.out.println(name + " said: " + g);
		String s = "Message from " + name + ": " + g  ;
		for (int i=0; i<numberMembers; i++)	{
			members[i].callBack(s) ;
		}
	}

	public void getPlayer
}
