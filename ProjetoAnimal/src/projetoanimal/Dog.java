package projetoanimal;

public class Dog extends Mamifero {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
    
    // Polimorfismo de Sobreposição
    public void reagir(String comando){
        if(comando == "Late"){
            System.out.println("Au au");
        } else if (comando == "Quieto"){
            System.out.println("Não fez nada");
        }
    }
    
    public void reagir(String comida, int quant){
        if(comida == "Biscoito" && quant > 0){
            System.out.println("Abana o rabo e late!");
        }
    
    }  
    
}
