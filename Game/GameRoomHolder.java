package Game;

/**
* Game/GameRoomHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/Game.idl
* 13 March 2015 14:47:35 o'clock GMT
*/

public final class GameRoomHolder implements org.omg.CORBA.portable.Streamable
{
  public Game.GameRoom value = null;

  public GameRoomHolder ()
  {
  }

  public GameRoomHolder (Game.GameRoom initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Game.GameRoomHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Game.GameRoomHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Game.GameRoomHelper.type ();
  }

}
