import java.rmi.Naming;
class Client {
 public static void main(String[] args) {
 try {
 // Look up the remote object by its name
 MyRemoteInterface remoteObject = (MyRemoteInterface) 
Naming.lookup("rmi://localhost/MyRemoteObject");
 // Invoke the remote method
 String result = remoteObject.sendMessage("Hello from RMI Client!");
 System.out.println("Server Response: " + result);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}
