import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
/** A java based progam that gives a quasi AI feel by assesing a user's interaction with a loved one who has passed. */
public class Driver{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);		//Scanner ot read input
		String userIn = "";			//Holding the user's input
		ArrayList<Users> users = new ArrayList<>();		//ArrayList to be filled with the different user objects
		FileWriter write =  new FileWriter();
		while(!userIn.equalsIgnoreCase("Good bye"){		//Making sure the user still wants to "talk"
			Users user = new Users();		//Crearing a new instance of the User class which stores the basic information and thoughts of the different people
			Dead dead = new Dead();			//Creating a new instance of the dead class which stores the people who are dead. 
			System.out.print("Hey, who are you?	");		//Asking the user what their name is to be stored in the User class
			userIn = scan.nextLine();		//Storing the person's full name
			for(int cntr = 0; cntr < people.size(); cntr ++){	//Check if the person has already used the program by checking their name against the list of people who have
				if(userIn.equalsIgnoreCase(people.get(cntr))){	//Checking to make sure if the name is there.
					System.out.println("Oh hey " + userIn + "! How are things going?");		//Printing the greeting
					userIn = scan.nextLine());		//Grabbing the next input
					people.get(cntr).setThoughts(userIn);
					//Access this user's object and resaves their thoughts, reranks, and reprints the death notification to adjust for an possilbe changes. 
				}
			}
			user.setName(userIn);		//adding the user's name to  the user class
			dead.addRelative(userIn);	//Adding the user's name to the relative's arrayList in the dead's class
			else{
				System.out.print("How old are you?	");	//Prompting the user for their age
				userIn = scan.nextLine();		//Grabbing the user's name to be stored in the user class
				user.setAge(userIn);		//Setting the user's age in the class
				System.out.print("Who died?		");		//Asking who died to the person
				dead.setName(scan.nextLine());		//Getting ther dead person's name
				System.out.println("How old were they?	");	//Asking their age
				dead.setAge(scan.nextInt());
				System.out.println("When were they born?	");	//
				System.err.println("	*****Enter in a 'YYYY MM DD' leaving spaces between each one*****");	//Giving specific directions on how to input their  birth
				dead.setYear(scan.next());
				dead.setAge(scan.nextLine());
				System.out.println("Oh. They were ")	//Given the deads age determines how old they were and if they were considered, "young" or "old"
				System.err.print("	*****just enter some thoughts, be as descriptive as possible!*****");
				userIn = scan.nextLine();
			}
		}
	}
}