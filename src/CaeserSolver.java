import java.util.ArrayList;
import java.util.Scanner;

public class CaeserSolver {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of lines: ");
        int lines = in.nextInt();
        System.out.println("Enter entire crytogram: ");
        String whole = "";
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

        String input = "";
        String output = "";
        for (int it = 1; it < 26; it++) {
            output = "";
            char c = ' ';
            int i;
            for (int co = 0; co < big.size(); co++) {
                input = big.get(co);
                for (int count = 0; count < input.length(); count++) {
                    c = input.charAt(count);
                    i = (int) c;
                    if (i >= 65 && i <= 90) {
                        c = (char) (((c - 'A' + it) % 26) + 'A');
                    }
                    output += c;
                }
                output += " ";
            }

            System.out.println(output + "\n");
        }
        in.close();
    }



}
