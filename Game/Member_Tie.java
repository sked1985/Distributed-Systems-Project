package Game;


/**
* Game/Member_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/GameRoom.idl
* 02 April 2015 14:11:57 o'clock IST
*/

public class Member_Tie extends _MemberImplBase
{

  // Constructors
  public Member_Tie ()
  {
  }

  public Member_Tie (Game.MemberOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void callBack (String message)
  {
    _impl.callBack(message);
  } // callBack

  private Game.MemberOperations _impl;

} // class Member_Tie