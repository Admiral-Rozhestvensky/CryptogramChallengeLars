import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordData {
	public File file = new File("words.txt");
	public Scanner inFile;
	public ArrayList<String> wordList = new ArrayList<String>();
	public ArrayList<Integer> asciiList = new ArrayList<Integer>();
	public int length;
	public String word;
	
	public WordData() {
		try {
			inFile = new Scanner(file);
		} catch (Exception E) {
			System.out.println("yadunfukedupm88888");
		}
		while (inFile.hasNext()) {
			wordList.add(inFile.next());
		}
		for (int c = 0; c < wordList.size(); c++) {
			length = wordList.get(c).length();
			for(int count = 0; count < length; count++) {
				asciiList.add((wordList.get(c).charAt(count)-'A') % 26);
			}
		}
	}
	
	public void data(String word) {
		this.word = word;
	}
}
