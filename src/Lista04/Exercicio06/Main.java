package Lista04.Exercicio06;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numerosErrados = new ArrayList<>();
        int numeroSecreto = 42;
        int numero = 0;
        int tentativas = 1;
        int contador = 1;

        do{
            System.out.println("Digite um número de dois algarismos até você acertar:");
            numero = input.nextInt();
            if (numero != 67){
                numerosErrados.add(numero);
                tentativas++;
            }
        }while(numero != 67);

        System.out.println("-------------------------");
        System.out.println("Parabéns, você adivinhou! O número secreto é 67!");
        System.out.println("Tentativas: " + tentativas);

        System.out.println("-------------------------");
        System.out.println("Palpites:");

        for(int print : numerosErrados){
            System.out.println(contador + ") " + print);
            contador++;
        }

        System.out.println(contador + ") " + 67);

    }

}
