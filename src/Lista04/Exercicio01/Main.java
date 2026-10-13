package Lista04.Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;
        long fatorial = 1;

        System.out.println("Digite um número:");
        numero = input.nextInt();

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial: " + fatorial);

    }
}