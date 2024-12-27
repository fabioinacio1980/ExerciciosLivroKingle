import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double trabalho, forca, distancia;

        System.out.println("Informe o valor da força: ");
        forca = scanner.nextDouble();

        System.out.println("informe o valor da distância: ");
        distancia = scanner.nextDouble();

        trabalho = forca * distancia;

        System.out.println("O valor do Trabalho é: " + trabalho);

        scanner.close();
    }
}
