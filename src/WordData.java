import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordData {
	public File file = new File("wordlist.txt");
	public Scanner inFile;
	public ArrayList<String> wordList = new ArrayList<String>();
	//public ArrayList<String> asciiList = new ArrayList<String>();
	public ArrayList<String> lengthList = new ArrayList<String>();
	public ArrayList<String> sortedList = new ArrayList<String>();
	public int length;
	public String word;
	public String tempAdd;
	
	public WordData() {
		try {
			inFile = new Scanner(file);
		} catch (Exception E) {
			System.out.println("Stop it. Git some help.");
		}
		while (inFile.hasNext()) {
			wordList.add(inFile.next());
		}
		//for (int c = 0; c < wordList.size(); c++) {
			//length = wordList.get(c).length();
			//for(int count = 0; count < length; count++) {
				//tempAdd += (char) (wordList.get(c).charAt(count)-'A') % 26;
				//System.out.println(c);
			//}
			//asciiList.add(tempAdd);
		//}
	}
	
	public void data(String word) {
		this.word = word;
		System.out.println(this.word);
		for (int c = 0; c < wordList.size(); c++) {
			if (wordList.get(c).length() == word.length()) {
				lengthList.add(wordList.get(c));
			}
		}
		System.out.println(lengthList.toString());
		System.out.println(dif(this.word));
		for (int c = 0; c < lengthList.size(); c++) {
			if (dif(lengthList.get(c)) == dif(this.word)) {
				sortedList.add(lengthList.get(c));
			}
		}
		System.out.println(sortedList.toString());
	}
	
	public int dif(String a) {		//this is breaking
		return ((a.charAt(1) - 'A') % 26) - ((a.charAt(0) - 'A') % 26);
	}
}
