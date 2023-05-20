
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_02
*Descrição: Construa um programa que receba como entrada três valores A, B 
e C e os imprima em ordem crescente.
* Data: 08/04/2023
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Pratica02_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int A = sc.nextInt();
        System.out.println("Digite um número: ");
        int B = sc.nextInt();
        System.out.println("Digite um número: ");
        int C = sc.nextInt();

        if (A < B && B < C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", A, B, C);// OK
        } else if (A > B && B > C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", C, B, A);// OK
        } else if (A < B && A > C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", C, A, B);
        } else if (A == B && B == C) {
            System.out.printf("A ordem crescente dos valores digitados não difere pois são iguais: %d, %d, %d", A, B,
                    C);
        } else if (A > B && B < C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", B, A, C);
        } else if (B > C && A < C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", A, C, B);
        } else if (A == B && C < A) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", C, A, B);
        } else if (A < B && C == B) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", A, B, C);
        } else if (A == C && B < A) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", B, A, C);
        } else if (B < A && A < C) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", B, A, C);
        } else if (A == B && C > A) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", A, B, C);
        } else if (A > B && C == B) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", B, C, A);
        } else if (A == C && B > A) {
            System.out.printf("A ordem crescente dos valores digitados são: %d, %d, %d", A, C, B);
        }
    }
}