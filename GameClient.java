// GameClient.java

import Game.* ;
import java.io.* ;
import org.omg.CORBA.* ;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class GameClient {
    public static void main(String[] args) {
		String msg = "";
		try {
    		ORB orb = ORB.init(args, null);

	    	//Get the Object reference from the NameService
			org.omg.CORBA.Object nameObj=orb.resolve_initial_references("NameService");
			NamingContext rootCtx=NamingContextHelper.narrow(nameObj);
			NameComponent[] name = new NameComponent[1];
			name[0] = new NameComponent("Gameroom", "Object");
			org.omg.CORBA.Object obj = rootCtx.resolve(name);
			GameRoom room = GameRoomHelper.narrow(obj);

  			Member m = new Member_Tie(new MemberImpl()) ;

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please enter your name before entering the game room:");
			String CustomerName=reader.readLine();
			room.registerCB(m, CustomerName);
			//play game
			do {
				System.out.println("Game on , choose option: 1:Rock 2:Paper 3:Scissors 4:Exit");
				//user input
				String sChoice=reader.readLine();
				int choice = Integer.parseInt(sChoice);
				room.setChoice(m, choice);


			} while (msg != "exit");



		} catch (Exception e) {
	 	   	System.out.println("ERROR : " + e) ;
	    		e.printStackTrace(System.out);
		}
    }
}


class MemberImpl implements MemberOperations {
	public void callBack(String message) {
		System.out.println(message) ;
	}
}

