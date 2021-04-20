package br.com.dateutils.fromjava8utils;
import java.time.LocalDate;

public class Exemplo001 {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
    }
}
