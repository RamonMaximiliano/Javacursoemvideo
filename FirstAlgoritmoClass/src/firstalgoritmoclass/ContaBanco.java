package firstalgoritmoclass;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual() {
        System.out.println("------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.saldo =50f;
        } else if (t == "CP") {
            this.saldo = 100f;
        }
        System.out.println("Conta ABERTA com sucesso!");
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta possui saldo!");
        } else if (this.saldo < 0) {
            System.out.println("Saldo negativo!");
        } else {
            this.setStatus(false);
        }
        System.out.println("Conta ENCERRADA com sucesso!");
    }

    public void depositar(float v) {
        if (this.status == true) {
            System.out.println(this.getSaldo());
            
            this.setSaldo(v);
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float v) {
        if (this.status == true) {
            if (this.saldo >= v) {
                this.setSaldo(this.saldo - v);
                System.out.println("Saldo de " + v + "realizado na conta!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensal() {
        float value = 0f;
        if (this.tipo == "CC") {
            value = 12f;
        } else if (this.tipo == "CP") {
            value = 20f;
        }
        if (this.status == true) {
            if (this.saldo > value) {
                setSaldo(getSaldo() - value);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
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

      public void setSaldo(float s) {
        this.saldo = getSaldo() + s;
    }
    
     public float getSaldo() {
        return this.saldo;
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

- Criar conta na classe principal 21 min

 */
