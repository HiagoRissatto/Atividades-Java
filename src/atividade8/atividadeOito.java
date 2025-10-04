package atividade8;

import java.util.Scanner;

public class atividadeOito {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();
        int n1 = 0, n2 = 1;

        for (int i = 0; i < numero; i++){
            System.out.println(n1+" ");
            int soma = n1 + n2;

            n1 = n2;
            n2 = soma;
        }
    }
}
