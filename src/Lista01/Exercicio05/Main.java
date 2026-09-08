package Lista01.Exercicio05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        IO.println("Digite seu peso em kg: ");
        double peso = input.nextDouble();

        double imc = peso / (altura * altura);

        IO.println("O valor do seu IMC é: " + imc);

    }
}