import java.io.*;
import java.util.*;
import Game.*;
import org.omg.CORBA.*;
import java.util.Date.*;
//Game Servant
public class GameRoomServant implements GameRoomOperations
{
		public static Hashtable hashtable;
		public static ORB orb;
		public static String UniqueID;
		public static Integer ID_Counter;
	//	Member[] members ;
	//	String[] PlayerName ;
	//	int UniqueID ;

	public GameRoomServant(org.omg.CORBA.ORB orb){
			hashtable = new Hashtable();
			this.orb = orb;
			GAMEID = 10 ;


			playerDetails GAMEPlayerDetails = new playerDetails();
			GAMEPlayerDetails.PlayerName = "JOE";
			GAMEPlayerDetails.UniqueID = GAMEID;

			//members = new Member[10] ;
			//PlayerNames = new String[10] ;

			ID_Counter =0;
			hashtable.put(GAMEPlayerDetails.UniqueID, GAMEPlayerDetails);
	}

	//Register for the game
	public void registerForGame(org.omg.CORBA.Any anyPlayerDetails, StringHolder password) {
		String timestamp=new Date().toString();
		UniqueID = Integer.toString(++ID_Counter);

		playerDetails myplayerDetails = playerDetailsHelper.extract(anyPlayerDetails);
		myplayerDetails.UniqueID = UniqueID;
		hashtable.put(UniqueID, myplayerDetails);
		password.value = UniqueID;
/*
		for (int i=0; i<UniqueID; i++) {
			members[i].callBack("New Member: " + PlayerName) ;
		}
		UniqueID++ ;
		m.callBack("Thank you " + PlayerName + ", you are now registered");
		System.out.println(PlayerName + " has just joined the game.");
	*/
	}

	public void game(String g, String PlayerName) {
		System.out.println(PlayerName + " said: " + g);
		String s = "Message from " + PlayerName + ": " + g  ;
		for (int i=0; i<UniqueID; i++)	{
			members[i].callBack(s) ;
		}
	}

	public playerDetails getPlayerInfo (String UniqueID){
	// try{
		// playerDetails myplayerDetails = (playerDetails)hashtable.get(UniqueID);
		playerDetails GAMEPlayerDetails = (playerDetails) hashtable.get(UniqueID);
		// System.out.println ("Balance Left: " + GAMEPlayerDetails.Balance);
		return GAMEPlayerDetails;

	// }catch (Exception e) {System.err.println(e);
	// e.printStackTrace(System.out);
	// }

}
}
