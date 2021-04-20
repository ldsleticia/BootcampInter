package br.com.dateutils.dateformatclass;
import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args){
        Date agora = new Date();

        String datetoStr = DateFormat.getInstance().format(agora);

        System.out.println(datetoStr);

        datetoStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);

        System.out.println(datetoStr);
    }
}
