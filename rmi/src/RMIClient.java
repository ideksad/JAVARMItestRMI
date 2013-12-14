import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class RMIClient {
	public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException{
		RMIinterface obj = (RMIinterface)Naming.lookup("RMISrever");
		try{
			System.out.println('\n'+"Client call to : "+obj+'\n');
			int Month = Integer.parseInt(args[0]);
			int temp = obj.remoteMethod(Month);
			switch(Month){
			case 1:
	            System.out.println("\nMonth : January");
	            break;
	        case 2:
	            System.out.println("\nMonth : February");
	            break;
	        case 3:
	            System.out.println("\nMonth : March");
	            break;
	        case 4:
	            System.out.println("\nMonth :April");
	            break;
	        case 5:
	            System.out.println("\nMonth :May");
	            break;
	        case 6:
	            System.out.println("\nMonth :June");
	            break;
	        case 7:
	            System.out.println("\nMonth :July");
	            break;
	        case 8:
	            System.out.println("\nMonth :August");
	            break;
	        case 9:
	            System.out.println("\nMonth :September");
	            break;
	        case 10:
	            System.out.println("\nMonth :October");
	            break;
	        case 11:
	            System.out.println("\nMonth :November");
	            break;
	        case 12:
	            System.out.println("\nMonth :December");
	            break;
	        default:
	        	System.out.println("\nError Enter " + Month + " isn't Mouth");
			}
			//System.out.println("result :"+a+"+"+b+"="+temp);
			//System.out.println("\nError Enter " + Month + " isn't Mouth");
			//System.out.println("1 = January "+"\n"+"2 = February"+"\n"+"3 = March"+"\n");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
