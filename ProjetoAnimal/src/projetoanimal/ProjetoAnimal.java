package projetoanimal;

public class ProjetoAnimal {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Dog d = new Dog();

        m.setPeso(35.3f);
        m.setCorPelo("Marron");
        m.setName("Boi");
        System.out.println("====== " + m.getName() + " ==============");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        d.setPeso(10f);
        d.setCorPelo("Preto");
        d.setName("Tobby");
        System.out.println("====== " + d.getName() + " ==============");
        d.alimentar();
        d.locomover();
        d.reagir("Late");
        
        d.setPeso(20f);
        d.setCorPelo("Branco");
        d.setName("Brutus");
        System.out.println("====== " + d.getName() + " ==============");
        d.alimentar();
        d.locomover();
        d.reagir("Quieto");
        
        d.setPeso(30f);
        d.setCorPelo("Marron");
        d.setName("Lessie");
        System.out.println("====== " + d.getName() + " ==============");
        d.alimentar();
        d.locomover();
        d.reagir("Biscoito",5);

        System.out.println("------------------------");
        a.setPeso(10.3f);
        a.setCorPena("Azul");
        a.setName("Canário");
        System.out.println("====== " + a.getName() + " ==============");
        a.alimentar();
        a.locomover();
        a.emitirSom();

        System.out.println("------------------------");
        p.setPeso(5.3f);
        p.setCorEscama("Verde");
        p.setName("Tubarão");
        System.out.println("====== " + p.getName() + " ==============");
        p.alimentar();
        p.locomover();
        p.emitirSom();

        System.out.println("------------------------");
        r.setPeso(2.3f);
        r.setCorEscama("Amarelo");
        r.setName("Jacaré");
        System.out.println("====== " + r.getName() + " ==============");
        r.alimentar();
        r.locomover();
        r.emitirSom();
    }
}
