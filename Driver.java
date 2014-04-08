import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
/** A java based progam that gives a quasi AI feel by assesing a user's interaction with a loved one who has passed. */
public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String userIn = "";
		ArrayList<Users> users = new ArrayList<>();
		String input = "";
		while(!input.equalsIgnoreCase("Good bye"){
			Users user = new Users();
			Dead dead = new Dead();
			System.out.print("Hey, who are you?	");
			userIn = scan.nextLine();
			for(int cntr = 0; cntr < people.size(); cntr ++){	//Check if the person has already used the program by checking their name against the list of people who have
				if(userIn.equalsIgnoreCase(people.get(cntr))){
					System.out.println("Oh hey " + userIn + "! How are things going?");
					userIn = scan.nextLine())
					//Access this user's object and resaves their thoughts, reranks, and reprints the death notification to adjust for an possilbe changes. 
				}
			}
			user.setName(userIn);
			dead.addRelative(userIn);
			else{
				System.out.print("How old are you?	");
				userIn.scan.nextLine();
				user.setAge(userIn);
				System.out.print("Who died?");
				dead.setName(scan.nextLine());
				System.out.println("How old were they?	");
				System.err.println("	*****Enter in a 'YYYY MM DD' leaving spaces between each one*****")
				dead.setYear(scan.next());
				dead.setAge(scan.nextLine());
				System.out.println("")
				System.err.print("	just enter some thoughts, be as descriptive as possible!");
				userIn = scan.nextLine();
			}
		}
	}
}