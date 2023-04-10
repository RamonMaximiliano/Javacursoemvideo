
package canetapreta;
public class CanetaPreta {
    
    public static void main(String[] args) {
        /* Estanciando a classe caneta 1*/
        Caneta c1 = new Caneta();
        c1.tampada = false;
        c1.cor = "verde";
        c1.modelo = "bic";
        c1.ponta = 1.5f;
        c1.carga = 10;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        /* Estanciando a classe caneta 2*/
        Caneta c2 = new Caneta();
        c2.tampada = true;
        c2.cor = "Azul";
        c2.modelo = "Flex";
        c2.ponta = 2.6f;
        c2.carga = 8;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}


