package Lista01.Exercicio06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Digite o salário atual: R$ ");
        double salario = input.nextDouble();

        IO.println("Digite a porcentagem de aumento: ");
        double porcentagem = input.nextDouble();

        double aumento = salario * porcentagem / 100;
        double novoSalario = salario + aumento;

        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

    }
}