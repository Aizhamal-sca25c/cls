import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }

        System.out.println("Consonants = "+ count);
    }
}