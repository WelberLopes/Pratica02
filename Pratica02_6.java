/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_05

*Descrição: Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100. As faixas da correlação são mostradas abaixo:

0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo 

* Data: 09/04/2023
*/

import java.util.Scanner;

public class Pratica02_6 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do Aluno a ser verificada: ");

        int nota = sc.nextInt();

        if (nota > 100 || nota < 0) {
            System.out.println("Digitação incorreta. o valor da nota deve estar entre 0 e 100.");
        } else if (nota <= 49) {
            System.out.printf("A Nota conceito do aluno %d é Insuficiente", nota);
        } else if (nota <= 64) {
            System.out.printf("A Nota conceito do aluno %d é Regular", nota);
        } else if (nota < 84) {
            System.out.printf("A Nota conceito do aluno %d é Bom", nota);
        } else {
            System.out.printf("A Nota conceito do aluno %d é Ótima", nota);
        }

    }
}
