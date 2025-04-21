import java.util.Scanner;

public class item11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do emprestimo: ");
        double input = scanner.nextDouble();

        if (input >= 1000 && input <= 5000){
            System.out.println("O valor de " + input + " está autorizado para emprestimo.");
        } else {
            System.out.println("O valor de " + input + " não está na faixa autorizada para emprestimo.");
        }

    }
}
