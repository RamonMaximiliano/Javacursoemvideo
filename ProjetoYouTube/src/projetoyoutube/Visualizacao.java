package projetoyoutube;

public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //MÉTODO DE AVALIAÇÃO 1
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    //MÉTODO DE AVALIAÇÃO 2
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    //MÉTODO DE AVALIAÇÃO 3
    public void avaliar(float porc) {
        int tot = 0;
     if(porc <=50 && porc >= 1){
         tot = 5;
     } else if (porc >= 50 && porc <= 99){
          tot = 9;
     } else {
         tot = 10;
     }
     this.filme.setAvaliacao(tot);
    }

    
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{\n" + "Espectador: " + espectador + "\nFilme: " + filme + '}';
    }
}
