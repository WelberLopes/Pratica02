
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_16

*Descrição: Faça um programa que solicite ao usuário que digite um 
número até que ele digite um número menor que 0 (utilize 
while)

* Data: 09/04/2023
*/
import java.util.Scanner;

public class Pratica02_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num >= 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
        }
        sc.close();
    }
}
