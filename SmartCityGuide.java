import java.util.Scanner;
class Booking{
	String path;
	String vehical_name;
	int ticket_price;
	void booking(String patha,String vehical_namea){
		vehical_name = vehical_namea;
		System.out.println("Proedure to Book "+vehical_name+" ticket");
		path = patha;
		ticket_price = vehical_namea=="bus"?300:vehical_namea=="metro"?250:vehical_namea=="flight"?5500:0;
	}
	void ticketBook(){
		System.out.println("\n========Ticket Porta========");
		String name = null;
		boolean b = false;
		while(true){
			System.out.print("Enter Name:- ");
			name = new Scanner(System.in).next().toLowerCase();
			for(int i=0; i<name.length(); i++){
				if(name.charAt(i)>=97 && name.charAt(i)<=122){
					b = true;
				}
				else{
					b = false;
					System.out.println("Name Must Be in String!!!");
					break;
				}
			}
			if(b){
				break;
			}
		}
		int age = 5;
		while(true){
			System.out.print("Enter Age:- ");
			String ageInput = new Scanner(System.in).nextLine().trim();
			if(ageInput.isEmpty()){
				System.out.println("Age must be integer");
				continue;
			}
			try{
				age = Integer.parseInt(ageInput);
				if(age>=5 && age<=100){
					break;
				}else{
					System.out.println("Age Must Be b/w 5-100!!!");
				}
			}catch(NumberFormatException ex){
				System.out.println("Age must be integer");
			}
		}
		System.out.println("Printing Your Details:---");
		System.out.println("\s\sName:- "+name);
		System.out.println("\s\sAge:- "+age);
		System.out.println("\s\sVehical-Name:- "+vehical_name);
		System.out.println("\s\sPath:- "+path);
		System.out.println("\s\sPrice:- "+ticket_price);
		System.out.println("==============================\n");
	}
}
class SmartCityGuid extends Booking{
	static void emergencyServices(){
		System.out.println("\n========Emergency Service========");
		System.out.println("\sMedical Emergency no.:- 108");
		System.out.println("\sAccedent Emergency no.:- 101");
		System.out.println("\sAhmedabad Police no.:- 100");
		System.out.println("\sWomen's HelpLine no.:- 100");
		System.out.println("===================================\n");
	}
	static void touristSport(){
		System.out.println("\n========Toure Ahmedabed========");
		System.out.println("\sPlace:Kankariya, Location:Maninagar, Time:9Am-10Pm");
		System.out.println("\sPlace:Sabarmati Ashram, Location:Sabarmati river, Time:8:30Am-6:00Pm");
		System.out.println("\sPlace:Science City, Location:Bhadaj Circle, Time:10Am-8Pm");
		System.out.println("\sPlace:Adalaj StepWell, Location:Adalaj, Time:8Am-6Pm");
		System.out.println("==================================\n");
	}
	static void trafficUpdate(){
		System.out.println("\n========Traffic Update========");
		System.out.println("\sPlace:Karnavati, \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
		System.out.println("\sPlace:GotaBridge, \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
		System.out.println("\sPlace:Vandematram, \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
		System.out.println("\sPlace:Vastral, \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
		System.out.println("\sPlace:Sabarmati(River-Front), \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm/s6:00Pm-9:30Pm");
		System.out.println("\sPlace:Vatva, \sCommon High-Jam-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
		System.out.println("=================================\n");
	}
	static void wastManagement(){
		System.out.println("\n========Common Wast-Management Scedual========");
		System.out.println("\sMonday: Residental Wast-Collection");
		System.out.println("\sWednesday: Recycling Pick-Up");
		System.out.println("\sFriday: Local Wast-Collection");
		System.out.println("\sSaturday: Street Wast-Collection");
		System.out.println("\sSunday: Residental Wast-Collection");
		System.out.println("================================================\n");
	}
	static void localEvent(){
		System.out.println("\n========Local Event In Ahmedabad========");
		System.out.println("\s***I will edit updated event later on");
		System.out.println("\sEvent-Name:Aditya Gadhvi Consert, Date:sat 22Mar25 7:00Pm, Place:Savanna Party Lawn, Ticket-Prices:1499");
		System.out.println("\sEvent-Name:The Lavari Show, Date:21Fri25, Place:HK Hall, Ticket-Prices:799");
		System.out.println("\sEvent-Name:Manhar Udhas Live, Date:23Feb25 10:00Am, Place:Thakor Desai Hall, Ticket-Prices:300");
		System.out.println("\sEvent-Name:Ravi Gupta Stand-up, Date:8Mar25 4:00Pm, Place:HK law, Ticket-Prices:500");
		System.out.println("\sEvent-Name:Soun Nigham Consert, Date:29Mar25 9:00Pm, Place:Desai Hall, Ticket-Prices:1500");
		System.out.println("\sEvent-Name:Chal Man Vrindavan Consert, Date:16Feb25 10:00Am, Place:Gift City, Ticket-Prices:550");
		System.out.println("===========================================\n");
	}
	static boolean transportService(){
		boolean b = false;
		
		while(true){
			System.out.println("\n========Ahmedabad Transport Service========");
			System.out.println("1. To View Bus Transport.");
			System.out.println("2. To View Metro Transport.");
			System.out.println("3. To View Airline Transport.");
			System.out.println("4. To Exit.");
			System.out.print("Enter Your Choice For Transport Services:- ");
			String ch = new Scanner(System.in).next();
			switch(ch){
				case "1":
				System.out.println("\n\s\sWelcome Ahmedabad Metro Transport!");
				System.out.println("\s\s1.To Ghi Kata");
				System.out.println("\s\s2.To Kakriya");
				System.out.println("\s\s3.To Kalupur");
				System.out.println("\s\s4.To Rabari Colony");
				System.out.print("\s\sEnter your choice For Bus Facility:- ");
				String chm = new Scanner(System.in).next();
				switch(chm){
					case "1":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "2":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "3":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "4":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					default:
					System.out.println("\s\s\sEnter valid choice!!!");
				}
				break;
				case "2":
				System.out.println("\n\s\sWelcome Ahmedabad Metro Transport!");
				System.out.println("\s\s1.To Ghi Kata");
				System.out.println("\s\s2.To Kakriya");
				System.out.println("\s\s3.To Kalupur");
				System.out.println("\s\s4.To Rabari Colony");
				System.out.print("\s\sEnter your choice For Metro Facility:- ");
				String chx = new Scanner(System.in).next();
				switch(chx){
					case "1":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "2":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "3":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					case "4":
					System.out.println("\s\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
					break;
					default:
					System.out.println("\s\s\sEnter valid choice!!!");
				}
				break;
				case "3":
				System.out.println("\s\sWelcome Ahmedabad Airline Transport!");
				System.out.println("\s\sRoute:Karnavati,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
				System.out.println("\s\s\sRoute:GotaBridge,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
				System.out.println("\s\s\sRoute:Vandematram,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
				System.out.println("\s\s\sRoute:Vastral,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
				System.out.println("\s\s\sRoute:Sabarmati(River-Front),\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm/s6:00Pm-9:30Pm");
				System.out.println("\s\s\sRoute:Vatva,\sRoute-Time: 8:00Am-10:30Am,\s12:30pm-2:00pm,\s6:00Pm-9:30Pm");
				break;
				case "4":
				b = true;
				break;
				default:
				System.out.println("enter valid choice!!!");
			}
			if(b){
				break;
			}
		}
		System.out.print("Do You Want To Book Your Ticket(y/n)? :- ");
		String ans = new Scanner(System.in).next();
		if(ans.equals("y")){
			return true;
		}
		else{
			return false;
		}			
	}
	static boolean ahmedabadDarshan(){
		System.out.println("\n========Welcome To Ahmedabad Darshan========");
		System.out.println("\sPlace:Kankariya, Location:Maninagar, Time-Given:3hr:- ");
		System.out.println("\sPlace:Sabarmati Ashram, Location:Sabarmati river, Time-Given:1hr");
		System.out.println("\sPlace:Science City, Location:Bhadaj Circle, Time-Given:4-5hr");
		System.out.println("\sPace:Adalaj StepWell, Location:Adalaj, Time-Given:1hr");
		System.out.print("Due You Want To Book(y/n):- ");
		String ans = new Scanner(System.in).next();
		if(ans.equals("y")){
			return true;
		}
		else{
			return false;
		}
	}
	static void stayingOptions(){
		boolean b = false;
		System.out.println("\n========Staying Servise========");
		while(true){
			System.out.println("1. To View for Hotel.");
			System.out.println("2. To View for Rent-House.");
			System.out.println("3. Exit.");
			System.out.print("Enter your choice For Staying Service:- ");
			String sch = new Scanner(System.in).next();
			switch(sch){
				case "1":
				System.out.println("\s===Hotel===");
				System.out.println("\s\sLocation:Gota, Charges:1500/day, Rating:2.5");
				System.out.println("\s\sLocation:Vandematram, Charges:2000/day, Rating:3");
				System.out.println("\s\sLocation:Nehrunagar, Charges:3500/day, Rating:4");
				System.out.println("\s\sLocation:Vastral, Charges:1000/day, Rating:2");
				System.out.println("\s\sLocation:Odhav, Charges:2500/day, Rating:3.5");
				System.out.println("\s\sLocation:Iskon, Charges:4000/day, Rating:4.5");
				break;
				case "2":
				System.out.println("\s===Rent===");
				System.out.println("\s\sLocation:Vandematram Arcard Elites, Approx-Rent:10000/month, Max-Person:4");
				System.out.println("\s\sLocation:Center Point Arcred, Approx-Rent:7000/month, Max-Person:2");
				System.out.println("\s\sLocation:Godhrage Elites, Approx-Rent:6000/month, Max-Person:5");
				System.out.println("\s\sLocation:Rambaug Jaynagar, Approx-Rent:4000/month, Max-Person:7");
				System.out.println("\s\sLocation:Gota Aditya Parivesh, Approx-Rent:9500/month, Max-Person:6");
				System.out.println("\s\sLocation:Vastral Bansidhar, Approx-Rent:7500/month, Max-Person:5");
				break;
				case "3":
				b = true;
				break;
				default:
				System.out.println("Enter Vaild Choice!!!");
			}
			if(b){
				System.out.println();
				break;
			}
		}
	}
	static void cityInfo(){
		System.out.println("\n========All About Ahmedabad City========");
		System.out.println("\sThe Ahmedabad:- ");
		System.out.println("\sAhmedabad, the largest city in Gujarat, India, is a major cultural, economic, and historical hub.\nFounded in 1411 by Sultan Ahmed Shah, it is known for its rich heritage, vibrant street food, and thriving textile industry.\nThe Sabarmati River runs through the city, with landmarks like the Sabarmati Ashram (associated with Mahatma Gandhi) and the modern Sabarmati Riverfront.\nAhmedabad is also a UNESCO World Heritage City, famous for its Indo-Islamic architecture, including the Jama Masjid, Sidi Saiyyed Mosque, and the pols (traditional housing clusters).\n It is home to prestigious institutions like the Indian Institute of Management (IIM-A) and a booming industrial sector.");
		System.out.println("==========================================/s");
	}
	static void feedBack(){
		System.out.print("Please enter your Feed-Back:- ");
		String feed = new Scanner(System.in).next();
		System.out.println("\n===THANKS FOR YOUR FEED BACK===\n");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("			===Wlecome To SmartCityGuid===			");
		boolean b = false;
		while(true){
			System.out.println("\n1. To View Tourist Spot.");
			System.out.println("2. To Ahmedabad Darshan.");
			System.out.println("3. To View Ahmedabad Emergency Service.");
			System.out.println("4. To View Traffic Area.");
			System.out.println("5. To View Wast Mangement Scedual.");
			System.out.println("6. To View/Book Transport Service.");
			System.out.println("7. To View New Local Event.");
			System.out.println("8. To give Feed-Back.");
			System.out.println("9. To Show Ahmedabad Information.");
			System.out.println("10.To View Staying-Facility.");
			System.out.println("11. To Exit.");
			System.out.print("Enter Your Choice:- ");
			String choice = sc.next();
			switch(choice){
				case "1":
				SmartCityGuid.touristSport();
				break;
				case "2":
				if(SmartCityGuid.ahmedabadDarshan()==true){
					SmartCityGuid scg = new SmartCityGuid();
					scg.booking("ahmedabadDarshan","bus");
					scg.ticketBook();
				}
				else{
					System.out.println("==Thanks For Using Our Transoprt Portal==");
				}
				break;
				case "3":
				SmartCityGuid.emergencyServices();
				break;
				case "4":
				SmartCityGuid.trafficUpdate();
				break;
				case "5":
				SmartCityGuid.wastManagement();
				break;
				case "6":
				if(SmartCityGuid.transportService() == true){
					SmartCityGuid scg = new SmartCityGuid();
					System.out.print("Enter Your Destination:- ");
					String place_name = sc.next().toLowerCase();
					System.out.print("Enter Your Way To Travel (bus/metro/flight):- ");
					String tn = sc.next().toLowerCase();
					String travel_name = null;
					if(tn.equals("bus")) {
						travel_name = "bus";
					}
					else if(tn.equals("metro")){
						travel_name = "metro";
					}
					else if (tn.equals("flight")){
						travel_name = "flight";
					}
					else{
						System.out.println("Invalid mode of travel entered.\n");
						break;
					}
					scg.booking(place_name, travel_name);
					scg.ticketBook();
				}
				else{
					System.out.println("==Thanks For Using Our Transoprt Portal==");
				}
				break;
				case "7":
				SmartCityGuid.localEvent();
				break;
				case "8":
				SmartCityGuid.feedBack();
				break;
				case "9":
				SmartCityGuid.cityInfo();
				break;
				case "10":
				SmartCityGuid.stayingOptions();
				case "11":
				b = true;
				break;
				default:
				System.out.println("Enter Valid Choice!!!");
			}
			if(b){
				System.out.println("\n~~~Thanks~~~");
				break;
			}
		}
	}
}