package Chat;


/**
* Chat/ChatRoom_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/Chatroom.idl
* 25 March 2015 21:11:18 o'clock GMT
*/

public class ChatRoom_Tie extends _ChatRoomImplBase
{

  // Constructors
  public ChatRoom_Tie ()
  {
  }

  public ChatRoom_Tie (Chat.ChatRoomOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void registerCB (Chat.Member m, String name)
  {
    _impl.registerCB(m, name);
  } // registerCB

  public void chat (String c, String name)
  {
    _impl.chat(c, name);
  } // chat

  private Chat.ChatRoomOperations _impl;

} // class ChatRoom_Tie
