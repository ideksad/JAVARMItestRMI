import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class RMIClient {
	public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException{
		RMIinterface obj = (RMIinterface)Naming.lookup("//localhost/RMIServer");
		try{
			//System.out.println('\n'+"Client call to : "+obj+'\n');
			int Month = Integer.parseInt(args[0]);
			String myMsg = obj.showDayOfMonth(Month);
			System.out.println(myMsg);
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			//System.out.println('\n'+"Client call to : "+obj+'\n');
			int Day = Integer.parseInt(args[1]);
			String myMsg1 = obj.showColourOfDay(Day);
			System.out.println(myMsg1);
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			//System.out.println('\n'+"Client call to : "+obj+'\n');
			int Day = Integer.parseInt(args[2]);
			String myMsg2 = obj.showHolidayOfMonth(Day);
			System.out.println(myMsg2);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
