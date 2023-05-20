/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_12

*Descrição: Faça um programa que exiba todos os números pares a 
partir de 0 até que encontre um múltiplo de 7 (utilize 
do/while)


* Data: 09/04/2023
*/

public class Pratica02_12 {
    public static void main(String[] args) {
        int n = 0;
        do {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }

            n = n + 1;
        } while (n % 7 != 0);
    }

}
