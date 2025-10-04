package atividade2;

import java.util.Scanner;

public class atividadeDois {
    public static void main(String[] args) {

        int numeros = 0;
        int par = 0;
        int impar = 0;
        int resto = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite 10 numeros.");
        for (int i = 0; i <= 9 ; i++){
            System.out.println("digite o proximo numero: ");
            numeros = scanner.nextInt();
            resto = numeros % 2;
            if (resto >= 1){
                impar = impar + numeros;
            }else {
                par = par + numeros;
            }
        }
        System.out.println("Somandos os numeros impares temos: " + impar);
        System.out.println("Somandos os numeros pares temos: " + par);
    }

}