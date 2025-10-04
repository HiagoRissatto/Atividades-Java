package atividade5;

import java.util.Random;
import java.util.Scanner;

public class atividadeCinco {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int escondido = random.nextInt(100) + 1;
        int numTentativas = 0;
        int chute;
        boolean correto = false;

        System.out.println("tente acertar o numero escondido entre 1 e 100, você tem 3 tentativas.");

        do {
            System.out.println("Digite seu chute: ");
            chute = scanner.nextInt();
            numTentativas++;

            if (chute == escondido){
                System.out.println("numero necessario pra acertar " + numTentativas + " chutes." );
                correto = true;
            } else if ( chute < escondido) {
                System.out.println("numero maior");

            } else {
                System.out.println("numero menor");
            }
        } while (numTentativas < 3 && !correto);
        if (!correto){
            System.out.println("fim do teste, o numero correto era " + escondido);
        }
    }
}
