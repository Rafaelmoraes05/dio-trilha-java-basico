import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String Agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        String numero = scanner.nextLine();


        System.out.print("Por favor, digite o saldo inicial: ");
        String saldoInicial = scanner.nextLine();

        scanner.close();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(Agencia)
                .concat(", sua conta é ")
                .concat(numero)
                .concat(", e seu saldo de ")
                .concat(saldoInicial)
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}