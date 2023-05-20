
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_03

*Descrição:Elabore um programa que lê dois valores A e B e os escreve com 
a mensagem: “São múltiplos” ou “Não são múltiplos”.

* Data: 09/04/2023
*/

import java.util.Scanner;

public class Pratica02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número a ser verificado: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número a ser verificado: ");
        int y = sc.nextInt();
        sc.close();

        if (x % y == 0 || y % x == 0) {
            System.out.printf("Os números %d e %d são múltiplos.", x, y);
        } else {
            System.out.printf("%d e %d não são múltiplos.", x, y);
        }

    }

}
