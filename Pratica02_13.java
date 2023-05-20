/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_13

*Descrição: Faça um programa que some os números de 1 a 100 e imprima 
somente o valor total da soma (utilize while).

* Data: 09/04/2023
*/

public class Pratica02_13 {
    public static void main(String[] args) {
        int n = 0;
        int soma = 0;

        while (n < 100) {
            n = n + 1;
            soma = soma + n;

        }
        System.out.println(soma);
    }

}
