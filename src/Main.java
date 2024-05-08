import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bem-vindo ao ContaBanco!");
        System.out.println("Informe seus dados cadastrais abaixo para criar a sua conta bancária conosco:");

        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Conta!");
        conta.setNumero(scan.nextInt());

        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scan.next());

        System.out.println("Por favor, digite o Nome do Cliente!");
        conta.setNomeCliente(scan.next());

        System.out.println("Por favor, digite o valor do Saldo!");
        conta.setSaldo(scan.nextFloat());

        System.out.println(conta.imprimirDadosConta());
    }
}