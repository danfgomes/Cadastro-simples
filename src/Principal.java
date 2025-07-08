import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        Cliente cliente1 = new Cliente();
        cliente1.setNome(scanner.nextLine());
        System.out.println("Digite seu cpf:");
        cliente1.setCpf(scanner.nextLine());
        System.out.println("Digite email:");
        cliente1.setEmail(scanner.nextLine());
        System.out.println("Digite sua senha:");
        cliente1.setSenha(scanner.nextLine());
        cliente1.validarAcesso();

        if (cliente1.acesso) {
            System.out.println("✅ Cadastro concluído com sucesso!");
        } else {
            System.out.println("❌ Cadastro inválido. Corrija os erros acima.");
        }



    }
}