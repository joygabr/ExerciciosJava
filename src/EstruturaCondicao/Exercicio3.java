package EstruturaCondicao;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero;
        String dia = null;

        System.out.print("Digite um número de 1 a 7: ");
        numero = ler.nextInt();

        switch(numero){
            case 1:
                dia = "segunda-feira";
                break;
            case 2:
                dia = "terça-feira";
                break;
            case 3:
                dia = "quarta-feira";
                break;
            case 4:
                dia = "quinta-feira";
                break;
            case 5:
                dia = "sexta-feira";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        System.out.printf("O número %d corresponde a %s.", numero, dia);
    }
}
