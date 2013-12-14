import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RMIinterface extends Remote {
	public int remoteMethod(int x) throws RemoteException;
	//public String sayMonth(String msg) throws RemoteException;
}
