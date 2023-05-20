/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_11

*Descrição: Faça um programa que imprima todos os números pares de 1 
a 100 na ordem inversa

* Data: 09/04/2023
*/

public class Pratica02_11 {
    public static void main(String[] args) {
        int n = 100;

        while (n % 2 == 0 && n <= 100 && n > 0) {
            System.out.print(n + " ");
            n = n - 2;
        }
    }

}
