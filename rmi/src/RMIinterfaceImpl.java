import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RMIinterfaceImpl extends UnicastRemoteObject implements RMIinterface {
	
	private static final long serialVersionUID = 1L;
	public RMIinterfaceImpl() throws RemoteException{
		
	}
	public int remoteMethod(int Month){
		try{
			int result = Month;
			return result;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return 0;
		}
	}
	//@Override
	//public String sayMonth(String msg){
	//	return "Month "+msg;
	//}
	
}
