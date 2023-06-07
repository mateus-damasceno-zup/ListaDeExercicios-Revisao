import java.util.Scanner;

//2. Faça um algoritmo que leia uma variável e
// some 5 caso seja par ou
// some 8 caso seja ímpar,
// imprimir o resultado desta operação.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variavel =0;
        int resposta=0;
        System.out.println("digite um numero");
        variavel = sc.nextInt();

        if (variavel%2==0){
            resposta= variavel +5;
        }else{
            resposta = variavel +8;
        }

        System.out.println("resposta: "+ resposta);
    }
}
