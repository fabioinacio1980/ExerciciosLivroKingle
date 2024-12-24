import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, c, media;

        System.out.println("Por favor, digite o primeiro numero");
        a = teclado.nextDouble();
        System.out.println("Por favor, digite o segundo numero");
        b = teclado.nextDouble();
        System.out.println("Por favor, digite o terceiro numero");
        c = teclado.nextDouble();

        media = (a + b + c) / 3;

        System.out.println("A média dos numero a, b, c é: " + media);

        teclado.close();
    }
}
