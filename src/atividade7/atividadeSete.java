package atividade7;

import java.util.Scanner;

public class atividadeSete {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("vamos ver se esta aprovado ou nao");
        System.out.println("digite sua primeira nota");
        int nota1 = scanner.nextInt();

        System.out.println("digite a segunda nota");
        int nota2 = scanner.nextInt();

        System.out.println("digite a terceira nota");
        int nota3 = scanner.nextInt();

        System.out.println("digite a quarta nota");
        int nota4 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.println("voce esta aprovado");
        } else {
            System.out.println("voce esta reprovado");
        }

    }
}
