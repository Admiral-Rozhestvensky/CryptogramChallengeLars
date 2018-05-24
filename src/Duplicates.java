
public class Duplicates {
	public boolean hasDuplicates;
	public int distance;
	public char letter;
	public String s;
	
	public Duplicates(String in) {
		hasDuplicates = false;
		distance = 1;
		letter = 'A';
		s = in;
	}
	
	public void setWord(String set) {
		s = set;
	}
	
	public void setDuplicates() {
		for (int c = 0; c < s.length() - 1; c++) {
			char step = s.charAt(c);
			for (int sub = c + 1; sub < s.length(); sub++) {
				if (step == s.charAt(sub)) {
					hasDuplicates = true;
					letter = step;
					distance = sub - c;
					System.out.println("word has duplicate letter: " + letter + ", duplicates are " + distance + " apart.");
				}
			}
		}
		System.out.println("duplicate search over");
	}
	
	public boolean good(Duplicates notThis) {
		if ((this.hasDuplicates && notThis.hasDuplicates) &&
		(notThis.distance == this.distance) && (notThis.letter == this.letter)) {
				return true;
		} else {
			return false;
		}
	}
	
}
