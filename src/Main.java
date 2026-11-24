//Write a program to count the number of words in a string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = text.split("\\s+");
            System.out.println("Words = " + words.length);
        }
    }
}



