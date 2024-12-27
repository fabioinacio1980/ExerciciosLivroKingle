import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double raio, altura, area, volume;

        System.out.println("Informe o valor do raio do cilindro: ");
        raio = scanner.nextDouble();

        System.out.println("Informe o valor da altura do cilindo: ");
        altura = scanner.nextDouble();

        area = 4 * (Math.PI * Math.pow(raio, 2));

        volume = 4 / (3 * (Math.PI * Math.pow(raio, 3)));

        System.out.println("A área da esfera é: " + area);
        System.out.println("O volume da esfera é: " + volume);


        scanner.close();
    }
}
