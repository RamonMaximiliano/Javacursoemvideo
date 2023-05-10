package ultraemojicombat;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float altura;
    private float peso;

    //métodos
    public void apresentar() {
    }

    ;
    
    public void ganharLuta() {
    }

    ;

    public void perderLuta() {
    }

    public void empatarLuta() {
    }

    //método construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }
;
}
