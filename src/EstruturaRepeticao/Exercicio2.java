package EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String senha;

        do{
            System.out.print("Digite a senha: ");
            senha = ler.nextLine();

            if(!senha.equals("123")){
                System.out.println("Senha incorreta!");
            }
        }while(!senha.equals("123"));

        System.out.println("Senha correta!");
    }
}
