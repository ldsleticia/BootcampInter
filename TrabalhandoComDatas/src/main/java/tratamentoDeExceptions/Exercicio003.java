package tratamentoDeExceptions;
import java.util.Scanner;

public class Exercicio003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 0; i <= num; i = i++) {
            if(i % 2 == 1){
                System.out.println(i);//complete seu codigo aqui
            }
//            System.out.println(i);
        }
    }

}