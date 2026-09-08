package Lista01.Exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Digite sua idade em anos: ");
        int idade = input.nextInt();

        int meses = idade * 12;

        IO.println("Sua idade em meses é: " + meses);

    }
}