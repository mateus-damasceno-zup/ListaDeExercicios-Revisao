import java.util.Random;
import java.util.Scanner;

//4. Leia a idade de 20 pessoas e exiba a média das idades.
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int idade=0;
        int soma = 0;
        for(int i=0;i<20;i++){
            System.out.println("digite a idade");
           // idade = sc.nextInt();
            idade = random.nextInt(100);
            System.out.println(idade);
            soma +=idade;

        }
        double media = (double) soma /20;

        System.out.println("media das idades: "+ media);
    }
}
