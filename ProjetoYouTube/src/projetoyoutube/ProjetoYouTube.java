package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {

        //criando um vetor
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de PHP");
        v[2] = new Video("Aula 10 de HTML 5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Junior", 22, "M", "juniorguy");
        g[1] = new Gafanhoto("Dude", 30, "M", "dudeguy");
         
        Visualizacao vis = new Visualizacao(g[0],v[0]);
        Visualizacao vis2 = new Visualizacao(g[0],v[1]);
       
        System.out.println("-----------------------------------------");
        System.out.println("VIDEOS:\n=============================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("-----------------------------------------");
        System.out.println("GAFANHOTOS:\n=============================");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        System.out.println("-----------------------------------------");
        System.out.println("VISUALIZAÇÃO:\n=============================");
        System.out.println(vis.toString());
        System.out.println(vis2.toString());
    }
}
