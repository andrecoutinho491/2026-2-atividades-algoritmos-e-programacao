package Lista01.Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Digite um número para saber o seu dobro: ");
        double numero = input.nextDouble();

        double dobro = numero * 2;

        IO.println("O dobro do seu número é:" + dobro);

    }
}