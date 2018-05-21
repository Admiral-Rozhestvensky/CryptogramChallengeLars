import java.util.ArrayList;
import java.util.Scanner;

public class TypicalSolver {

	public static void main(String args[]) {
		WordData Data = new WordData();
		Scanner in = new Scanner(System.in);
	    System.out.println("enter number of lines: ");
	    int lines = in.nextInt();
	    System.out.println("Enter entire crytogram: ");
	    String whole = "";
	    in.close();
	    for (int num = 0; num <= lines; num++) {
	    	whole += in.nextLine() + " ";
	    }
	    ArrayList<String> big = new ArrayList<String>();
	    String tempIn = "";
	    for (int c = 0; c < whole.length(); c++) {
	    	if (whole.charAt(c) != ' ') {
	    		tempIn += whole.charAt(c);
	    	} else {
	    		big.add(tempIn);
	    		tempIn = "";
	    	}
	    }
	    
	    for (int c = 0; c < big.size(); c++) {
	    	Data.data(big.get(c));
	    }
	    
	    
	}
}
