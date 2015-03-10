import Game.*;

class GameServant implements GameRoomOperations
{
	Member[] members ;
	String[] names ;
	int numberMembers ;

	GameServant() {
		members = new Member[10] ;
		names = new String[10] ;
		numberMembers = 0 ;
	}

	public void registerCB(Member m, String name) {
		members[numberMembers] = m ;
		names[numberMembers] = name ;

		for (int i=0; i<numberMembers; i++) {
			members[i].callBack("New Member: " + name) ;
		}
		numberMembers++ ;
		m.callBack("Thank you " + name + ", you are now registered");
		System.out.println(name + " has just joined the game.");

	}

	public void chat(String c, String name) {
		System.out.println(name + " said: " + c);
		String s = "Message from " + name + ": " + c  ;
		for (int i=0; i<numberMembers; i++)	{
			members[i].callBack(s) ;
		}
	}
}
