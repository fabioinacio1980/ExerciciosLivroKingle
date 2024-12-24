import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a, b, soma, mult, subt, divi;

        System.out.println("Por favor, digite o primeiro numero inteiro:");
        a = teclado.nextInt();
        System.out.println("Por favor, digite o segundo numero inteiro:");
        b = teclado.nextInt();
        soma = a + b;
        subt = a - b;
        mult = a * b;
        divi = a / b;

        System.out.println("A soma de a + b e: " + soma);
        System.out.println("A subtração de a - b e: " + subt);
        System.out.println("A multiplicação de a * b e: " + mult);
        System.out.println("A divisao de a por b e: " + divi);



        teclado.close();
    }
}
