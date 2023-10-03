package EstruturaCondicao;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número e descubra se é positivo ou negativo: ");
        numero = ler.nextInt();

        if(numero > 0){
            System.out.println("POSITIVO");
        }else if(numero < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NEUTRO");
        }
    }
}
