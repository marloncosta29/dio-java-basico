import java.util.Locale;
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da conta:");
        Integer numero = scanner.nextInt();
        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.next();
        System.out.println("Digite o nome do cliente:");
        String cliente = scanner.next();
        System.out.println("Informe o saldo da conta:");
        Double saldo = scanner.nextDouble();
        scanner.close();
        String texto = "Olá " + cliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.";
        System.out.println(texto);
    }
}
