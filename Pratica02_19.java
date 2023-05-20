
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_19

*Descrição: Um determinado gás duplica seu volume a cada segundo. 
Dada um volume inicial, em centímetros cúbicos, digitado pelo 
usuário faça um programa que determine o tempo necessário para 
que esse volume se torne maior que 1000 centímetros cúbicos. 
(utilize while)


* Data: 09/04/2023
*/
import java.util.Scanner;

public class Pratica02_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o volume do GÁS: ");
        double volumeInicial = sc.nextDouble();
        int tempoEstimado = duplicador(volumeInicial);
        sc.close();
        System.out.print("O Tempo estimado foi: " + tempoEstimado + " segundos");

    }

    private static int duplicador(double volume) {
        int tempo;

        int i = 0;
        while (volume < 1001) {
            volume = volume * 2;
            i = i + 1;
        }
        tempo = i;
        return tempo;

    }

}
