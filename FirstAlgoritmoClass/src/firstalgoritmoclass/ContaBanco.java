package firstalgoritmoclass;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void abrirConta() {
    }

    public void fecharConta() {
    }

    public void depositar() {
    }

    public void sacar() {
    }

    public void pagarMensal() {
    }

    //Métodos especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;

    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String Dono) {
        this.dono = Dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = getSaldo() + s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean f) {
        this.status = f;
    }
}


/*
https://www.youtube.com/watch?v=hOC461osYgk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=11&ab_channel=CursoemV%C3%ADdeo
*/


