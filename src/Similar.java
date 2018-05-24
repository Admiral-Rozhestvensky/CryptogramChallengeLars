import java.util.ArrayList;

public class Similar {
	public boolean same;
	public ArrayList<String> checklist = new ArrayList<String>();
	public ArrayList<String> output = new ArrayList<String>();
	public Duplicates checkWord;
	public Duplicates other;
	
	public Similar(String in, ArrayList<String> length) {
		checkWord = new Duplicates(in);
		other = new Duplicates(in); 		//make sure to reset this in the method body, else the words will be the same
		checklist.addAll(length);
	}
	
	public void Output() {
		checkWord.setDuplicates();
		for (int c = 0; c < checklist.size(); c++) {
			other.setWord(checklist.get(c));
			other.setDuplicates();
			if (checkWord.good(other)) {
				output.add(other.s);
			}
		}
	}
}
