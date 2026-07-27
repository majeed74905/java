import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class ServerImpl extends UnicastRemoteObject implements MyRemoteInterface {
 public ServerImpl() throws RemoteException {
 // Constructor to declare RemoteException
 }
 @Override
 public String sayHello() throws RemoteException {
 return "Hello from RMI Server!";
 }
 @Override
 public String sendMessage(String message) throws RemoteException {
 return "Message received by the server: " + message;
 }
}