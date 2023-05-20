/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_15

*Descrição: Faça um programa que preencha com zeros todas as posições 
de uma matriz com 10 linha e 10 colunas

* Data: 09/04/2023
*/
public class Pratica02_15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int i;
        int tamanho = 10;

        for (i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = 0;
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
}
