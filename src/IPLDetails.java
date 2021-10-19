import java.util.*;
public class IPLDetails {
	public static String country="India";
	public String TeamName;
	public String PlayerName;
	public int age;
	public String PlayerProfile;
	public int experience;
	
	
	public void AssignPlayer1() {
		TeamName="Chennai Super King";
		PlayerName="M.S Dhoni";
		age=35;
		PlayerProfile="Batsman";
		experience=10;
	}
	public  void AssignPlayer2() {
		
	
		TeamName="Mumbai Indian";
		PlayerName="Rohit Sharma";
		age=32;
		PlayerProfile="Batsman";
		experience=7;
	}
	
	public  void AssignPlayer3() {
		TeamName="Royal Challenger Banglore";
		PlayerName="Virat Kholi";
		age=20;
		PlayerProfile="Batsman";
		experience=5;
		
	}
	public  void AssignPlayer4() {
		TeamName="Royal Challenger Banglore";
		PlayerName="Harbhajan Singh";
		age=44;
		PlayerProfile="Bowler";
		experience=10;
	}
	public  void Display() {
		
		System.out.println("Team Name is "+TeamName);
		System.out.println("Player Name is "+PlayerName);
		System.out.println("Player age is "+age);
		System.out.println("Player Profile is "+PlayerProfile);
		System.out.println("Player Experience is "+experience);
		System.out.println("Player Country is "+ country);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		IPLDetails ref=new IPLDetails();
		Scanner inp=new Scanner(System.in);
		System.out.println("Welcome to IPL detail program");
		System.out.println("Enter The Choice");
		
		System.out.println("1)M.S Dhoni");
		System.out.println("2)Rohit Sharma");
		System.out.println("3)Virat kholi");
		System.out.println("4)Harbhajan Singh");
		int choice=inp.nextInt();
		switch (choice) {
			case 1:
				ref.AssignPlayer1();
				break;
			case 2:
				ref.AssignPlayer2();
				break;
			case 3:
				ref.AssignPlayer3();
				break;
			case 4:
				ref.AssignPlayer4();
				break;
			default:
				System.out.println("Wrong choice");
				break;
				}
		ref.Display();
		System.out.println("=====================\nThanks for using our Software ");
		
		
		
	}

}
