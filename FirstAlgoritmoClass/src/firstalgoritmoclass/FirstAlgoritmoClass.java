
package firstalgoritmoclass;

public class FirstAlgoritmoClass {


    public static void main(String[] args) {
        System.out.println("Hello there!");
        
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(111);
        c1.setDono("Luis");
        c1.abrirConta("CP");
        c1.depositar(100);
        c1.estadoAtual();
        

    }
    
}
