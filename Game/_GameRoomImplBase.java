package Game;


/**
* Game/_GameRoomImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Distributed-Systems-Project/GameRoom.idl
* 02 April 2015 14:11:57 o'clock IST
*/

public abstract class _GameRoomImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements Game.GameRoom, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _GameRoomImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registerCB", new java.lang.Integer (0));
    _methods.put ("setChoice", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Game/GameRoom/registerCB
       {
         Game.Member m = Game.MemberHelper.read (in);
         String name = in.read_string ();
         this.registerCB (m, name);
         out = $rh.createReply();
         break;
       }

       case 1:  // Game/GameRoom/setChoice
       {
         Game.Member m = Game.MemberHelper.read (in);
         int choice = in.read_long ();
         this.setChoice (m, choice);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Game/GameRoom:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _GameRoomImplBase
