import java.util.Scanner;

public class Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite  o dia da semana (em letras minúsculas, ex: quinta): ");
        String input = scanner.next();

        switch (input) {
            case "domingo":
            case "sabado":
            case "sábado":
                System.out.println(input + " não é um dia útil.");
                break;
            case "segunda":
            case "terça":
            case "terca":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println(input + " é um dia útil.");
                break;
            default:
                System.out.println(input + " não é uma entrada válida.");
                break;
        }



    }
}
