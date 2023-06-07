import java.util.Random;
import java.util.Scanner;

//5. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero=0;
       int frequencia=0;
        for(int i=0;i<20;i++){
            System.out.println("numero: ");
            // idade = sc.nextInt();
            numero = random.nextInt(1000);
            System.out.println(numero);

            if( numero >0 && numero<100){
                frequencia++;
            }

        }
        System.out.println("a quantidade de números entre 0 e 100 são "+frequencia);
    }
}
