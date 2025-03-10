package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int tempoDeEpisodio;

    public Serie (String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public float getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    public void setTempoDeEpisodio(int tempoDeEpisodio) {
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * tempoDeEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: "+this.getNome()+
                " ("+this.getAnoDeLancamento()+")";
    }
}
