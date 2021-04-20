package aulas.oo.exercicio;

public class Carro {
    private String marca;
    private String modelo;
    private String variante;
    private int ano;

    public Carro(String marca, String modelo, String variante, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.variante = variante;
        this.ano = ano;
    }

    public Carro(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", variante='" + variante + '\'' +
                ", ano=" + ano +
                '}';
    }
}
