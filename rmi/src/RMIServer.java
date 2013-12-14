import java.rmi.Naming;


public class RMIServer {
	public static void main(String args[]){
		try{
			RMIinterface obj = new RMIinterfaceImpl();
			Naming.rebind("//localhost:1099/RMISrever",obj);
			System.out.println("Waiting clinent...");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
