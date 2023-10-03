package EstruturaCondicao;
import java.util.Scanner;
import java.time.LocalDate;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        int anoAtual, anoNascimento,idade;

        anoAtual = dataAtual.getYear();

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = ler.nextInt();

        idade = anoAtual - anoNascimento;

        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }
    }
}
