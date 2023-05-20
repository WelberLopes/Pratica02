
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_06

*Descrição: Faça um programa calcula o total de uma hospedagem em um 
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:

R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.

* Data: 09/04/2023
*/
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Pratica02_7 {
    public static void main(String[] args) throws Exception {
        double diaria = 60.00;
        Scanner sc = new Scanner(System.in);

        System.out.println("-------HOTEL SOLARIS---------");
        System.out.println("Quantas diarias pretende de hospedar: ");
        int Ndiarias = sc.nextInt();
        double opcao1 = (Ndiarias * diaria) + (Ndiarias * 5.50);
        double opcao2 = (Ndiarias * diaria) + (Ndiarias * 6.00);
        double opcao3 = (Ndiarias * diaria) + (Ndiarias * 8.00);
        if (Ndiarias <= 0) {
            System.out.println("Isso não faz parte dos nossos pacotes de hospedagem.");
        } else if (Ndiarias < 15) {
            System.out.println("O valor  total da sua estadia será: R$ " + opcao3);
        } else if (Ndiarias == 15) {
            System.out.println("O valor  total da sua estadia será: R$ " + opcao2);
        } else if (Ndiarias > 15) {
            System.out.println("O valor  total da sua estadia será: R$ " + opcao1);
        }
    }
}
