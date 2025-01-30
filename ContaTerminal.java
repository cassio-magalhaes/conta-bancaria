import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, cliente;
        float saldo;

        System.out.println("Por favor, digite o número da conta !");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        cliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                cliente, agencia, numero, saldo);

        sc.close();
    }
}
