import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Insira o valor da variável A:");
        a = scanner.nextDouble();

        System.out.println("Insira o valor da variável B:");
        b = scanner.nextDouble();

        System.out.println("Insira o valor da variável C:");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O valor do Delta é: " + delta);



        scanner.close();
    }
}
