/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_21

*Descrição: Escreva um programa que, dado um número positivo digitado 
pelo o usuário mostre a tabuada de todos os números de 1 até o 
número digitado. (utilize for)

* Data: 09/04/2023
*/

import java.util.Scanner;

public class Pratica02_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("O número digitado não é positivo.");
        } else {
            for (int x = 1; x <= numero; x++) {
                System.out.println("Tabuada do " + x + ":");

                for (int y = 1; y <= 10; y++) {
                    int resultado = x * y;
                    System.out.println(x + " x " + y + " = " + resultado);
                }

                System.out.println();
            }
        }
    }
}
