import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double raio, perimetro;

        System.out.println("Digite o raio do circulo: ");
        raio = scanner.nextDouble();

        perimetro = 2 * (Math.PI * raio);

        System.out.println("O perímetro do raio é: " + perimetro);

        scanner.close();
    }
}
