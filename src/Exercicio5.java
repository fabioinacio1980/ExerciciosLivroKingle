import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite seu peso, em quilogramas");

        peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros");
        altura = scanner.nextDouble();

        imc = peso * (altura * altura);

        System.out.println("O IMC é igual a: " + imc);



        scanner.close();
    }
}
