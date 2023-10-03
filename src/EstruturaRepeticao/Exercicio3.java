package EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número: ");
            numero = ler.nextInt();

            if(numero != 0){
                System.out.println("Errou");
            }
        }while(numero != 0);

        System.out.println("Acertou");
    }
}
