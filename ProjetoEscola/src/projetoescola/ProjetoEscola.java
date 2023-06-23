package projetoescola;

public class ProjetoEscola {

    public static void main(String[] args) {

        System.out.println("Hello there!");

        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(27);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("=================================");
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(123456);
        a1.setCurso("Informática");
        a1.setIdade(26);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("Nome: " + a1.getNome() + " Matricula: " + a1.getMatricula() + " Curso: " + a1.getCurso());
        System.out.println("=================================");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(321654);
        b1.setNome("Jubileu");
        b1.setBolsa(123.456f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println("Nome: " + b1.getNome() + " Matricula: " + b1.getMatricula() + " Curso: " + b1.getBolsa());

    }
}
