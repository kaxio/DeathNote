import java.util.ArrayList;
// Class used to store each user's information to be used in outputting the death letter. 

public class Users{
	private String name = "";		//Holds the user's name for adressing the "death letter"
	private String age = "";		//Holds the user age to help determine death note.
	private int relationship = 0; 	//Storing the relationship on a scale of 1-5, 1 being the worst, 5 being the best.
	private String thoughts = "";
	//Constructor that makes an empty copy of the class
	public Users(){
		name = "";
		age = "";
		relationship = -1;
	}
	//If you have the user's name, age, relationship, and thoughts if you have them saved.
	public Users(String name, String age, int relationship, String thoughts){
		this.name = name;
		this.age = age;
		this.relationship = relationship;
		this.thoughts = thoughts;
	}
	//getting the user's name
	public String getName(){
		return name;
	}
	//getting the user's age.
	public String getAge(){
		return age;
	}
	//getting the user's relationship level
	public int getRelationship(){
		return relationship;
	}
	//Setting the user's name
	public void setName(String name){
		this.name  = name;
	}
	//setting the user's age
	public void setAge(String age){
		this.age = age;
	}
	//setting the user's relationship status
	public void setRelationship(int relationship){
		this.relationship = relationship;
	}
	//setting the user's paragraph on their thoughts.
	public void setThoughts(Strin thoughts){
		this.thoughts = thoughts;
	}
}