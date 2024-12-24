import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, media;

        System.out.println("Por favor, digite o primeiro numero:");
        a = teclado.nextDouble();;
        System.out.println("Por favor, digite o segundo numero:");
        b = teclado.nextDouble();

        media = (a + b) / 2;

        System.out.println("A média de a + b é: " + media);

        teclado.close();
    }
}
