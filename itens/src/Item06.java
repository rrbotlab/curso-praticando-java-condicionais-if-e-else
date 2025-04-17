import java.util.Scanner;

public class Item06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 99 para sair");
        double media = 0;

        while (media != 99){
            System.out.print("Digite a média do aluno : ");
            media = scanner.nextDouble();

            if (media >= 7)
                System.out.println("O estudante teve média " + media + " e foi aprovado.");
            else if (media >= 5)
                System.out.println("O estudante teve média " + media + " e está de recuperação.");
            else
                System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }
    }
}
