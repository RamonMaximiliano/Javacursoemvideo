
package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        
        //PROGRAMA PRINCIPAL
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
           
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("java Course");
        
        System.out.println(p1.toString());        
        System.out.println(p2.toString());        
        System.out.println(p3.toString());        
        System.out.println(p4.toString());    
        System.out.println(p2.getCurso());
    }
}