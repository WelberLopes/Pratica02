/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_18

*Descrição: Faça um programa que determine o fatorial de um número. 
Para este problema, tem-se como entrada o valor do número do 
qual se deseja calcular o fatorial. O fatorial de 0 é igual a 
1. O fatorial de um número N (N!) é definido conforme a seguir 
(utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

* Data: 09/04/2023
*/

import java.util.Scanner;

public class Pratica02_18 {
    public static void main(String[] args) {
        int i;
        int fatorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para verificar o fatorial: ");
        int numero = sc.nextInt();
        sc.close();

        for (i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
    }
}
