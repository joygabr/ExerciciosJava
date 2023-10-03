package EstruturaRepeticao;

public class Exercicio1 {
    public static void main(String[] args){
        String[] professores = {"Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"};

        for(int contador = 0; contador < professores.length; contador++){
            System.out.printf("\nO índice atual é %d", contador);

            if(contador == 0){
                System.out.printf("\nO número de índice do(a) professor(a) %s é Zero.\n", professores[contador]);
            }else if(contador % 2 == 0){
                System.out.printf("\nO número de índice do(a) professor(a) %s é Par.\n", professores[contador]);
            }else{
                System.out.printf("\nO número de índice do(a) professor(a) %s é Ímpar.\n", professores[contador]);
            }
        }
    }
}