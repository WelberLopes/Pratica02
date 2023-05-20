/*Nome do Aluno:WELBER LOPES OLIVEIRA*RA:12723110547*Nome do Programa:Pratica02_04

*Descrição:Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.

*Data:09/04/2023
*/

import java.util.Scanner;

public class Pratica02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número a ser verificado: ");
        int X = sc.nextInt();
        sc.close();

        if (X % 2 == 0 && X > 0) {
            System.out.printf(" O número %d é par e positivo.", X);
        } else if (X % 2 == 0) {
            System.out.printf("O número %d é par e negativo.", X);
        } else if (X > 0) {
            System.out.printf("O número %d é impar e positivo.", X);
        } else {
            System.out.printf("O número %d é impar e negativo.", X);
        }
    }

}