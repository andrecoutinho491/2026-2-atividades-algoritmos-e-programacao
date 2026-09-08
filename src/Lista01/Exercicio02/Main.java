package Lista01.Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        IO.println("Digite o primeiro número: ");
        numero1 = input.nextInt();

        IO.println("Digite o segundo número: ");
        numero2 = input.nextInt();

        IO.println("Digite o terceiro número: ");
        numero3 = input.nextInt();

        int soma = numero1 + numero2 + numero3;
        double media = soma / 3.0;

        IO.println("A soma dos três numeros é: " + soma);
        IO.println("A média aritmética é: " + media);

    }
}