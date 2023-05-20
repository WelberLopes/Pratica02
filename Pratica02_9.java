
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_9

*Descrição: Faça um programa que receba o valor da venda, escolha a 
condição de pagamento no menu e mostre o total da venda final 
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%

* Data: 09/04/2023
*/
import java.util.*;

public class Pratica02_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" C A I X A");

        System.out.println("Digite o valor da venda: ");

        double valorVenda = sc.nextDouble();

        System.out.println("Escolha o número correspondente a forma de pagamento: ");

        System.out.println(
                " 1 - a Vista. \n 2 - a Prazo 30d. \n 3 - a Prazo 60d. \n 4 - a Prazo 90d.  \n 5 - Débito. \n 6 - Crédito.");
        int escolha = sc.nextInt();

        String metodoescolhido = escolhaPag(escolha);

        double avista = valorVenda - (valorVenda * 10 / 100);
        double aPrazo30 = valorVenda - (valorVenda * 5 / 100);
        double aPrazo60 = valorVenda;
        double aPrazo90 = valorVenda + (valorVenda * 5 / 100);
        double debito = valorVenda - (valorVenda * 8 / 100);
        double credito = valorVenda - (valorVenda * 7 / 100);

        System.out.println(" C O N C L U I N D O - V E N D A");
        System.out.println("");
        System.out.println("A forma de pagamento ecolhida foi: " + metodoescolhido);
        System.out.println("");

        if (escolha < 1 || escolha > 6) {
            System.out.println(
                    "Escolha incorreta. Certifique que esteja digitando um número que corresponda á uma das opções. Tente novamente!");

        } else if (escolha == 1) {
            System.out.println("O valor da compra a Vista fica: R$" + avista);
        } else if (escolha == 2) {
            System.out.println("O valor da compra a Prazo em 30 dias fica: R$" + aPrazo30);
        } else if (escolha == 3) {
            System.out.println("O valor da compra a Prazo em 60 dias fica: R$" + aPrazo60);
        } else if (escolha == 4) {
            System.out.println("O valor da compra a Prazo em 90 dias fica: R$" + aPrazo90);
        } else if (escolha == 5) {
            System.out.println("O valor da compra com Cartão de Débito fica: R$" + debito);
        } else if (escolha == 6) {
            System.out.println("O valor da compra com Cartão de Crédito fica: R$" + credito);
        }

    }

    public static String escolhaPag(int escolha) {
        if (escolha == 1) {
            return "aVista";
        } else if (escolha == 2) {
            return "aPrazo30dias";
        } else if (escolha == 3) {
            return "aPrazo60dias";
        } else if (escolha == 4) {
            return "aPrazo90dias";
        } else if (escolha == 5) {
            return "Débito";
        } else if (escolha == 6) {
            return "Crédito";
        } else {
            return "Indeterminado";
        }

    }
}
