package GameApp;


/**
* GameApp/Game_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/Distributed Systems Project/Game.idl
* Friday, 20 February 2015 14:40:55 o'clock GMT
*/

public class Game_Tie extends _GameImplBase
{

  // Constructors
  public Game_Tie ()
  {
  }

  public Game_Tie (GameApp.GameOperations impl)
  {
    super ();
    _impl = impl;
  }

  public String player1 ()
  {
    return _impl.player1();
  } // player1

  public String player2 ()
  {
    return _impl.player2();
  } // player2

  public boolean chooseNumber (int option)
  {
    return _impl.chooseNumber(option);
  } // chooseNumber

  private GameApp.GameOperations _impl;

} // class Game_Tie