import java.rmi.Naming;


public class RMIServer {
	public static void main(String args[]){
		try{
			RMIinterface obj = new RMIinterfaceImpl();
			Naming.rebind("//localhost:1099/RMIServer",obj);
			System.out.println("Waiting client...");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
