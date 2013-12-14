package testRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
		//String remoteMethod() throws RemoteException;
		int remoteMethod(int x) throws RemoteException;
}
