import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double massa, velocidade, energia;

        System.out.println("Digite o valor da massa: ");
        massa = scanner.nextDouble();

        System.out.println("Digite o valor da velocidade: ");
        velocidade = scanner.nextDouble();

        energia =   (massa * Math.pow(velocidade, 2)) / 2;

        System.out.println("O valor da Energia Cinética é: " + energia);

        scanner.close();
    }
}
