package Game;


/**
* Game/playerDetails.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/Game.idl
* 13 March 2015 14:47:35 o'clock GMT
*/

public final class playerDetails implements org.omg.CORBA.portable.IDLEntity
{
  public String PlayerName = null;
  public String UniqueID = null;

  public playerDetails ()
  {
  } // ctor

  public playerDetails (String _PlayerName, String _UniqueID)
  {
    PlayerName = _PlayerName;
    UniqueID = _UniqueID;
  } // ctor

} // class playerDetails
