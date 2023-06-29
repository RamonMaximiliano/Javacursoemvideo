package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        
        //criando um vetor
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de PHP");
        v[2] = new Video("Aula 10 de HTML 5");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

    }

}
