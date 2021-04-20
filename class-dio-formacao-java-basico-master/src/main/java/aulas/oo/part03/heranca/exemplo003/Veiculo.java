package aulas.oo.part03.heranca.exemplo003;

public class Veiculo {

    private String modelo;
    private String marca;

    private double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }

    public void cilindradaAltaOuBaixa(String cilindrada, String capaceteEspecial) {
        System.out.println("MOTO VELOZ");
    }

    public void cilindradaAltaOuBaixa(String cilindrada) {
        System.out.println("MOTO FRAQUINHA");
    }
}
