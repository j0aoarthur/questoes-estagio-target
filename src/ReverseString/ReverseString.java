package src.ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que deseja inverter: ");
        String string = scanner.next();

        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
