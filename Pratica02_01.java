
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_01
*Descrição: 1. Faça um programa que leia dois números A e B e imprima o maior 
deles.
* Data: 08/04/2023
*/
import java.util.Scanner;

public class Pratica02_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = sc.nextInt();
        System.out.println("Digite mais um número: ");
        int B = sc.nextInt();

        if (A > B) {
            System.out.printf("O número %d é maior.", A);
        } else if (B > A) {
            System.out.printf("O número %d é maior.", B);
        } else {
            System.out.printf("Os números %d e %d são iguais.", A, B);
        }

    }
}
