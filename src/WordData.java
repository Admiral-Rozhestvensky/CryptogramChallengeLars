import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordData {
	public File file = new File("wordlist.txt");
	public Scanner inFile;
	public ArrayList<String> wordList = new ArrayList<String>();
	public ArrayList<String> lengthList = new ArrayList<String>();
	public int length;
	public String word;
	public String tempAdd;
	public Similar checker;
	
	public WordData() {
		try {
			inFile = new Scanner(file);
		} catch (Exception E) {
			System.out.println("Stop it. Git some help.");
		}
		while (inFile.hasNext()) {
			wordList.add(inFile.next());
		}
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
		checker = new Similar(this.word, lengthList);
		checker.Output();
		System.out.println(checker.output.toString());
	}
	
	public int dif(String a) {		//not currently in use
		return ((a.charAt(1) - 'A') % 26) - ((a.charAt(0) - 'A') % 26);
	}
	
}
