import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//8. Leia um conjunto de salários,
// sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste.
// Em seguida exiba todos os salários já reajustados.
public class Exercicio08 {
    public static void main(String[] args) {
        List<Double> salarios = new ArrayList<>();
        List<Double> salariosReajustado = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double entrada=0.0;
        int i=0;
        boolean flag = true;
        while(flag){

            System.out.println("digite os salarios, digite -1 para sair");
            entrada = sc.nextDouble();


            if(entrada >=0){
                salarios.add(entrada);
            }else{
                flag=false;
            }
        }

        System.out.println("digite o reajuste salarial em inteiro " +
                "(por exemplo: reajuste de 3% digite 3) ");
        double reajuste = sc.nextDouble();

        for (int j=0;j<salarios.size();j++){
            salariosReajustado.add(salarios.get(j) * (1+ (reajuste/100)));
        }
        System.out.println("salario reajustado"+ salariosReajustado);
    }
}
