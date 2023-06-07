package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        System.out.println("Hello there!");

        //Instanciando as classes usando vetores pra instanciar mais de um ao mesmo tempo
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Learning Java", "Joseph Of US", 250, p[1]);
        l[2] = new Livro("Aprendre Java", "Jean Pérre", 350, p[1]);
        
        l[0].folhear(154);
        l[0].avancarPag();

        System.out.println(l[0].toString());
        System.out.println("===========================");
        System.out.println(l[1].toString());
    }
}
