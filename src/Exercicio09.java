//9. Crie um vetor capaz de armazenar 50 números inteiros.
// Em seguida faça o seu preenchimento automático com os números de 101 a 150,
// ou seja, na posição número 0 ponha 101, na posição 1 ponha o número 102,
// e assim sucessivamente. Em seguida exiba os valores deste vetor.
public class Exercicio09 {
    public static void main(String[] args) {
        int[] vetor =new int[50];

        for (int i=0;i<50;i++){
            vetor[i]=101 +i;
        }

      for(int i =0; i<vetor.length;i++){
          System.out.println("vetor["+i+"] = "+vetor[i]);
      }

    }
}
