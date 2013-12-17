package testRMI;
	
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
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

			public String showDayOfMonth(int Month){
		           String msg;
			   try{
				if(Month==1){
			            msg = new String("\nMonth : January = 31 Day");
			            return msg;
				}
				else if(Month==2){
					msg = new String("\nMonth : February = 28,29 Day");
		            return msg;
				}
				else if(Month==3){
					msg = new String("\nMonth : March = 31 Day");
		            return msg;
				}
				else if(Month==4){
					msg = new String("\nMonth : April = 30 Day");
		            return msg;
				}
				else if(Month==5){
					msg = new String("\nMonth : May = 31 Day");
		            return msg;
				}
				else if(Month==6){
					msg = new String("\nMonth : June = 30 Day");
		            return msg;
				}
				else if(Month==7){
					msg = new String("\nMonth : July = 31 Day");
		            return msg;
				}
				else if(Month==8){
					msg = new String("\nMonth : August = 31 Day");
		            return msg;
				}
				else if(Month==9){
					msg = new String("\nMonth : September = 30 Day");
		            return msg;
				}
				else if(Month==10){
					msg = new String("\nMonth : October = 31 Day");
		            return msg;
				}
				else if(Month==11){
					msg = new String("\nMonth : November = 30 Day");
		            return msg;
				}
				else if(Month==12){
					msg = new String("\nMonth : December = 31 Day");
		            return msg;
				}
				else{
			            msg = new String("Error");
			            return msg;
				}
		               
				}catch(Exception e){
			            msg = new String("Error");
			            return msg;
				}
			}

			public String showColourOfDay(int Day){
				String msg1;
				try{
					if(Day==1){
						msg1 = new String("\nDay : Sanday = Red colour");
			            return msg1;
					}
					else if(Day==2){
						msg1 = new String("\nDay : Monday = Yellor colour");
			            return msg1;
					}
					else if(Day==3){
						msg1 = new String("\nDay : Tuesday = Pink colour");
			            return msg1;
					}
					else if(Day==4){
						msg1 = new String("\nDay : Wednesday = Green colour");
			            return msg1;
					}
					else if(Day==5){
						msg1 = new String("\nDay : Thursday = Orenge colour");
			            return msg1;
					}
					else if(Day==6){
						msg1 = new String("\nDay : Friday = Blue colour");
			            return msg1;
					}
					else if(Day==7){
						msg1 = new String("\nDay : Saturday = Violet colour");
			            return msg1;
					}
					else{
			            msg1 = new String("Error");
			            return msg1;
				}
				}catch(Exception e){
		            msg1 = new String("Error");
		            return msg1;
			}
			
		}

			public String showHolidayOfMonth(int Holiday){
				String msg2;
				try{
					if(Holiday==1){
						msg2 = new String("\nMonth : January = 1 1 Day");
					}
					else if(Holiday==2){
						msg2 = new String("\nMonth : February = 1 14 Day");
			            return msg2;
					}
					else if(Holiday==3){
						msg2 = new String("\nMonth : March = 0 Day");
			            return msg2;
					}
					else if(Holiday==4){
						msg2 = new String("\nMonth : April = 6 6,7,13,14,15,16 Day");
			            return msg2;
					}
					else if(Holiday==5){
						msg2 = new String("\nMonth : May = 3 1,5,13 Day");
			            return msg2;
					}
					else if(Holiday==6){
						msg2 = new String("\nMonth : June = 0 Day");
			            return msg2;
					}
					else if(Holiday==7){
						msg2 = new String("\nMonth : July = 4 1,11,12,14 Day");
			            return msg2;
					}
					else if(Holiday==8){
						msg2 = new String("\nMonth : August = 1 12 Day");
			            return msg2;
					}
					else if(Holiday==9){
						msg2 = new String("\nMonth : September = 0 Day");
			            return msg2;
					}
					else if(Holiday==10){
						msg2 = new String("\nMonth : October = 1 23 Day");
			            return msg2;
					}
					else if(Holiday==11){
						msg2 = new String("\nMonth : November = 0 Day");
			            return msg2;
					}
					else if(Holiday==12){
						msg2 = new String("\nMonth : December = 3 5,10,31 Day");
			            return msg2;
					}
					else{
			            msg2 = new String("Error");
			            return msg2;
				}
				}catch(Exception e){
		            msg2 = new String("Error");
		            return msg2;
			}
				return msg2;
			}
}
