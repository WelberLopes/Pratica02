/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_06

*Descrição: Faça um programa que preencha com zeros todas as posições 
de um vetor de tamanho 50

* Data: 09/04/2023
*/
public class Pratica02_14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        int i;

        for (i = 1; i < 50; i++) {
            vetor[i] = 0;
            System.out.print(vetor[i] + " ");

        }

    }
}
