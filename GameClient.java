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

			System.out.println("Please enter your name before entering the game:");
			String CustomerName=reader.readLine();

			room.registerCB(m, CustomerName);

			BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in)) ;
			char menuChoice;

			do {
				System.out.println("Please choose an option");
					System.out.println("1 Rock; 2 Paper; 3 Scissors; 4 Exit.");
				  		  menuChoice = (char)(System.in.read());
				       		 userEntry.readLine(); //Need to clear the out the buffer
                           if (menuChoice==(char)'1') {
						 	  System.out.println("You have selected rock");
						   }else if (menuChoice==(char)'2') {
								System.out.println("You have selected Paper");
							}else if(menuChoice==(char)'3') {
								System.out.println("You have selected Scissors");
						}
					}
					while(menuChoice !=(char)'4');
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

