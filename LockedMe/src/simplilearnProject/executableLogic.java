package simplilearnProject;
import java.util.Scanner;
public class executableLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("");
		System.out.println("~ Welcome to LockedMe.com ~");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Developed by: Om Shankar Mishra");
		System.out.println("");
		System.out.println("Email Id: omshankar92229@gmail.com");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("");
		int ch,sbch;
		do {
			System.out.println("*********************************************");
			System.out.println("Main Menu");
			System.out.println();
			System.out.println("1. Retrieve file names in ascending order");
			System.out.println("2. Buisness-level operations (add, delete & search)");
			System.out.println("3. Exit application");
			System.out.println("*********************************************");
			System.out.println();
			System.out.println("Enter your choice: ");
			
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				buisnessLogic retfileobj = new buisnessLogic();
				retfileobj.sortFileNames();
			break;
			case 2:
				do {
					System.out.println("====================================");
				System.out.println("Buisness-level operations");
				System.out.println();
				System.out.println("1. Add a file to the existing directory list");
				System.out.println("2. Delete a file from the existing directory list");
				System.out.println("3. Search a file from the existing directory list");
				System.out.println("4. Return to main menu");
				System.out.println("5. Exit application");
				System.out.println("=======================================");
				System.out.println();
				System.out.println("ENTER YOUR CHOICE: ");
				
				sbch = sc.nextInt();
				switch(sbch){
				case 1:
					buisnessLogic addfileobj = new buisnessLogic();
					addfileobj.addFile();
					break;
				case 2:
					buisnessLogic delfileobj = new buisnessLogic();
					delfileobj.deleteFile();
					break;
				case 3:
					buisnessLogic serfileobj = new buisnessLogic();
					serfileobj.searchFile();
					break;
				case 4:
					System.out.println("Return to main menu");
					break;
				case 5:
					System.out.println("--Exiting program--");
					System.out.println("Thank you for using LockedMe!");
					System.exit(0);
					default:
						System.out.println("please enter valid choice: ");
						break;
				}		
				}
				while(sbch!=4);
				break;
			case 3:
				System.out.println("--Exiting program--");
				System.out.println("Thank you for using LockedMe!");
				System.exit(0);
				break;
				default:
					System.out.println("--Invalid choice--");
					System.out.println("Please enter a valid choice");
					break;
			}
			
		}
		while(ch!=3);	
	}
}