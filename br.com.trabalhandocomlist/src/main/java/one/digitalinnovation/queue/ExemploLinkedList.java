package one.digitalinnovation.queue;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args){
        Queue<String> filaDeBanco = new LinkedList<>();
        filaDeBanco.add("Amanda");
        filaDeBanco.add("Venancio");
        filaDeBanco.add("ZubuMafu");
        filaDeBanco.add("Jailson");

        System.out.println(filaDeBanco);

        String clienteAtendido = filaDeBanco.poll();
        String primeiroCliente = filaDeBanco.peek();
        String elementos = filaDeBanco.element();

        System.out.println(clienteAtendido);
        System.out.println(filaDeBanco);
        System.out.println(primeiroCliente);
        System.out.println(elementos);
    }
}

/*
 *O método pol() retorna a cabeça da fila(primeiro item) e ao rodar novamente, esse item não existe mais
 * O método peek() retorna a fila mas não remove nenhum item. Caso a fila esteja vazia, retorna null;
 * O método element() retorna o primeiro item da lista mas não remove nada. Caso a lista esteja vazia,
    ele retorna uma exeption;
 */
