package atividade3;

import java.util.Scanner;

public class atividadeTres {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");

        int numero = scanner.nextInt();

        for (int i = 2; i<= numero; i++){
            boolean numeroPrimo = true;

            for (int n = 2; n < i; n++){
                if (i % n == 0){
                    numeroPrimo = false;
                    break;
                }
            }
            if(numeroPrimo){
                System.out.println("este é um numero primo: "+ i);
            }
        }

    }

}
