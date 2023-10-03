package EstruturaCondicao;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Digite a primeira nota: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = Double.parseDouble(leitor.next());
        media = (n1 + n2)/2;

        if(media > 6){
            System.out.println("PARABÉNS!");
        }else{
            System.out.println("REPETIU!");
        }
    }
}
