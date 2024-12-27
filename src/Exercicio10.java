import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double varicaoEspaco, variacaoTempo, velocidade;

        System.out.println("Digite a variação do espaço: ");
        varicaoEspaco = scanner.nextDouble();

        System.out.println("Digite a variacao do tempo: ");
        variacaoTempo = scanner.nextDouble();

        velocidade = varicaoEspaco / variacaoTempo;

        System.out.println("A velocidade é: " + velocidade);


        scanner.close();
    }
}
