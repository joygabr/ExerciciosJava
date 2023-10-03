package EstruturaCondicao;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String senha, usuario;

        System.out.print("Digite o nome de usuário: ");
        usuario = ler.nextLine();
        System.out.print("Digite a senha: ");
        senha = ler.nextLine();

        if(usuario.equals("admin") && senha.equals("senha123")){
            System.out.println("Login bem-sucedido!");
        }else{
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }
}
