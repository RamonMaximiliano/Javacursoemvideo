
package methodsclass;

public class Caneta {
    public String modelo;
    private float ponta;
    public String cor;
    
    public Caneta(String m, String c, float p){
    this.modelo = m;
    this.cor = c;
    this.ponta = p;
    }    
    
    public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String m){
    this.modelo = m;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    public float getPonta(){
    return this.ponta;
    }
    public void setPonta(float p){
    this.ponta = p;
    }
    
    public void status(){
        System.out.println("Esta caneta é: " + this.modelo);
        System.out.println("A ponta dela é: " + this.ponta);
        System.out.println("A cor dela é: " + this.cor);
        System.out.println("Esta caneta é " + this.getModelo());    
        System.out.println("------------------------------");
        
    }
}




