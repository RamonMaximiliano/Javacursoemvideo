package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador L1 = new Lutador("Namaste", "França", 35, 1.85f, 85f, 15, 2, 1);

        //variavel declarada em format vetor
        Lutador l[] = new Lutador[2];

        l[0] = new Lutador("John", "Brasil", 29, 1.65f, 60f, 18, 1, 0);
        l[1] = new Lutador("Roger", "EUA", 25, 1.61f, 69f, 10, 0, 1);

        l[0].status();
        System.out.println("APRESENTAR");
        l[0].apresentar();
        System.out.println("--------------------------");
        l[1].status();
        System.out.println("APRESENTAR");
        l[1].apresentar();
        System.out.println("--------------------------");
        L1.status();
        System.out.println("APRESENTAR");
        L1.apresentar();
    }
};
