import java.util.Scanner;

public class item09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100){
            System.out.println("Desconto de 10% aplicado.");
            valorCompra -= valorCompra * 0.1;
            System.out.println("Valor final da compra: " + valorCompra);
        } else {
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor final da compra: " + valorCompra);
        }

    }
}
