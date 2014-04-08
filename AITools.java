import java.util.ArrayList;

public class AITools{
	private ArrayList<String> positiveAdjectives = new ArrayList<>();		//stroing positive adjectives
	private ArrayList<String> negativeAdjectives = new ArrayList<>();		//storing negative adjectives 
	private String deathLetter = "";	//the end user's output
	//private boolean emotion = false;		//if true then they were positive, if false then they were negative towards the person.
	public AITools(){
		adjectives.clear();
	}
	public ArrayList<String> findPostitiveAdjectives(){
		//compare user's input of paragraph to a sorted database of adjective and then storing it in the positive arrayList
	}
	public ArrayList<String> findNegativeAdjectivies(){
		//compare user's input of paragraph to a sorted database of adjectives ad then storing it in the negative arrayList
	}
	public int relationshipLevelNumber(){
		return Math.abs(positiveAdjectives.size() - negativeAdjectives.size() % 10);
	}
	
}