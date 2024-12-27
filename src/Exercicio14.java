import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x, y, x1, y1, distancia;

        System.out.println("Informe o valor do ponto X:");
        x = scanner.nextDouble();

        System.out.println("Informe o valor do ponto Y:");
        y = scanner.nextDouble();

        System.out.println("Informe o valor do ponto X1:");
        x1 = scanner.nextByte();

        System.out.println("Informe o valor do ponto Y1:");
        y1 = scanner.nextDouble();

        distancia = Math.sqrt(Math.pow(x - y, 2) + Math.pow(x1 - y1, 2));

        System.out.println("O valor da distância entre os pontos é: " + distancia);
    }
}
