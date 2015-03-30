//Import the chat module
import Chat.*;
import java.util.ArrayList;
import java.util.List;

class ChatServant implements ChatRoomOperations
{
	List<Player> players = new ArrayList<Player>();
    int playerCounter = 0;

    class Player{
		String name;
		Member m;
        int choice;
        int id = 0;

		Player (Member m, String name, int id){
			this.m = m;
			this.name = name;
			this.id = id;
		}
		public String getName(){
			return this.name;
		}
		public Member getMember(){
			return this.m;
		}
		public void setChoice(int choice){
			this.choice = choice;
		}
		public int getId(){
			return this.id;
		}
		public int getChoice(){
			return this.choice;
		}
	}

	Member[] members ;
	String[] names ;
	int numberMembers ;

	static int ROCK = 1;
	static int PAPER = 2;
	static int SCISSORS = 3;

	ChatServant() {
		members = new Member[10] ;
		names = new String[10] ;
		numberMembers = 0 ;
	}

//Method for registering for the game
	public void registerCB(Member m, String name) {
		playerCounter = playerCounter + 1;
		Player newPlayer = new Player(m, name, playerCounter);
		players.add(newPlayer);
		members[numberMembers] = m ;
		names[numberMembers] = name ;

		m.callBack("New Member: " + name) ;
		numberMembers++ ;

		if(numberMembers ==1){
			System.out.println("player1");
		}else if(numberMembers == 2){
			System.out.println("player2");
		}

		m.callBack("Thank you " + name + ", you are now registered");

		System.out.println("player1");
		System.out.println(name + " has just joined the game room.");
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

	public void setChoice(Member m, int choice){
      for (Player player : players){
		  if (player.getMember().equals(m)){
			  player.setChoice(choice);
			  m.callBack("Player " + player.getId() + ": " + player.getName() + " has choosen " + player.getChoice());
			 break;
		  }
	  }
	  boolean allChosen = true;
	  for (Player player : players){
		  if (player.getChoice()==0){
			  m.callBack("Player " + player.getId() + ": " + player.getName() + " has not yet choosen");
			  allChosen = false;
			  break;
		  }
	  }
	  if (allChosen){
		  //Do logic to check winner
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
