package projetoescola;

public class ProjetoEscola {

    public static void main(String[] args) {

        System.out.println("Hello there!");

        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(27);
        v1.setSexo("M");
        System.out.println(v1.toString());
  }
}
