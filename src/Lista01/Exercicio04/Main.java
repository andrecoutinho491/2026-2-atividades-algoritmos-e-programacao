package Lista01.Exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Digite o valor do produto: ");

        double valor = input.nextDouble();

        double desconto = valor * 0.10;
        double precoFinal = valor - desconto;

        IO.println("Este é o valor com desconto: " + precoFinal);

    }
}
