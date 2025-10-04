package atividade1;
import java.util.Scanner;

public class atividadeUm {

    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("numero postivo");
        } else if (numero < 0){
            System.out.println("numero negativo");
        } else {
            System.out.println("numero é zero");
        }


    }
}