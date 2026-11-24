// convert all characters in a string to uppercase.

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int count = 0;

        for(int i=0; i<text.length(); i++){
            char c = Character.toLowerCase(text.charAt(i));


        }
        System.out.println(count);
    }
}
