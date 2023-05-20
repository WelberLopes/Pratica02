
/* Nome do Aluno: WELBER LOPES OLIVEIRA
* RA: 12723110547
* Nome do Programa:  Pratica02_04
*Descrição: 4. Faça um programa que leia o nome, o sobrenome, a idade, em 
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja 
visualizar dados completos?”. Se o caractere digitado pelo 
usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo 
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa 
deve imprimir “Digitação errada. Tente Novamente”.
* Data: 08/04/2023
*/
import java.util.Scanner;

public class Pratica02_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("Digite a cidade em que você nasceu: ");
        String naturalidade = input.nextLine();
        System.out.println("Digite a sua idade em anos (YY): ");
        int idade = input.nextInt();

        System.out.println("Deseja visualizar dados completos? (S/N)");
        char resposta = input.next().charAt(0);

        input.close();

        if (resposta == 'S') {
            System.out.println("------------Cadastro completo:---------------");
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome : " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade : " + naturalidade);
            System.out.println("---------------------------------------------");
        } else if (resposta == 'N') {
            System.out.println("----------------------------------------------");
            System.out.println("Dados resumidos:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("Digitação errada, tente novamente.");
        }
    }
}