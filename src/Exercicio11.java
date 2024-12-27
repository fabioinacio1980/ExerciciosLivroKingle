import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, ladoC, altura, perimetro, area;

        System.out.println("Digite o valor do lado A:");
        ladoA = scanner.nextDouble();

        System.out.println("Digite o valor do lado B:");
        ladoB = scanner.nextDouble();

        System.out.println("Digite o valor do lado C:");
        ladoC = scanner.nextDouble();

        System.out.println("Digite o valor da altura:");
        altura = scanner.nextDouble();

        perimetro = ladoA + ladoB + ladoC;

        area = (ladoB * altura) / 2;

        System.out.println("O valor do perímetro do triângulo é: " + perimetro);
        System.out.println("O valor da área do triângulo é: " + area);

        scanner.close();
    }
}
