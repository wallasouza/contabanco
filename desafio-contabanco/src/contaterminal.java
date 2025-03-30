import java.util.Locale;
import java.util.Scanner;

public class contaterminal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja Bem-vindo ao terminal de criacao de conta do banco Bradesco");

        System.out.println("Digite as informaces do cliente abaixo");
        System.out.println("Por favor, digite o numero da agencia: ");
        int numeroAgencia = entrada.nextInt();

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Por favor, digite o nome do cliente completo:");
        String nomeCliente = entrada.nextLine();
       
        //entrada.nextLine();
        System.out.println("Digite o depósito inicial (ou digite 0 se não houver):");

        double saldoCliente;
        if (entrada.hasNextDouble()) { // Verifica se a entrada é um número
             saldoCliente = entrada.nextDouble();
            System.out.println("Saldo inicial: " + saldoCliente);
        } else {
            System.out.println("Entrada inválida. Vai ser definido como 0 ");
            saldoCliente = 0;
        }

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "  + saldoCliente + " já está disponível para saque.");

        entrada.close();
    }
}
