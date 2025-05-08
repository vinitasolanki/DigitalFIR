
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CheckLogin extends 
UnicastRemoteObject implements 
   LoginInterface
{
   CheckLogin()throws RemoteException {}
    
    
  @Override
  public boolean check(String userId,String pass)throws Exception
  {
      if(userId.equals("abc")&&pass.equals("123"))
          return true;
      else
          return false;
  }
}
   