/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_10

*Descrição: Faça um programa que imprima todos os números pares de 1 
a 100

* Data: 09/04/2023
*/
public class Pratica02_10 {
    public static void main(String[] args) {

        int n = 0;

        while (n % 2 == 0 && n <= 100) {
            System.out.print(n + " ");
            n = n + 2;
        }
    }

}
