import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
class Server {
 public static void main(String[] args) {
 try {
 MyRemoteInterface remoteObject = new ServerImpl();
 // Create an RMI registry on the default port (1099)
 LocateRegistry.createRegistry(1099);
 // Bind the remote object to a name in the RMI registry
 Naming.rebind("MyRemoteObject", remoteObject);
 System.out.println("RMI Server is running...");
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}
