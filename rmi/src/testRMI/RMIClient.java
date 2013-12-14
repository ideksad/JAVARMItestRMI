package testRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class RMIClient {

		public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
			RMIInterface obj = (RMIInterface)Naming.lookup("RMISrever");
			try {
				System.out.println('\n'+"Client call to : "+obj+'\n');
				int Month = Integer.parseInt(args[0]);
				int temp = obj.remoteMethod(Month);
				switch(Month){
				case 1:
		            System.out.println("\nMonth : January = 31 Day");
		            break;
		        case 2:
		            System.out.println("\nMonth : February = 28,29 Day");
		            break;
		        case 3:
		            System.out.println("\nMonth : March = 31 Day");
		            break;
		        case 4:
		            System.out.println("\nMonth :April = 30 Day");
		            break;
		        case 5:
		            System.out.println("\nMonth :May = 31 Day");
		            break;
		        case 6:
		            System.out.println("\nMonth :June = 30 Day");
		            break;
		        case 7:
		            System.out.println("\nMonth :July = 31 Day");
		            break;
		        case 8:
		            System.out.println("\nMonth :August = 31 Day");
		            break;
		        case 9:
		            System.out.println("\nMonth :September = 30 Day");
		            break;
		        case 10:
		            System.out.println("\nMonth :October = 31 Day");
		            break;
		        case 11:
		            System.out.println("\nMonth :November = 30 Day");
		            break;
		        case 12:
		            System.out.println("\nMonth :December = 31 Day");
		            break;
		        default:
		        	System.out.println("\nError Enter " + Month + " isn't Mouth");
				}
				//Registry registry = LocateRegistry.getRegistry();
				//RMIInterface stub = (RMIInterface) registry.lookup("RMIInterface");
				//String response = stub.remoteMethod();
				//System.out.println("response : " + response);
			} catch (Exception e) {
				System.err.println("Exception occur : " + e.toString());
			}
		}
}