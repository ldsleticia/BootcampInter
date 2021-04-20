package aulas.oo.exercicio;

public class Gol {
    public static void main(String[] args){
        Carro carro = new Carro("Ford", "Focus", "GSI", 2021);
        carro.setMarca("Volkswagen");
        carro.setModelo("Gol");
        carro.setAno(2222);
        carro.setVariante("GSI");



//        System.out.println(carro.getMarca());
//        System.out.println(carro.getModelo());
//        System.out.println(carro.getVariante());
//        System.out.println(carro.getAno());

        System.out.println(carro.toString());
    }
}
