Código de apoio

Caso precise, ao longo dos exercícios ler dados de entrada do 
usuário, podemos utilizar mecanismos como Scanner para capturar 
os valores digitados no teclado. Isso torna os programas mais 
interativos e permite testar diferentes cenários sem modificar 
o código. Por exemplo, para ler um número digitado pelo usuário 
faríamos:

```
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();
scanner.close();
```
Já se precisar comparar variáveis, podemos utilizar o método 
equals, que é responsável por comparar o conteúdo das strings. 
Isso é bem importante, pois o operador == compara referências, 
enquanto equals compara o valor real. Exemplo:
```
String a = "Java";
String b = "Java";
if(a.equals(b)) {
System.out.println("As Strings são iguais");
}
```
Após finalizar todos os desafios, não esqueça de compartilhar 
sua solução no fórum. Será incrível ver como você resolveu! 
Vamos nessa?
