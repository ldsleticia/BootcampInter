package aulas.oo.part02.construtores.exemplo001;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

       Pessoa eu = new Pessoa("Letícia", 16, 04, 1996);
       eu.setNome("Letícia dos Santos");
       System.out.println(eu.getNome());

    }

}
