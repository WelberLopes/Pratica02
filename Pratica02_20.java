
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_20

*Descrição: Escreva um programa que, dada a carga máxima de um 
elevador e a quantidade máxima de pessoas digitadas pelo 
usuário, leia o peso de cada pessoa, também digitada pelo 
usuário, que entra no elevador até que a carga máxima seja 
atingida ou o número máximo de pessoas seja atingido (utilize 
do /while).

* Data: 09/04/2023
*/
import java.util.Scanner;

public class Pratica02_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargaMaxima;
        int PesoPessoa;
        int pesoTotal = 0;
        int qtdMaxima;
        int lotação = 0;

        System.out.println("Digite a carga maxima do elevador: ");
        cargaMaxima = sc.nextInt();
        System.out.println("Digite a quantidade maxima de pessoas que podem entrar no elevador: ");
        qtdMaxima = sc.nextInt();

        while (pesoTotal < cargaMaxima && lotação < qtdMaxima) {
            System.out.println("Digite seu peso para entrar");
            PesoPessoa = sc.nextInt();
            pesoTotal = pesoTotal + PesoPessoa;
            lotação = lotação + 1;
            if (lotação > qtdMaxima) {
                System.out.println("A lotação maxima foi atingida. Aguarde o proximo elevador.");
            } else if (pesoTotal > cargaMaxima) {
                System.out.println("A vaga máxima do elevador foi atingida. Aguarde o proximo elevador.");
            } else {
                System.out.println("Entrada autorizada.");
            }

        }
    }
}
