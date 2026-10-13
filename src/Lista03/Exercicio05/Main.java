package Lista03.Exercicio05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int multipl = 1;

        System.out.println("Digite um número:");
        num = input.nextInt();

        for(int i = 10 ; i > 0 ; i--){
            System.out.println("Número " + num + " * " + multipl + " = " + num* multipl);
            multipl++;
        }

    }
}
