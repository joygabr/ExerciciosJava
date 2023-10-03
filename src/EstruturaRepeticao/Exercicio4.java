package EstruturaRepeticao;

public class Exercicio4 {
    public static void main(String[] args){
        double salario = 1000;

        while(salario < 5000){
            salario += 100;

            if(salario == 5000){
                break;
            }

            System.out.printf("\nO salário ainda é R$%.2f", salario);
        }
        System.out.printf("\nO salário final é R$%.2f", salario);
    }
}
