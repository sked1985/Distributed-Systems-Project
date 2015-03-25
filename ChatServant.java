//Import the chat module
import Chat.*;

class ChatServant implements ChatRoomOperations
{
	Member[] members ;
	String[] names ;
	int numberMembers ;


	ChatServant() {
		members = new Member[10] ;
		names = new String[10] ;
		numberMembers = 0 ;

	}

//Method for registering for the game
	public void registerCB(Member m, String name, String player1, String player2) {
		members[numberMembers] = m ;
		names[numberMembers] = name ;


		for (int i=0; i<numberMembers; i++) {
			members[i].callBack("New Member: " + name) ;
			if(numberMembers == 1){
				player1 = name;
			}else if(numberMembers == 2){
				player2 = name;
			}
		}
		numberMembers++ ;
		System.out.println("????????????" +player1);
		System.out.println("!!!!!!!!!!!" + player2);
		if(numberMembers ==1){
			System.out.println("player1");
		}else if(numberMembers == 2){
			System.out.println("player2");
		}
		m.callBack("Thank you " + name + ", you are now registered");
		System.out.println(name + " has just joined the chat room.");
		System.out.println(numberMembers + "Total amount of players ");
		if (numberMembers ==2){
			System.out.println("Game on!!");
			String a = "Game on , choose option: 1:Rock 2:Paper 3:Scissors";
				for (int i=0; i<numberMembers; i++) {
				members[i].callBack(a);
			}
		}else{
			System.out.println("Not enough players!!!!");
			String b = "Be patient, we are waiting for another player";

			for (int i=0; i<numberMembers; i++) {
						members[i].callBack(b);
		}
	}
}
//This is the method for the game
	public void chat(String c, String name) {
		System.out.println(name + " said: " + c);
		String s = "Message from " + name + ": " + c  ;
		/*for (int i=0; i<numberMembers; i++)	{
			members[i].callBack(s) ;
		}*/
	}
}
