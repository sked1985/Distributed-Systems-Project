//Import the game module
import Game.*;
import java.util.ArrayList;
import java.util.List;

class GameServant implements GameRoomOperations
{
	//Stacks players in arraylist
	List<Player> players = new ArrayList<Player>();
    int playerCounter = 0;

	//player details, choice, id
    class Player{
		String name;
		Member m;
        int choice;
        int id = 0;
		//assigning name and id to member
		Player (Member m, String name, int id){
			this.m = m;
			this.name = name;
			this.id = id;
		}
		//getting name
		public String getName(){
			return this.name;
		}
		//getting member
		public Member getMember(){
			return this.m;
		}
		//setting choice
		public void setChoice(int choice){
			this.choice = choice;
		}
		//getting id
		public int getId(){
			return this.id;
		}
		//getting choice
		public int getChoice(){
			return this.choice;
		}
	}
	//declaring members, names, numberMembers
	Member[] members ;
	String[] names ;
	int numberMembers ;

	static int ROCK = 1;
	static int PAPER = 2;
	static int SCISSORS = 3;

	GameServant() {
		members = new Member[10] ;
		names = new String[10] ;
		numberMembers = 0 ;
	}

//Register user for the game
	public void registerCB(Member m, String name) {
		playerCounter = playerCounter + 1;
		Player newPlayer = new Player(m, name, playerCounter);
		players.add(newPlayer);
		members[numberMembers] = m ;
		names[numberMembers] = name ;

		//calls name of the user
		m.callBack("New Member: " + name) ;
		numberMembers++ ;

		//declaring player1 and player2
		if(numberMembers ==1){
			System.out.println("player1");
		}else if(numberMembers == 2){
			System.out.println("player2");
		}
		//callback to client, stating that user is registred in game
		m.callBack("Thank you " + name + ", you are now registered");

		//server print statement
		System.out.println(name + " has just joined the game room.");

		//server call back number of users has been registered for the game
		System.out.println(numberMembers + "Total amount of players ");

		//if amount of users are 2 then game can start
		if (numberMembers ==2){
			System.out.println("Game on!!");
			String a = "Game on , choose option: 1:Rock 2:Paper 3:Scissors";
				for (int i=0; i<numberMembers; i++) {
				members[i].callBack(a);
			}
		//If not enough players game will state the following:
		}else{
			System.out.println("Not enough players!!!!");
			String b = "Be patient, we are waiting for another player";

			for (int i=0; i<numberMembers; i++) {
						members[i].callBack(b);
		}
	}
}
	//Getting user inputs
	public void setChoice(Member m, int choice){
      for (Player player : players){
		  if (player.getMember().equals(m)){
			  player.setChoice(choice);
			  System.out.println("Player " + player.getId() + ": " + player.getName() + " has choosen " + player.getChoice());
			 break;
		  }
	  }
	  //
	  boolean allChosen = true;
	  Player player1 = null;
	  Player player2 = null;

	  //getting choices from users
	  for (Player player : players){
		  if (player.getId() == 1){

			  //setting choice from player1
		    player1 = player;
		  }
		  else if (player.getId() == 2){

			  //setting choice from player2
            player2 = player;
		  }

		  //if user has not choosen the value, it will state the following
		  if (player.getChoice()==0){
			  m.callBack("Player " + player.getId() + ": " + player.getName() + " has not yet choosen");
			  allChosen = false;
			  break;
		  }
	  }
	//here user inputs will be compared (player1 vs player2)
	  if (allChosen){

		  //if results matches, then do:
		  if (player1.getChoice()== player2.getChoice()) {
		     System.out.println("It's a tie!");
	  	  }
		  else if (player1.getChoice()== 1) {
		     if (player2.getChoice()==3)
		        System.out.println("Rock crushes scissors. Player 1 wins!!");
		     else if (player2.getChoice()==2)
		          System.out.println("Paper eats rock. Player 2 wins!!");
		  }
		  else if (player1.getChoice()==2) {
		     if (player2.getChoice()==3)
		         System.out.println("Scissor cuts paper. Player 2 wins!!");
		     else if (player2.getChoice()==1)
		          System.out.println("Paper eats rock. Player 1 wins!!");
		  }
		  else if (player1.getChoice()==3) {
		       if (player2.getChoice()==2)
		           System.out.println("Scissor cuts paper. Player 1 wins!!");
		       else if (player2.getChoice()==1)
		          System.out.println("Rock breaks scissors. Player 2 wins!!");
			}

		}
	}
}



//This is the method for the game
	/*public void chat(String c, String name) {
		System.out.println(name + " said: " + c);
		String s = "Message from " + name + ": " + c  ;
		/*for (int i=0; i<numberMembers; i++)	{
			members[i].callBack(s) ;
		}
	}
}*/
