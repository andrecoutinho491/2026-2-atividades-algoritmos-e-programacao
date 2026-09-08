package Lista02.Exercicio06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double codigo;
        int quantidade;
        double valorTotal;
        double valorDesconto;
        double valorFinal;

        System.out.println("Digite o código do produto:");
        codigo = input.nextDouble();

        System.out.println("Digite a quantidade de produtos:");
        quantidade = input.nextInt();

        if (codigo >= 1 && codigo <= 10) {

            valorTotal = quantidade * 10;

            if (valorTotal <= 250) {
                valorDesconto = valorTotal * 0.05;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$10,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 5%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else if (valorTotal >= 251 && valorTotal <= 500) {
                valorDesconto = valorTotal * 0.10;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$10,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 10%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else {
                valorDesconto = valorTotal * 0.15;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$10,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 15%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
        }

        else if (codigo >= 11 && codigo <= 20) {

            valorTotal = quantidade * 15;

            if (valorTotal <= 250) {
                valorDesconto = valorTotal * 0.05;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$15,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 5%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else if (valorTotal >= 251 && valorTotal <= 500) {
                valorDesconto = valorTotal * 0.10;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$15,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 10%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else {
                valorDesconto = valorTotal * 0.15;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$15,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 15%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
        }

        else if (codigo >= 21 && codigo <= 30) {

            valorTotal = quantidade * 20;

            if (valorTotal <= 250) {
                valorDesconto = valorTotal * 0.05;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$20,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 5%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else if (valorTotal >= 251 && valorTotal <= 500) {
                valorDesconto = valorTotal * 0.10;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$20,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 10%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else {
                valorDesconto = valorTotal * 0.15;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$20,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 15%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
        }

        else if (codigo >= 31 && codigo <= 40) {

            valorTotal = quantidade * 30;

            if (valorTotal <= 250) {
                valorDesconto = valorTotal * 0.05;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$30,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 5%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else if (valorTotal >= 251 && valorTotal <= 500) {
                valorDesconto = valorTotal * 0.10;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$30,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 10%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
            else {
                valorDesconto = valorTotal * 0.15;
                valorFinal = valorTotal - valorDesconto;

                System.out.println();
                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço do unitário produto: R$30,00");
                System.out.println("Quantidade de produtos: " + quantidade);
                System.out.println("Preço total da nota: " + valorTotal);
                System.out.println("Porcentagem do desconto: 15%");
                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço final: " + valorFinal);
            }
        }

        else {
            System.out.println("Código não encontrado");
        }

    }
}