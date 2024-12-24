import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, c, media;

        System.out.println("Por favor, digite o primeiro numero");
        a = teclado.nextDouble();
        System.out.println("Por favor, digite o segundo numero");
        b = teclado.nextDouble();
        System.out.println("Por favor, digite o terceiro numero");
        c = teclado.nextDouble();

        media = Math.pow((a * b * c), (1.0/3.0));

        System.out.println("A média geometrica de a, b, c é: " + media);

        teclado.close();
    }
}
