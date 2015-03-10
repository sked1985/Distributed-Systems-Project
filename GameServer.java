// GameServer.java
import  Game.* ;
import org.omg.CORBA.*;
import java.io.* ;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;


public class GameServer {

    public static void main(String args[]) {
	try{
	    	// create and initialize the ORB
	    	ORB orb = ORB.init(args, null);

			GameRoom g = new GameRoom_Tie(new GameServant()) ;
	    	orb.connect(g);

	    	//Create  Object reference from the NameService
			org.omg.CORBA.Object nameObj=orb.resolve_initial_references("NameService");
			NamingContext rootCtx=NamingContextHelper.narrow(nameObj);
			NameComponent[] name = new NameComponent[1];
			name[0] = new NameComponent("Gameroom", "Object");
			rootCtx.rebind(name,g);
/*
	    	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("IOR")) ;
	    	out.writeObject(orb.object_to_string(c)) ;
			out.close() ;
*/
			System.out.println("The Game Room is now ready for new players ...") ;
			orb.run();

		} catch (Exception e) {
	    		System.err.println("ERROR: " + e);
	    		e.printStackTrace(System.out);
		}
    }
}
