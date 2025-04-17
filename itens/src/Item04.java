import java.util.Scanner;

public class Item04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int numero = scanner.nextInt();
        System.out.println(numero);
        scanner.close();
    }
}
