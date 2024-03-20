package src.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor que deseja se saber se está na sequencia de fibonacci: ");
        int valor_desejado = scanner.nextInt();

        int penultimo = 0;
        int ultimo = 1;
        while (ultimo < valor_desejado) {
            int temp = ultimo;
            ultimo += penultimo;
            penultimo = temp;

            if (valor_desejado == ultimo) {
                System.out.println("O número digitado pertence à sequência.");
                System.exit(0);
            }
        }
        System.out.println("O número digitado não pertence à sequência.");
    }
}
