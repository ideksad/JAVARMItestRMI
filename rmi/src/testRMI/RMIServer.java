package testRMI;
	
import java.rmi.registry.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
	
public class RMIServer implements RMIInterface {
	
		

			public String remoteMethod() {
				return "Remote Method in RMIServer called !!";
			}
			
			public static void main(String args[]) {
			try {
				RMIServer remoteObj = new RMIServer();
				RMIInterface stub = (RMIInterface) UnicastRemoteObject.exportObject(remoteObj, 0);

				Registry registry = LocateRegistry.getRegistry();
				registry.bind("RMIInterface", stub);

				System.err.println("Server start ....");
			} catch (Exception e) {
				System.err.println("Exception occur : " + e.toString());
			}
		}

			@Override
			public int remoteMethod(int x) throws RemoteException {
				// TODO Auto-generated method stub
				return 0;
			}
}
