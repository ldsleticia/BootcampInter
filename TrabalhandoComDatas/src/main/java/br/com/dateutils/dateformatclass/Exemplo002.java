package br.com.dateutils.dateformatclass;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args){
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS:mmm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
