import java.util.Scanner;

//1. Faça um algoritmo que leia dois valores inteiros A e B
// se os valores forem iguais deverá se somar os dois,
// caso contrário multiplique A por B.
// Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma
// variável C e mostrar seu conteúdo na tela.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;

        System.out.println("digite um numero ");
            a = sc.nextInt();
        System.out.println("digite outro numero");
        b = sc.nextInt();

        if(a==b){
            c= a+b;
        }else{
            c= a*b;
        }
        System.out.println("resposta de c: "+c);
    }
}
