package testRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
	public String showDayOfMonth(int x) throws RemoteException;
	public String showColourOfDay(int y) throws RemoteException;
	public String showHolidayOfMonth(int z) throws RemoteException;
}
