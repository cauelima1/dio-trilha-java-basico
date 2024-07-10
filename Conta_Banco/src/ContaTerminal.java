import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo, entre com o número de sua conta");
        int conta = scanner.nextInt();

        System.out.println("Agora, entre com o numero de sua agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Agora digite o seu saldo em conta: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", número da conta " + conta + ". Seu saldo de R$" 
        + saldo +" já está disponível para saque.");
       
    }
}
