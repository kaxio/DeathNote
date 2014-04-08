import java.util.ArrayList;
import java.util.Calendar;
import java.util.SimpleDateFormat;
private class Dead{
	private int age = -1;		//Holding the dead's age of when they passed
	private String name = "";	//Holding their name
	private String birthDate = "";	//holding their birthdate
	private String deathDate = "";	//holding their deathDate
	private int year = 0;
	private ArrayList<String> relatives = new ArrayList<>();	//holding the names of those related to them
	private Calendar cal = new Calendar();
	//Starting an empty verison of the list of dead people
	public Dead(){
		this.age = 0;
		this.name = "";
		this.birthDate = "";
		this.deathDate = "";
	}
	//Starting a verison of dead where the user has passed all the information in
	public Dead(int age, String name, String birthDate, String deathDate){
		this.age = 0;
		this.name = "";
		this.birthDate = "";
		this.deathDate = "";
	}
	//Storing the dead person's age
	public void setAge(int age){
		String hold = (String)year;
		this.age = hold + " " + age;
	}
	//holds the user's year for comparison purposes
	public void setYear(int year){
		this.year = year;
	}
	//Storing the dead person's name
	public void setName(String name){
		this.name = name;
	}
	//Setting the dead persons birthday
	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}
	//setting the date of the person's death
	public void setDeathDate(String deathDate){
		this.deathDate = deathDate;
	}
	//adding people to the list of related people to the deceased
	public void addRelative(String relative){
		relatives.add(relative);
	}
	//returning the list of the peron's relatives
	public ArrayList getRelatives(){
		return relatives;
	}
	//getting the dead person's age
	public int getAge(int age){
		return age;
	}
	//returning the person's name
	public String getName(String name){
		return name;
	}
	//returning the person's birthday
	public String getBirthDate(String birthDate){
		return birthDate;
	}
	//returning the person's death date
	public String getDeathDate(String deathDate){
		return deathDate;
	}
	public String yearGuess(){
		return cal.getYear() - year
	}
}