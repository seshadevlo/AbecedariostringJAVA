package individual19modulo4;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print("Ingrese una palabra : ");
            inputString = scanner.nextLine().trim();
        } while (inputString.isEmpty());

        char[] charArray = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            charArray[i] = inputString.charAt(i);
        }

        int[] letterCount = new int[26]; 

        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                char lowercaseCh = Character.toLowerCase(ch);
                letterCount[lowercaseCh - 'a']++;
            }
        }

        System.out.println("Resultado:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = letterCount[ch - 'a'];
            System.out.println(ch + ": " + count);
        }
    }
}
