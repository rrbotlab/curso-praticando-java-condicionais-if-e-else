import java.util.Scanner;

public class Item05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Digite 999 para sair");

        while (input != 999) {
            System.out.print("Digite um numero: ");
            input = scanner.nextInt();
            System.out.print("O numero " + input);

            if (input % 2 == 0)
                System.out.println(" é par.");
            else
                System.out.println(" é impar.");
        }
    }
}
