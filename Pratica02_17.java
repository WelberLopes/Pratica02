/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_17

*Descrição: Faça um programa que imprima os múltiplos negativos de 7, 
superiores a -1000. (utilize do / while)

* Data: 09/04/2023
*/
public class Pratica02_17 {

    public static void main(String[] args) {
        int n = -1000;
        do {
            if (n % 7 == 0) {
                System.out.print(n + " ");
            }

            n = n + 1;
        } while (n < 0);
    }

}
