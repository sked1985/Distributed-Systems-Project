package Game;


/**
* Game/GameRoom_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/Distributed-Systems-Project/Game.idl
* Tuesday, 10 March 2015 15:51:27 o'clock GMT
*/

public class GameRoom_Tie extends _GameRoomImplBase
{

  // Constructors
  public GameRoom_Tie ()
  {
  }

  public GameRoom_Tie (Game.GameRoomOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void registerCB (Game.Member m, String name)
  {
    _impl.registerCB(m, name);
  } // registerCB

  public void chat (String c, String name)
  {
    _impl.chat(c, name);
  } // chat

  private Game.GameRoomOperations _impl;

} // class GameRoom_Tie
