package Game;

/**
* Game/MemberHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/GameRoom.idl
* 02 April 2015 14:11:57 o'clock IST
*/

public final class MemberHolder implements org.omg.CORBA.portable.Streamable
{
  public Game.Member value = null;

  public MemberHolder ()
  {
  }

  public MemberHolder (Game.Member initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Game.MemberHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Game.MemberHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Game.MemberHelper.type ();
  }

}
