import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, perimetro, area;

        System.out.println("Digite o valor da largura: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o valor do comprimento: ");
        comprimento = scanner.nextDouble();

        perimetro = 2 * (largura + comprimento);

        area = largura * comprimento;

        System.out.println("O valor do perímetro é: " + perimetro);

        System.out.println("O valor da área é: " + area);

        scanner.close();
    }
}
