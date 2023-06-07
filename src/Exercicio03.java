import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//3. Escreva um algoritmo que leia
// o número de identificação,
// as 3 notas obtidas por um aluno nas 3 verificações
// e a média dos exercícios que fazem parte da avaliação,
// e calcule a média de aproveitamento,
// usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
//A atribuição dos conceitos obedece a tabela abaixo.
// O algoritmo deve escrever
// o número do aluno,
// suas notas,
// a média dos exercícios,
// a média de aproveitamento,
// o conceito correspondente e
// a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
// Média de aproveitamento Conceito
// >= 90 A
// >= 75 e < 90 B
// >= 60 e < 75 C
// >= 40 e < 60 D
// < 40 E

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        List<Double> notasAluno = new ArrayList<>();
        double id=0.0;

        System.out.println("digite a identificacao do aluno");
            id = sc.nextDouble();
            notasAluno.add(id);

        for(int i=0;i<4;i++){
            if(i<3){
                System.out.println("digite a "+ (i+1)+ " nota do aluno");
            }else{
                System.out.println("digite a media dos exercicios");
            }
            notasAluno.add(sc.nextDouble());
        }
        double media=0.0;
        int i=1;
        media= (notasAluno.get(i) + (notasAluno.get(i+1) *2) +
                    (notasAluno.get(i+2) *3) + notasAluno.get(i+3))/7;

        String conceito;
        String mensagem;

        if (media>90){
            conceito = "A";
            mensagem ="Aprovado";
        }else if (media>=75 && media <90){
            conceito = "B";
            mensagem ="Aprovado";
        }else if (media>=60 && media <75){
            conceito = "C";
            mensagem ="Aprovado";
        }else if (media>=40 && media <60){
            conceito = "D";
            mensagem ="Reprovado";
        }else{
            conceito= "E";
            mensagem ="Reprovado";
        }
        System.out.println("=========Boletim==============");
        System.out.printf("identifcação do aluno: %.0f", notasAluno.get(0));
        System.out.println();
        System.out.printf("média do aluno: %.3f", media);
        System.out.println();
        System.out.println("conceito: "+conceito);
        System.out.println("mensagem: "+ mensagem);
    }
}