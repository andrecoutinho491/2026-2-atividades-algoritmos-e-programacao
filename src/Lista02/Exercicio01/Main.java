package Lista02.Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade em números:");
        idade = input.nextInt();

        if (idade <= 12) {
            System.out.print("Sua categoria de nadador é Infantil");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.print("Sua categoria de nadador é Juvenil");
        }
        else {
            System.out.print("Sua categoria de nadador é Adulto");
        }

    }
}