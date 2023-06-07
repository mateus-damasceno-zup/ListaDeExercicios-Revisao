import java.util.Random;

//6. Escreva um algoritmo que leia uma sequência de números do usuário e
// realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.
public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();

        double numero=0.0;
        double soma=0;
        boolean flag=true;
        while(flag){
            numero = random.nextInt();
            System.out.println(numero);
            if(numero >=0){
                soma +=numero;
            }else{
               flag=false;
            }
        }

            System.out.println("soma dos numeros digitados "+ soma);

    }
}
