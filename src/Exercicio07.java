import java.util.Scanner;

//7. Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int n;
        System.out.println("digite um nome");
        nome = sc.next();
        System.out.println("digite um numero ");
        n = sc.nextInt();

        for (int i=0; i<n;i++){
            System.out.println(nome);
        }
    }
}
