package Chat;


/**
* Chat/Member_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/Chatroom.idl
* 02 April 2015 10:41:01 o'clock IST
*/

public class Member_Tie extends _MemberImplBase
{

  // Constructors
  public Member_Tie ()
  {
  }

  public Member_Tie (Chat.MemberOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void callBack (String message)
  {
    _impl.callBack(message);
  } // callBack

  private Chat.MemberOperations _impl;

} // class Member_Tie
