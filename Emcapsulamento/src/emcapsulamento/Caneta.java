package emcapsulamento;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Esta caneta esta tampada? " + this.tampada);
        System.out.println("Esta caneta é da cor: " + this.cor);
    }
    public void rabiscar() {
        if (tampada == true) {
            System.out.println("E possivel escrever");
        } else {
            System.out.println("Não e possivel escrever");
        }
    };
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
}
