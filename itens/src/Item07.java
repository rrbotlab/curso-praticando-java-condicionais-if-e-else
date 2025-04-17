import java.util.Scanner;

public class Item07 {
    public static void main(String[] args) {
        String senha = "Xpto925#";

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals(senha)) {
            System.out.print("Digite a senha: ");
            input = scanner.next();
            if (input.equals(senha))
                System.out.println("Acesso permitido!");
            else
                System.out.println("Acesso negado!");
        }
    }
}
